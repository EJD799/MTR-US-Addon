package org.mtrus.render;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.EntityModelExtension;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.ModelPartExtension;
import org.mtr.mod.block.*;
import org.mtr.mod.data.IGui;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtrus.MTRUSAddon;
import org.mtrus.block.BlockDCMetroPSDDoorEntity;

public class RenderDCMetroPSDDoor<T extends BlockDCMetroPSDDoorEntity> extends BlockEntityRenderer<T> implements IGui, IBlock {
    private final int type;
    private static final ModelSingleCube MODEL_APG_TOP = new ModelSingleCube(34, 17, 0, 0, 1, 16, 16, 1);
    private static final ModelAPGDoorBottom MODEL_APG_BOTTOM = new ModelAPGDoorBottom();
    private static final ModelAPGDoorLight MODEL_APG_LIGHT = new ModelAPGDoorLight();
    private static final ModelSingleCube MODEL_DOOR_EDGE = new ModelSingleCube(16, 16, 1, 0, 0, 6, 32, 6);
    private static final ModelSingleCube MODEL_APG_DOOR_LOCKED = new ModelSingleCube(64, 96, 5, 9, 1, 6, 6, 0);
    
    @SuppressWarnings("deprecation")
    public RenderDCMetroPSDDoor(Argument dispatcher, int type) {
        super(dispatcher);
        this.type = type;
    }

    @Override
    public void render(T entity, float tickDelta, GraphicsHolder graphicsHolder, int light, int overlay) {
        final World world = entity.getWorld2();
        if (world == null) {
            return;
        }
        entity.tick(tickDelta);

        final BlockPos blockPos = entity.getPos2();
        final Direction facing = IBlock.getStatePropertySafe(world, blockPos, BlockPSDAPGDoorBase.FACING);
        final boolean side = IBlock.getStatePropertySafe(world, blockPos, BlockPSDAPGDoorBase.SIDE) == EnumSide.RIGHT;
        final boolean half = IBlock.getStatePropertySafe(world, blockPos, BlockPSDAPGDoorBase.HALF) == DoubleBlockHalf.UPPER;
        final boolean unlocked = IBlock.getStatePropertySafe(world, blockPos, BlockPSDAPGDoorBase.UNLOCKED);
        final double open = Math.min(entity.getDoorValue(), type >= 3 ? 0.75F : 1);

        final StoredMatrixTransformations storedMatrixTransformations = new StoredMatrixTransformations(0.5 + entity.getPos2().getX(), entity.getPos2().getY(), 0.5 + entity.getPos2().getZ());
        storedMatrixTransformations.add(graphicsHolderNew -> {
            graphicsHolderNew.rotateYDegrees(-facing.asRotation());
            graphicsHolderNew.rotateXDegrees(180);
        });
        final StoredMatrixTransformations storedMatrixTransformationsLight = storedMatrixTransformations.copy();

        switch (type) {
            case 2:
                if (half) {
                    final Block block = world.getBlockState(blockPos.offset(side ? facing.rotateYClockwise() : facing.rotateYCounterclockwise())).getBlock();
                    if (block.data instanceof BlockAPGGlass || block.data instanceof BlockAPGGlassEnd) {
                        MainRenderer.scheduleRender(new Identifier(String.format("mtrus:textures/block/dc_metro_psd_door_light_%s.png", open > 0 ? "on" : "off")), false, open > 0 ? QueuedRenderLayer.LIGHT_TRANSLUCENT : QueuedRenderLayer.EXTERIOR_TRANSLUCENT, (graphicsHolderNew, offset) -> {
                            storedMatrixTransformationsLight.transform(graphicsHolderNew, offset);
                            graphicsHolderNew.translate(side ? -0.484375 : 0.515625, -0.2, 0.1);
                            graphicsHolderNew.scale(0.5F, 1, 1);
                            MODEL_APG_LIGHT.render(graphicsHolderNew, light, overlay, 1, 1, 1, 1);
                            graphicsHolderNew.pop();
                        });

                        MainRenderer.scheduleRender(new Identifier(String.format("mtrus:textures/block/psd_side_light.png")), false, QueuedRenderLayer.EXTERIOR, (graphicsHolderNew, offset) -> {
                            storedMatrixTransformationsLight.transform(graphicsHolderNew, offset);
                            graphicsHolderNew.translate(side ? -0.43755 : 0.93755, 0, 0.01);
                            graphicsHolderNew.scale(1, 1, 1);
                            MODEL_DOOR_EDGE.render(graphicsHolderNew, light, overlay, 1, 1, 1, 1);
                            graphicsHolderNew.pop();
                        });
                    }
                }
                break;
        }

        storedMatrixTransformations.add(matricesNew -> matricesNew.translate(open * (side ? -1 : 1), 0, 0));

        switch (type) {
            case 2:
                MainRenderer.scheduleRender(new Identifier(String.format("mtrus:textures/block/dc_metro_psd_door_%s_%s.png", half ? "top" : "bottom", side ? "right" : "left")), false, QueuedRenderLayer.EXTERIOR, (graphicsHolderNew, offset) -> {
                    storedMatrixTransformations.transform(graphicsHolderNew, offset);
                    (half ? MODEL_APG_TOP : MODEL_APG_BOTTOM).render(graphicsHolderNew, light, overlay, 1, 1, 1, 1);
                    graphicsHolderNew.pop();
                });
                if (half && !unlocked) {
                    MainRenderer.scheduleRender(new Identifier(MTRUSAddon.MOD_ID, "textures/block/dc_metro_psd_door_not_in_use.png"), false, QueuedRenderLayer.EXTERIOR, (graphicsHolderNew, offset) -> {
                        storedMatrixTransformations.transform(graphicsHolderNew, offset);
                        MODEL_APG_DOOR_LOCKED.render(graphicsHolderNew, light, overlay, 1, 1, 1, 1);
                        graphicsHolderNew.pop();
                    });
                }
                break;
            case 4:
                if (IBlock.getStatePropertySafe(world, blockPos, TripleHorizontalBlock.CENTER)) {
                    break;
                }
                storedMatrixTransformations.add(matricesNew -> matricesNew.translate(side ? 0.5 : -0.5, 0, 0));
        }
    }

    @Override
    public boolean rendersOutsideBoundingBox2(T blockEntity) {
        return true;
    }

    private static class ModelSingleCube extends EntityModelExtension<EntityAbstractMapping> {

        private final ModelPartExtension cube;

        private ModelSingleCube(int textureWidth, int textureHeight, int x, int y, int z, int length, int height, int depth) {
            super(textureWidth, textureHeight);
            cube = createModelPart();
            cube.setTextureUVOffset(0, 0).addCuboid(x - 8, y - 16, z - 8, length, height, depth, 0, false);
            buildModel();
        }

        @Override
        public void render(GraphicsHolder graphicsHolder, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            cube.render(graphicsHolder, 0, 0, 0, packedLight, packedOverlay);
        }

        @Override
        public void setAngles2(EntityAbstractMapping entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        }

        @Override
        public void setupAnim(
                EntityAbstractMapping entity,
                float limbSwing,
                float limbSwingAmount,
                float ageInTicks,
                float netHeadYaw,
                float headPitch
        ) {
            setAngles2(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }
    }

    private static class ModelAPGDoorBottom extends EntityModelExtension<EntityAbstractMapping> {

        private final ModelPartExtension bone;

        private ModelAPGDoorBottom() {
            super(34, 27);

            bone = createModelPart();
            bone.setTextureUVOffset(0, 0).addCuboid(-8, -16, -7, 16, 16, 1, 0, false);
            //bone.setTextureUVOffset(0, 17).addCuboid(-8, -6, -8, 16, 6, 1, 0, false);

            /*final ModelPartExtension cube_r1 = bone.addChild();
            cube_r1.setPivot(0, -6, -8);
            cube_r1.setRotation(-0.7854F, 0, 0);
            cube_r1.setTextureUVOffset(0, 24).addCuboid(-8, -2, 0, 16, 2, 1, 0, false);*/

            buildModel();
        }

        @Override
        public void render(GraphicsHolder graphicsHolder, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            bone.render(graphicsHolder, 0, 0, 0, packedLight, packedOverlay);
        }

        @Override
        public void setAngles2(EntityAbstractMapping entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        }

        @Override
        public void setupAnim(
                EntityAbstractMapping entity,
                float limbSwing,
                float limbSwingAmount,
                float ageInTicks,
                float netHeadYaw,
                float headPitch
        ) {
            setAngles2(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }
    }

    private static class ModelAPGDoorLight extends EntityModelExtension<EntityAbstractMapping> {

        private final ModelPartExtension bone;

        private ModelAPGDoorLight() {
            super(8, 8);

            bone = createModelPart();
            bone.setTextureUVOffset(0, 4).addCuboid(-0.49F, -8, -5, 0, 6, 1, 0.05F, false);

            buildModel();
        }

        @Override
        public void render(GraphicsHolder graphicsHolder, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            bone.render(graphicsHolder, 0, 0, 0, packedLight, packedOverlay);
        }

        @Override
        public void setAngles2(EntityAbstractMapping entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        }

        @Override
        public void setupAnim(
                EntityAbstractMapping entity,
                float limbSwing,
                float limbSwingAmount,
                float ageInTicks,
                float netHeadYaw,
                float headPitch
        ) {
            setAngles2(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }
    }
}