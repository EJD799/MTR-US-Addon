package org.mtrus.render;

import org.mtr.core.data.Station;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.InitClient;
import org.mtr.mod.block.BlockStationNameBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.client.IDrawing;
import org.mtr.mod.render.MainRenderer;
import org.mtr.mod.render.QueuedRenderLayer;
import org.mtr.mod.render.StoredMatrixTransformations;
import org.mtr.mod.data.IGui;
import org.mtrus.MTRUSAddon;
import org.mtrus.block.BlockNYCSubwayStationNamePillarEntity;

public class RenderNYCSubwayStationNamePillar extends BlockEntityRenderer<BlockNYCSubwayStationNamePillarEntity> implements IGui {

	private static final Identifier RECTANGLE = new Identifier(
		MTRUSAddon.MOD_ID,
		"textures/block/rectangle.png"
	);

    @SuppressWarnings("deprecation")
    public RenderNYCSubwayStationNamePillar(BlockEntityRenderer.Argument dispatcher) {
        super(dispatcher);
    }

	@Override
    public void render(BlockNYCSubwayStationNamePillarEntity entity, float tickDelta,
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

        MainRenderer.scheduleRender(RECTANGLE, false,
                QueuedRenderLayer.EXTERIOR_TRANSLUCENT,
                (graphicsHolderNew, offset) -> {
                    transform.transform(graphicsHolderNew, offset);


                    IDrawing.drawStringWithFont(graphicsHolderNew, stationName, HorizontalAlignment.CENTER, VerticalAlignment.CENTER, 0, 0, 0.8F, 0.35F, 0.03F, ARGB_WHITE, false, light, null);	

                    graphicsHolderNew.pop();
                });

        graphicsHolder.pop();
    }
}