package org.mtrus.block;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.generated.lang.TranslationProvider;

import java.util.List;

public class BlockNYCSubwayPillar extends BlockExtension implements DirectionHelper {

    private final Boolean isStationColored;

    public BlockNYCSubwayPillar(BlockSettings blockSettings, Boolean isStationColored) {
        super(blockSettings);

        this.isStationColored = isStationColored;
    }


    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape2(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        VoxelShape vx1 = IBlock.getVoxelShapeByDirection(
                2,
                0,
                0,
                14,
                16,
                2,
                facing
        );

        VoxelShape vx2 = IBlock.getVoxelShapeByDirection(
                2,
                0,
                14,
                14,
                16,
                16,
                facing
        );

        VoxelShape vx3 = IBlock.getVoxelShapeByDirection(
                7,
                0,
                2,
                9,
                16,
                14,
                facing
        );

        return VoxelShapes.union(VoxelShapes.union(vx1, vx2), vx3);
    }


    @Override
    public VoxelShape getCollisionShape2(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        return getOutlineShape2(state, world, pos, context);
    }


    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        Direction facing = ctx.getPlayerFacing().getOpposite();

        return getDefaultState2()
                .with(
                        new Property<>(FACING.data),
                        facing.data
                );
    }

    @Override
	public void addTooltips(ItemStack stack, BlockView world, List<MutableText> tooltip, TooltipContext options) {
        if (isStationColored) {
		    tooltip.add(TranslationProvider.TOOLTIP_MTR_STATION_COLOR.getMutableText().formatted(TextFormatting.GRAY));
        }
	}
}