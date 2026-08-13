package org.mtrus.render;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.Vector3d;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.block.IBlock.DoubleBlockHalf;
import org.mtr.mod.client.CustomResourceLoader;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.resource.OptimizedModelWrapper;
import org.mtrus.block.BlockNYCSubwayEmergencyExitDoor;
import org.mtrus.block.BlockNYCSubwayEmergencyExitDoorEntity;
import org.mtrus.resource.OBJModelResource;

public class RenderNYCSubwayEmergencyExitDoor extends BlockEntityRenderer<BlockNYCSubwayEmergencyExitDoorEntity> {

    @SuppressWarnings("deprecation")
    public RenderNYCSubwayEmergencyExitDoor(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
    }

    @Override
    public void render(
            BlockNYCSubwayEmergencyExitDoorEntity entity,
            float tickDelta,
            GraphicsHolder graphicsHolder,
            int light,
            int overlay
    ) {

        final World world = entity.getWorld2();

        if (world == null) {
            return;
        }

        final BlockPos pos = entity.getPos2();
        final BlockState state = world.getBlockState(pos);

        if (IBlock.getStatePropertySafe(state, BlockNYCSubwayEmergencyExitDoor.HALF) == DoubleBlockHalf.LOWER) {

            OptimizedModelWrapper modelTemp;
            if (IBlock.getStatePropertySafe(state, BlockNYCSubwayEmergencyExitDoor.OPEN) == BlockNYCSubwayEmergencyExitDoor.EnumNYCSubwayEmergencyExitDoorOpen.OPEN) {
                modelTemp = OBJModelResource.getModel("mtrus:obj/nyc_subway_emergency_exit_door_open.obj", false);
            } else {
                modelTemp = OBJModelResource.getModel("mtrus:obj/nyc_subway_emergency_exit_door_closed.obj", false);
            }
            final OptimizedModelWrapper model = modelTemp;

            if (model == null) {
                return;
            }

            final StoredMatrixTransformations transform =
                    new StoredMatrixTransformations(
                            pos.getX() + 0.5,
                            pos.getY(),
                            pos.getZ() + 0.5
                    );

            MainRenderer.scheduleRender(
                    QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                    (graphicsHolderNew, offset) -> {

                        transform.transform(graphicsHolderNew, offset);

                        graphicsHolderNew.rotateXDegrees(180);

                        Direction facing = IBlock.getStatePropertySafe(state, BlockNYCSubwayEmergencyExitDoor.FACING);

                        switch (facing) {
                            case EAST:
                                graphicsHolderNew.rotateYDegrees(90);
                                break;

                            case NORTH:
                                break;

                            case WEST:
                                graphicsHolderNew.rotateYDegrees(270);
                                break;

                            case SOUTH:
                            default:
                                graphicsHolderNew.rotateYDegrees(180);
                                break;
                        }

                        CustomResourceLoader.OPTIMIZED_RENDERER_WRAPPER.queue(
                                model,
                                graphicsHolderNew,
                                light
                        );

                        graphicsHolderNew.pop();
                    }
            );
            
        }
    }

    @Override
    public boolean rendersOutsideBoundingBox2(BlockNYCSubwayEmergencyExitDoorEntity entity) {
        return true;
    }

    @Override
    public boolean isInRenderDistance(
            BlockNYCSubwayEmergencyExitDoorEntity entity,
            Vector3d position
    ) {
        return true;
    }
}