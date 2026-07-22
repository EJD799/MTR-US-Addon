package org.mtrus.render;

import java.util.ArrayList;

import org.mtr.core.data.Platform;
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
import org.mtrus.block.BlockDCMetrobusSignEntity;

import com.lx862.mtrscripting.mod.impl.mtr.util.TextUtil;

public class RenderDCMetrobusSign extends BlockEntityRenderer<BlockDCMetrobusSignEntity> implements IGui {

	private static final Identifier CIRCLE_TEXTURE = new Identifier(
		MTRUSAddon.MOD_ID,
		"textures/block/circle.png"
	);

    @SuppressWarnings("deprecation")
    public RenderDCMetrobusSign(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
    }

	@Override
    public void render(BlockDCMetrobusSignEntity entity, float tickDelta,
                       GraphicsHolder graphicsHolder, int light, int overlay) {
        final World world = entity.getWorld2();
        if (world == null) {
            return;
        }

        final BlockPos pos = entity.getPos2();

		ArrayList<String> tempRouteNumbers = new ArrayList<String>();
		try {
			final Platform[] platform = {null};

			InitClient.findClosePlatform(pos, 4,
					platformFound -> {
						platform[0] = platformFound;
					});

            /*ObjectAVLTreeSet<Route> routes = platform[0].routes;

            HashSet<String> seenRouteNumbers = new HashSet<>();

            for (Route route : routes) {
                String routeNumber = route.getRouteNumber();

                if (seenRouteNumbers.add(routeNumber)) { // Only true if it wasn't already present
                    tempRouteNumbers.add(routeNumber);
                }

                if (tempRouteNumbers.size() == 6) {
                    break;
                }
            }*/

            tempRouteNumbers = getPlatformRouteNames(platform[0]);

            tempRouteNumbers.sort(null);

            while (tempRouteNumbers.size() < 6) {
                tempRouteNumbers.add("");
            }
		} catch (Exception e) {
			tempRouteNumbers = new ArrayList<String>();

            while (tempRouteNumbers.size() < 6) {
                tempRouteNumbers.add("");
            }
		}

		ArrayList<String> routeNumbers = tempRouteNumbers;
		

        final BlockState state = world.getBlockState(pos);

		final Direction facing = IBlock.getStatePropertySafe(
				state,
				BlockStationNameBase.FACING
		);

        for (int tempSide = 1; tempSide <= 2; tempSide++) {
            int side = tempSide;

            /*
            * Render overlay plane.
            */
            final StoredMatrixTransformations transform =
                    new StoredMatrixTransformations(
                            pos.getX() + 0.5,
                            pos.getY() + 0.5,
                            pos.getZ() + 0.5
                    );

            float xOffset;
            if (side == 2) {
                xOffset = 0.2F;
            } else {
                xOffset = 0.05F;
            }

            transform.add(graphicsHolderNew -> {
                // Rotate the local sign plane to match the block
                if (side == 2) {
                    graphicsHolderNew.rotateYDegrees(-facing.getOpposite().asRotation());
                } else {

                    graphicsHolderNew.rotateYDegrees(-facing.asRotation());
                }

                // Flip text so it is readable
                graphicsHolderNew.rotateXDegrees(180);

                // Move text on the sign surface
                graphicsHolderNew.translate(
                        0,
                        0,
                        -0.04
                );
            });

            graphicsHolder.push();

            MainRenderer.scheduleRender(CIRCLE_TEXTURE, false,
                    QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                    (graphicsHolderNew, offset) -> {
                        transform.transform(graphicsHolderNew, offset);

                        for (String routeNumber : routeNumbers) {
                            int row;
                            int column;
                            int routeIndex = routeNumbers.indexOf(routeNumber);
                            if (routeIndex > 3) {
                                row = 1;
                                column = routeIndex - 3;
                            } else {
                                row = 0;
                                column = routeIndex;
                            }

                            IDrawing.drawStringWithFont(graphicsHolderNew, routeNumber, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, -0.4F + (0.25F * column) + xOffset, -0.25F + (0.15F * row), 0.2F, 0.1F, 0.025F, ARGB_WHITE, false, light, null);	
                        }


                        graphicsHolderNew.pop();
                    });

            graphicsHolder.pop();

        }
    }


    protected static ArrayList<String> getPlatformRouteNames(Platform platform) {
        final ArrayList<String> routeNames = new ArrayList<String>();
        final ArrayList<String> terminatingNames = new ArrayList<String>();

            final long platformId = platform.getId();

        MinecraftClientData.getInstance().simplifiedRoutes.stream()
            .filter(route -> route.getPlatformIndex(platformId) >= 0)
            .sorted()
            .forEach(route -> {
                final int index = route.getPlatformIndex(platformId);

                String routeName = TextUtil.getNonExtraParts(route.getName());

                if (index < route.getPlatforms().size() - 1) {
                    if (!routeNames.contains(routeName)) {
                        routeNames.add(routeName);
                    }
                } else {
                    if (!terminatingNames.contains(routeName)) {
                        terminatingNames.add(routeName);
                    }
                }
            });

        if (routeNames.isEmpty()) {
            routeNames.addAll(terminatingNames);
        }

        return routeNames;
    }
}