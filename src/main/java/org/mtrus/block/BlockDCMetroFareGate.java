package org.mtrus.block;

import org.mtr.mapping.holder.*;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.IBlock;

public class BlockDCMetroFareGate extends BlockTicketBarrier {
    public BlockDCMetroFareGate(boolean isEntrance) {
        super(isEntrance);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);
        VoxelShape vx1 = IBlock.getVoxelShapeByDirection(14, 0, 0, 16, 16, 16, facing);
        VoxelShape vx2 = IBlock.getVoxelShapeByDirection(0, 0, 0, 2, 16, 16, facing);
        return VoxelShapes.union(vx1, vx2);
    }
}