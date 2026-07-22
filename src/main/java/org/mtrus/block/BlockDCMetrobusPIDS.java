package org.mtrus.block;

import com.lx862.jcm.mod.block.JCMPIDSBlock;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.block.IBlock;

public class BlockDCMetrobusPIDS extends JCMPIDSBlock {

    public BlockDCMetrobusPIDS(BlockSettings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        VoxelShape shape1 = IBlock.getVoxelShapeByDirection(6, 5, 0, 10, 16, 16, IBlock.getStatePropertySafe(state, FACING));
        return shape1;
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockDCMetrobusPIDSEntity(blockPos, blockState);
    }
}