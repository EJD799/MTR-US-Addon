package org.mtrus.render;

import org.mtr.core.data.Station;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.InitClient;
import org.mtr.mod.block.BlockStationNameBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.client.IDrawing;

import com.lx862.jcm.mod.render.IDrawingJoban;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.data.IGui;
import org.mtrus.MTRUSAddon;
import org.mtrus.block.BlockNYCSubwayStationNameTile2Entity;

public class RenderNYCSubwayStationNameTile2 extends BlockEntityRenderer<BlockNYCSubwayStationNameTile2Entity> implements IGui {

	private static final Identifier RECTANGLE = new Identifier(
		MTRUSAddon.MOD_ID,
		"textures/block/rectangle.png"
	);

    @SuppressWarnings("deprecation")
    public RenderNYCSubwayStationNameTile2(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
    }

	@Override
    public void render(BlockNYCSubwayStationNameTile2Entity entity, float tickDelta,
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

		final Direction facing = IBlock.getStatePropertySafe(
				state,
				BlockStationNameBase.FACING
		);


        /*
         * Render overlay plane.
         */

		float tile = 1 / 6;

        final StoredMatrixTransformations transform =
				new StoredMatrixTransformations(
						pos.getX() + 0.5,
						pos.getY() + 0.5,
						pos.getZ() + 0.5
				);
		
		final StoredMatrixTransformations transform2 =
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
					2 * tile,
					0.43
			);
		});

		transform2.add(graphicsHolderNew -> {
			// Rotate the local sign plane to match the block
			graphicsHolderNew.rotateYDegrees(-facing.asRotation());

			// Flip text so it is readable
			graphicsHolderNew.rotateXDegrees(180);

			// Move text on the sign surface
			graphicsHolderNew.translate(
					0,
					2 * tile,
					0.42
			);
		});

        graphicsHolder.push();

        MainRenderer.scheduleRender(RECTANGLE, false,
                QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                (graphicsHolderNew, offset) -> {
                    transform.transform(graphicsHolderNew, offset);

					IDrawing.drawTexture(
                            graphicsHolderNew,
                            0 - ((stationName.length() * tile) / 2),
                            0,
                            stationName.length() * tile,
                            tile,
                            0,
                            0,
                            1,
                            1,
                            facing,
                            ARGB_BLACK,
                            light
                    	);

                    graphicsHolderNew.pop();
                });

		MainRenderer.scheduleRender(RECTANGLE, false,
                QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                (graphicsHolderNew, offset) -> {
                    transform2.transform(graphicsHolderNew, offset);

					char[] stationNameChars = stationName.toCharArray();

					for (int i = 0; i < stationNameChars.length; i++) {
						String chString = String.valueOf(stationNameChars[i]);
						IDrawingJoban.drawStringWithFont(graphicsHolderNew, chString, new Identifier("mtrus:nyc_subway_mosaic"), HorizontalAlignment.CENTER, VerticalAlignment.CENTER, ((tile / 2) - ((stationName.length() * tile) / 2)) + (i * tile), tile / 2, 0.1F, 0.1F, 0.01F, ARGB_WHITE, false, light, null);
					}

                    graphicsHolderNew.pop();
                });

        graphicsHolder.pop();
    }
}