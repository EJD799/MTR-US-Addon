package org.mtrus.block;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;

import java.util.List;

public class BlockNYCSubwayStationNamePillar extends BlockExtension implements IBlock, DirectionHelper, BlockWithEntity {

    public BlockNYCSubwayStationNamePillar(BlockSettings blockSettings) {
        super(blockSettings);
    }


    @Override
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new BlockNYCSubwayStationNamePillarEntity(pos, state);
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

        return IBlock.getVoxelShapeByDirection(
                2,
                0,
                15,
                14,
                16,
                16,
                facing
        );
    }


    @Override
    public VoxelShape getCollisionShape2(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        return VoxelShapes.empty();
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
}