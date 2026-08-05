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
import org.mtrus.block.BlockNYCSubwayStationNameEntranceEntity;

public class RenderNYCSubwayStationNameEntrance extends BlockEntityRenderer<BlockNYCSubwayStationNameEntranceEntity> implements IGui {

	private static final Identifier CIRCLE = new Identifier(
		MTRUSAddon.MOD_ID,
		"textures/block/circle.png"
	);

    @SuppressWarnings("deprecation")
    public RenderNYCSubwayStationNameEntrance(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
    }

	@Override
    public void render(BlockNYCSubwayStationNameEntranceEntity entity, float tickDelta,
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

		final ArrayList<ArrayList<Object>> routes = getStationRoutes(station);
		

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
					0,
					0.465
			);
		});

        graphicsHolder.push();

        MainRenderer.scheduleRender(CIRCLE, false,
                QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                (graphicsHolderNew, offset) -> {
                    transform.transform(graphicsHolderNew, offset);

					for (ArrayList<Object> route : routes) {
						IDrawing.drawTexture(
                            graphicsHolderNew,
                            -0.4F + (0.4F * routes.indexOf(route)),
                            0.08F,
                            0.3F,
                            0.3F,
                            0,
                            0,
                            1,
                            1,
                            facing,
                            (int) route.get(0) | 0xFF000000,
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
					0,
					0.46
			);
		});

        graphicsHolder.push();

        MainRenderer.scheduleRender(CIRCLE, false,
                QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                (graphicsHolderNew, offset) -> {
                    transform2.transform(graphicsHolderNew, offset);


                    IDrawing.drawStringWithFont(graphicsHolderNew, stationName, HorizontalAlignment.LEFT, VerticalAlignment.CENTER, -0.45F, -0.1F, 1.75F, 0.35F, 0.05F, ARGB_WHITE, false, light, null);	

					for (ArrayList<Object> route : routes) {
						IDrawing.drawStringWithFont(graphicsHolderNew, (String) route.get(1), HorizontalAlignment.CENTER, VerticalAlignment.CENTER, -0.25F + (0.4F * routes.indexOf(route)), 0.25F, 0.2F, 0.2F, 0.05F, ARGB_WHITE, false, light, null);
					}

                    graphicsHolderNew.pop();
                });

        graphicsHolder.pop();
    }


	protected static ArrayList<ArrayList<Object>> getStationRoutes(Station station) {
        final ArrayList<ArrayList<Object>> routes = new ArrayList<>();
        final ArrayList<ArrayList<Object>> terminatingRoutes = new ArrayList<>();

        for (Platform platform : station.savedRails) {
            final long platformId = platform.getId();

            MinecraftClientData.getInstance().simplifiedRoutes.stream()
                .filter(route -> route.getPlatformIndex(platformId) >= 0)
                .sorted()
                .forEach(route -> {
                    final int index = route.getPlatformIndex(platformId);

					final ArrayList<Object> target = new ArrayList<>();
					target.add(route.getColor());
					target.add(((SimplifiedRouteSchemaExtension) (Object) route).mtrus$getRouteNumber());

                    if (index < route.getPlatforms().size() - 1) {
                        if (!routes.contains(target)) {
                            routes.add(target);
                        }
                    } else {
                        if (!terminatingRoutes.contains(target)) {
                            terminatingRoutes.add(target);
                        }
                    }
                });
        }

        if (routes.isEmpty()) {
            routes.addAll(terminatingRoutes);
        }

        return routes;
    }
}