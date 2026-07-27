package org.mtrus.render;

import java.util.ArrayList;

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
import org.mtrus.api.SimplifiedRouteSchemaExtension;
import org.mtrus.block.BlockDCMetroStationNamePoleEntity;

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

    //@SuppressWarnings({ "unlikely-arg-type" })
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

        ArrayList<ArrayList<Object>> tempRoutes;

        try {
            final Platform[] platform = {null};

			InitClient.findClosePlatform(pos, 4,
					platformFound -> {
						platform[0] = platformFound;
					});


			long platformId = platform[0].getId();
			
			tempRoutes = getRoutes(platformId);
        } catch (Exception e) {
            tempRoutes = new ArrayList<ArrayList<Object>>();
        }

        ArrayList<ArrayList<Object>> routes = tempRoutes;
		

        final BlockState state = world.getBlockState(pos);

		final Direction facing = IBlock.getStatePropertySafe(
				state,
				BlockStationNameBase.FACING
		);


        /*
         * Render overlay plane 1.
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

					for (ArrayList<Object> route : routes) {
                        int color = (int) route.get(0);
                        
						IDrawing.drawTexture(
                            graphicsHolderNew,
                            -(0.375F * routes.size() - 0.05F) + 0.75F * routes.indexOf(route),
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




        /*
         * Render overlay plane 2.
         */
        final StoredMatrixTransformations transform2 =
				new StoredMatrixTransformations(
						pos.getX() + 0.5,
						pos.getY() + 0.5,
						pos.getZ() + 0.5
				);

		transform2.add(graphicsHolderNew -> {
			// Rotate the local sign plane to match the block
			graphicsHolderNew.rotateYDegrees(-facing.asRotation());

			// Flip text so it is readable
			graphicsHolderNew.rotateXDegrees(180);

			// Move text on the sign surface
			graphicsHolderNew.translate(
					0,
					-0.2,
					-0.135
			);
		});

        graphicsHolder.push();

        MainRenderer.scheduleRender(CIRCLE_TEXTURE, false,
                QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                (graphicsHolderNew, offset) -> {
                    transform2.transform(graphicsHolderNew, offset);

					for (ArrayList<Object> route : routes) {
                        String routeNumber = (String) route.get(1);
                        String destination = (String) route.get(2);

                        IDrawing.drawStringWithFont(graphicsHolderNew, routeNumber, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, -(0.375F * routes.size() - 0.05F) + 0.75F * routes.indexOf(route) + 0.1F, 0.5F, 0.15F, 0.15F, 0.025F, ARGB_WHITE, false, light, null);
                        
                        IDrawing.drawStringWithFont(graphicsHolderNew, destination, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, -(0.375F * routes.size() - 0.05F) + 0.75F * routes.indexOf(route) + 0.475F, 0.5F, 0.5F, 0.15F, 0.025F, ARGB_WHITE, false, light, null);
					}


                    graphicsHolderNew.pop();
                });

        graphicsHolder.pop();
    }

    protected static ArrayList<ArrayList<Object>> getRoutes(long platformId) {
        final ArrayList<ArrayList<Object>> routes = new ArrayList<ArrayList<Object>>();
        MinecraftClientData.getInstance().simplifiedRoutes.stream().filter(simplifiedRoute -> simplifiedRoute.getPlatformIndex(platformId) >= 0).sorted().forEach(simplifiedRoute -> {
            final int currentStationIndex = simplifiedRoute.getPlatformIndex(platformId);
            final int currentRouteColor = simplifiedRoute.getColor();
            final String currentRouteNumber = ((SimplifiedRouteSchemaExtension) (Object) simplifiedRoute).mtrus$getRouteNumber();
            final String currentRouteDestination = simplifiedRoute.getPlatforms().get(currentStationIndex).getDestination();

            if (currentStationIndex < simplifiedRoute.getPlatforms().size() - 1) {
                final ArrayList<Object> target = new ArrayList<Object>();
                target.add(currentRouteColor);
                target.add(currentRouteNumber);
                target.add(currentRouteDestination);

                if ((!routes.contains(target)) && (routes.size() < 3)) {
                    routes.add(target);
                }
            }
        });
        return routes;
    }
}