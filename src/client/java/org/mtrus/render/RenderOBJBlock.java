package org.mtrus.render;

import net.minecraft.core.Direction;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.Vector3d;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.client.CustomResourceLoader;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.resource.OptimizedModelWrapper;
import org.mtrus.block.OBJBlock;
import org.mtrus.block.OBJBlockEntity;
import org.mtrus.resource.OBJModelResource;

public class RenderOBJBlock extends BlockEntityRenderer<OBJBlockEntity> {

    @SuppressWarnings("deprecation")
    public RenderOBJBlock(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
    }

    @Override
    public void render(
            OBJBlockEntity entity,
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

        final Object blockObject = state.getBlock().data;

        if (!(blockObject instanceof OBJBlock block)) {
            return;
        }

        final OptimizedModelWrapper model = OBJModelResource.getModel(block.getModel());

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

                    Direction facing = state.data.getValue(OBJBlock.FACING);

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

    @Override
    public boolean rendersOutsideBoundingBox2(OBJBlockEntity entity) {
        return true;
    }

    @Override
    public boolean isInRenderDistance(
            OBJBlockEntity entity,
            Vector3d position
    ) {
        return true;
    }
}