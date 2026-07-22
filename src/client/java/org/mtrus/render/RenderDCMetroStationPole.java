package org.mtrus.render;

import org.mtr.core.data.Platform;
import org.mtr.core.data.Station;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.InitClient;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.client.MinecraftClientData;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.data.IGui;
import org.mtrus.MTRUSAddon;
import org.mtrus.block.BlockDCMetroStationPole;
import org.mtrus.block.BlockDCMetroStationPoleEntity;

import it.unimi.dsi.fastutil.ints.IntArrayList;

public class RenderDCMetroStationPole extends BlockEntityRenderer<BlockDCMetroStationPoleEntity> implements IGui {

	private static final Identifier RECTANGLE_TEXTURE = new Identifier(
		MTRUSAddon.MOD_ID,
		"textures/block/rectangle.png"
	);

    @SuppressWarnings("deprecation")
    public RenderDCMetroStationPole(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
        MTRUSAddon.LOGGER.info("RenderDCMetroStationPole constructor called");
    }

	@Override
    public void render(BlockDCMetroStationPoleEntity entity, float tickDelta,
                       GraphicsHolder graphicsHolder, int light, int overlay) {

        final World world = entity.getWorld2();
        if (world == null) {
            return;
        }

        final BlockPos pos = entity.getPos2();

		final Station station = InitClient.findStation(pos);
		String stationName;
		if (station == null) {
			stationName = "Untitled";
		} else {
			stationName = station.getName();
		}

        IntArrayList tempRouteColors = new IntArrayList();
        try {
            tempRouteColors = getStationRouteColors(station);
        } catch (Exception e) {}
        IntArrayList routeColors = tempRouteColors;



        final BlockState state = world.getBlockState(pos);

        final BlockDCMetroStationPole block = (BlockDCMetroStationPole) state.getBlock().data;

        final int rotationOffset = block.getIsDiagonal() ? 45 : 0;



        for (int i = 0; i < 4; i++) {

            final int index = i;

            /*
            * Render overlay plane.
            */
            final StoredMatrixTransformations transform =
                    new StoredMatrixTransformations(
                            pos.getX() + 0.5,
                            pos.getY() + 0.5,
                            pos.getZ() + 0.5
                    );

            transform.add(graphicsHolderNew -> {

                graphicsHolderNew.rotateYDegrees((index * 90) + rotationOffset);
                graphicsHolderNew.rotateZDegrees(270);
                graphicsHolderNew.rotateXDegrees(180);

                // Move text on the sign surface
                graphicsHolderNew.translate(
                        1.05,
                        -0.3,
                        -0.51
                );
            });

            graphicsHolder.push();

            MainRenderer.scheduleRender(RECTANGLE_TEXTURE, false,
                    QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                    (graphicsHolderNew, offset) -> {
                        transform.transform(graphicsHolderNew, offset);

                        IDrawing.drawStringWithFont(graphicsHolderNew, stationName, HorizontalAlignment.LEFT, VerticalAlignment.CENTER, 0, 0, 2.25F, 0.35F, 0.05F, ARGB_WHITE, false, light, null);	

                        float colorPos = 0;
                        for (Integer color : routeColors) {
                            final float colorPosFinal = colorPos;

                            IDrawing.drawTexture(
                                graphicsHolderNew,
                                -0.55F + colorPosFinal,
                                -0.2F,
                                0.5F / routeColors.size(),
                                1.0F,
                                0,
                                0,
                                1,
                                1,
                                Direction.NORTH,
                                color | 0xFF000000,
                                light
                            );

                            colorPos += 0.5F / routeColors.size();
                        }

                        graphicsHolderNew.pop();
                    });
        

            graphicsHolder.pop();

        }
    }

    protected static IntArrayList getStationRouteColors(Station station) {
        final IntArrayList routeColors = new IntArrayList();
        final IntArrayList terminatingColors = new IntArrayList();

        for (Platform platform : station.savedRails) {
            final long platformId = platform.getId();

            MinecraftClientData.getInstance().simplifiedRoutes.stream()
                .filter(route -> route.getPlatformIndex(platformId) >= 0)
                .sorted()
                .forEach(route -> {
                    final int index = route.getPlatformIndex(platformId);

                    if (index < route.getPlatforms().size() - 1) {
                        if (!routeColors.contains(route.getColor())) {
                            routeColors.add(route.getColor());
                        }
                    } else {
                        if (!terminatingColors.contains(route.getColor())) {
                            terminatingColors.add(route.getColor());
                        }
                    }
                });
        }

        if (routeColors.isEmpty()) {
            routeColors.addAll(terminatingColors);
        }

        return routeColors;
    }
}