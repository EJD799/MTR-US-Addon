package org.mtrus.render;

import com.lx862.jcm.mod.data.pids.preset.PIDSPresetBase;
import com.lx862.jcm.mod.render.block.PIDSRenderer;

import org.mtr.core.operation.ArrivalResponse;
import org.mtr.libraries.it.unimi.dsi.fastutil.longs.LongImmutableList;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.client.CustomResourceLoader;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.resource.OptimizedModelWrapper;
import org.mtrus.block.OBJPIDS;
import org.mtrus.block.OBJPIDSEntity;
import org.mtrus.resource.OBJModelResource;

public class RenderOBJPIDS extends PIDSRenderer<OBJPIDSEntity> {
    @SuppressWarnings("deprecation")
    public RenderOBJPIDS(Argument dispatcher) {
        super(dispatcher);
    }

    @Override
    public void renderPIDS(OBJPIDSEntity blockEntity, PIDSPresetBase pidsPreset, GraphicsHolder graphicsHolder, StoredMatrixTransformations storedMatrixTransformations, World world, BlockState state, BlockPos pos, Direction facing, LongImmutableList targetPlatformIds, ObjectArrayList<ArrivalResponse> arrivals, float tickDelta, boolean[] rowHidden, int light) {
        if (world == null) {
            return;
        }

        final Object blockObject = state.getBlock().data;

        if (!(blockObject instanceof OBJPIDS block)) {
            return;
        }

        final float[] pidsRenderValues = block.getPIDSRenderValues();
        
        storedMatrixTransformations.add(graphicsHolderNew -> {
            graphicsHolderNew.rotateXDegrees(pidsRenderValues[3]);
            graphicsHolderNew.rotateYDegrees(pidsRenderValues[4]);
            graphicsHolderNew.rotateZDegrees(pidsRenderValues[5]);

            graphicsHolderNew.translate(pidsRenderValues[0], pidsRenderValues[1], pidsRenderValues[2]);
        });
        pidsPreset.render(blockEntity, graphicsHolder, storedMatrixTransformations, world, blockEntity.getPos2(), facing, targetPlatformIds, arrivals, rowHidden, tickDelta, 0, 0, block.getPIDSScreenWidth(), block.getPIDSScreenHeight(), light);

        renderBaseModel(block, pos, state, light);
    }

    public void renderBaseModel(OBJPIDS block, BlockPos pos, BlockState state, int light) {
        final OptimizedModelWrapper model = OBJModelResource.getModel(block.getModel(), false);

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

                    Direction facing = IBlock.getStatePropertySafe(state, OBJPIDS.FACING);

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

        if (block.getHasLightLayer()) {
            final OptimizedModelWrapper modelLight = OBJModelResource.getModel(block.getModel().replace(".obj", "_light_layer.obj"), true);

            if (modelLight == null) {
                return;
            }

            final StoredMatrixTransformations transformLight =
                    new StoredMatrixTransformations(
                            pos.getX() + 0.5,
                            pos.getY(),
                            pos.getZ() + 0.5
                    );

            MainRenderer.scheduleRender(
                    QueuedRenderLayer.LIGHT_TRANSLUCENT,
                    (graphicsHolderNew, offset) -> {

                        transformLight.transform(graphicsHolderNew, offset);

                        graphicsHolderNew.rotateXDegrees(180);

                        Direction facing = IBlock.getStatePropertySafe(state, OBJPIDS.FACING);

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
                                modelLight,
                                graphicsHolderNew,
                                light
                        );

                        graphicsHolderNew.pop();
                    }
            );
        }
    }
}