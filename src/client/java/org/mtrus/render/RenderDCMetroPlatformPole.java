package org.mtrus.render;

import org.mtr.core.data.Station;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.InitClient;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.data.IGui;
import org.mtrus.MTRUSAddon;
import org.mtrus.block.BlockDCMetroPlatformPole;
import org.mtrus.block.BlockDCMetroPlatformPoleEntity;


public class RenderDCMetroPlatformPole extends BlockEntityRenderer<BlockDCMetroPlatformPoleEntity> implements IGui {

	private static final Identifier RECTANGLE_TEXTURE = new Identifier(
		MTRUSAddon.MOD_ID,
		"textures/block/rectangle.png"
	);

    @SuppressWarnings("deprecation")
    public RenderDCMetroPlatformPole(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
        MTRUSAddon.LOGGER.info("RenderDCMetroPlatformPole constructor called");
    }

	@Override
    public void render(BlockDCMetroPlatformPoleEntity entity, float tickDelta,
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



        final BlockState state = world.getBlockState(pos);

        final BlockDCMetroPlatformPole block = (BlockDCMetroPlatformPole) state.getBlock().data;

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
                        0.55,
                        -0.3,
                        -0.51
                );
            });

            graphicsHolder.push();

            MainRenderer.scheduleRender(RECTANGLE_TEXTURE, false,
                    QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                    (graphicsHolderNew, offset) -> {
                        transform.transform(graphicsHolderNew, offset);


                        IDrawing.drawStringWithFont(graphicsHolderNew, stationName, HorizontalAlignment.LEFT, VerticalAlignment.CENTER, 0, 0, 1.75F, 0.35F, 0.05F, ARGB_WHITE, false, light, null);


                        graphicsHolderNew.pop();
                    });

            graphicsHolder.pop();

        }
    }
}