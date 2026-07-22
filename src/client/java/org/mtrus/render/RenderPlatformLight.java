package org.mtrus.render;

import org.mtr.core.operation.ArrivalResponse;
import org.mtr.libraries.it.unimi.dsi.fastutil.longs.LongArrayList;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.SlabBlockExtension;
import org.mtr.mod.InitClient;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.data.ArrivalsCacheClient;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.MoreRenderLayers;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.data.IGui;
import org.mtrus.MTRUSAddon;
import org.mtrus.block.BlockPlatformLight;
import org.mtrus.block.BlockPlatformLightSlab;
import org.mtrus.block.BlockPlatformLightEntity;

public class RenderPlatformLight extends BlockEntityRenderer<BlockPlatformLightEntity> implements IGui {

    private static final Identifier LIGHT1 =
            new Identifier(MTRUSAddon.MOD_ID, "textures/block/platform_dc_light1.png");

    private static final Identifier LIGHT2 =
            new Identifier(MTRUSAddon.MOD_ID, "textures/block/platform_dc_light2.png");

    @SuppressWarnings("deprecation")
    public RenderPlatformLight(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
        MTRUSAddon.LOGGER.info("RenderPlatformLight constructor called");
    }

    @Override
    public void render(BlockPlatformLightEntity entity, float tickDelta,
                       GraphicsHolder graphicsHolder, int light, int overlay) {

        final World world = entity.getWorld2();
        if (world == null) {
            return;
        }

        final BlockPos pos = entity.getPos2();

        /*
         * Find nearest platform.
         */
        final LongArrayList platformIds = new LongArrayList();

        InitClient.findClosePlatform(pos, 2,
                platform -> platformIds.add(platform.getId()));

        if (platformIds.isEmpty()) {
            return;
        }


        /*
         * Check arrivals.
         */
        final ObjectArrayList<ArrivalResponse> arrivals =
                ArrivalsCacheClient.INSTANCE.requestArrivals(platformIds);


        boolean flashing = false;

        for (ArrivalResponse arrival : arrivals) {

            long seconds =
                (arrival.getArrival()
                - ArrivalsCacheClient.INSTANCE.getMillisOffset()
                - System.currentTimeMillis()) / 1000;

            if (seconds <= 10) {
                flashing = (((int) InitClient.getGameTick() / 10) % 2) == 0;
                break;
            }
        }


        if (!flashing) {
            return;
        }


        /*
         * Pick texture.
         */
        final BlockState state = world.getBlockState(pos);
        final Object block = state.getBlock().data;

        final Identifier texture;

        if (block instanceof BlockPlatformLight platformLight) {
            texture = platformLight.isLight2() ? LIGHT2 : LIGHT1;
        } else if (block instanceof BlockPlatformLightSlab platformLightSlab) {
            texture = platformLightSlab.isLight2() ? LIGHT2 : LIGHT1;
        } else {
            return;
        }


        /*
         * Determine height.
         *
         * Default: full block / top slab = 16.05
         * Bottom slab = 8.05
         */
        double y = 16.05 / 16;

        if (block instanceof BlockPlatformLightSlab) {
            if (state.data.getValue(SlabBlockExtension.TYPE).toString().equals("bottom")) {
                y = 8.05 / 16;
            }
        }


        /*
         * Render overlay plane.
         */
        final StoredMatrixTransformations transform =
                new StoredMatrixTransformations(
                        pos.getX() + 0.5,
                        pos.getY() + y,
                        pos.getZ() + 0.5
                );


        graphicsHolder.push();

        MainRenderer.scheduleRender(texture, false,
                QueuedRenderLayer.LIGHT_TRANSLUCENT,
                (graphicsHolderNew, offset) -> {

                    transform.transform(graphicsHolderNew, offset);

                    graphicsHolderNew.createVertexConsumer(
                            MoreRenderLayers.getLight(texture, true)
                    );

                    graphicsHolderNew.rotateXDegrees(90);

                    IDrawing.drawTexture(
                            graphicsHolderNew,
                            -0.5F,
                            -0.5F,
                            1.0F,
                            1.0F,
                            0,
                            0,
                            1,
                            1,
                            Direction.UP,
                            ARGB_WHITE,
                            MAX_LIGHT_INTERIOR
                    );

                    graphicsHolderNew.pop();
                });

        graphicsHolder.pop();
    }
}