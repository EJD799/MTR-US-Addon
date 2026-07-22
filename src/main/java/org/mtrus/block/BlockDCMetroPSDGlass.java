package org.mtrus.block;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.block.BlockAPGGlass;
import org.mtr.mod.block.IBlock;
import org.mtrus.ModItems;

public class BlockDCMetroPSDGlass extends BlockAPGGlass {
    @Override
    public Item asItem2() {
        return ModItems.DC_METRO_PSD_GLASS.get();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockDCMetroPSDGlassEntity(blockPos, blockState);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView blockView, BlockPos pos, ShapeContext shapeContext) {
        return IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 16.0, 16.0, 6.0, IBlock.getStatePropertySafe(state, FACING));
    }

    @Override
    public VoxelShape getCollisionShape2(BlockState state, BlockView blockView, BlockPos pos, ShapeContext shapeContext) {
        return IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 16.0, 16.0, 6.0, IBlock.getStatePropertySafe(state, FACING));
    }
}