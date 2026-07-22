package org.mtrus.render;

import org.mtr.core.data.Platform;
import org.mtr.core.data.Station;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.InitClient;
import org.mtr.mod.block.BlockStationNameBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.client.MinecraftClientData;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.data.IGui;
import org.mtrus.MTRUSAddon;
import org.mtrus.block.BlockDCMetroStationNamePoleEntity;

import it.unimi.dsi.fastutil.ints.IntArrayList;

public class RenderDCMetroStationNamePole extends BlockEntityRenderer<BlockDCMetroStationNamePoleEntity> implements IGui {

	private static final Identifier CIRCLE_TEXTURE = new Identifier(
		MTRUSAddon.MOD_ID,
		"textures/block/circle.png"
	);

    @SuppressWarnings("deprecation")
    public RenderDCMetroStationNamePole(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
        MTRUSAddon.LOGGER.info("RenderDCMetroStationNamePole constructor called");
    }

    @SuppressWarnings("deprecation")
	@Override
    public void render(BlockDCMetroStationNamePoleEntity entity, float tickDelta,
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

		IntArrayList tempRouteColors;
		try {
			final Platform[] platform = {null};

			InitClient.findClosePlatform(pos, 4,
					platformFound -> {
						platform[0] = platformFound;
					});


			long platformId = platform[0].getId();
			
			tempRouteColors = getRouteStream(platformId);
		} catch (Exception e) {
			tempRouteColors = new IntArrayList();
		}

		IntArrayList routeColors = tempRouteColors;
		

        final BlockState state = world.getBlockState(pos);

		final Direction facing = IBlock.getStatePropertySafe(
				state,
				BlockStationNameBase.FACING
		);


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
			// Rotate the local sign plane to match the block
			graphicsHolderNew.rotateYDegrees(-facing.asRotation());

			// Flip text so it is readable
			graphicsHolderNew.rotateXDegrees(180);

			// Move text on the sign surface
			graphicsHolderNew.translate(
					0,
					-0.2,
					-0.13
			);
		});

        graphicsHolder.push();

        MainRenderer.scheduleRender(CIRCLE_TEXTURE, false,
                QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                (graphicsHolderNew, offset) -> {
                    transform.transform(graphicsHolderNew, offset);


                    IDrawing.drawStringWithFont(graphicsHolderNew, stationName, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, 0, 0, 2.5F, 0.35F, 0.05F, ARGB_WHITE, false, light, null);	

					for (Integer color : routeColors) {
						IDrawing.drawTexture(
                            graphicsHolderNew,
                            -(0.15F * routeColors.size() - 0.05F) + 0.3F * routeColors.indexOf(color),
                            0.37F,
                            0.2F,
                            0.2F,
                            0,
                            0,
                            1,
                            1,
                            facing,
                            color | 0xFF000000,
                            light
                    	);
					}


                    graphicsHolderNew.pop();
                });

        graphicsHolder.pop();
    }

	protected static IntArrayList getRouteStream(long platformId) {
        final IntArrayList routes = new IntArrayList();
        final IntArrayList terminatingColors = new IntArrayList();
        MinecraftClientData.getInstance().simplifiedRoutes.stream().filter(simplifiedRoute -> simplifiedRoute.getPlatformIndex(platformId) >= 0).sorted().forEach(simplifiedRoute -> {
            final int currentStationIndex = simplifiedRoute.getPlatformIndex(platformId);
            if (currentStationIndex < simplifiedRoute.getPlatforms().size() - 1) {
                if (!routes.contains(simplifiedRoute.getColor())) {
                    routes.add(simplifiedRoute.getColor());
                }
            } else {
                if (!terminatingColors.contains(simplifiedRoute.getColor())) {
                    terminatingColors.add(simplifiedRoute.getColor());
                }
            }
        });
        if (routes.isEmpty()) {
            routes.addAll(terminatingColors);
        }
        return routes;
    }
}