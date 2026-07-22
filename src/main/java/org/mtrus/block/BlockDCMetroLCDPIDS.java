package org.mtrus.block;

import com.lx862.jcm.mod.block.JCMPIDSBlock;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.block.IBlock;

public class BlockDCMetroLCDPIDS extends JCMPIDSBlock {

    public BlockDCMetroLCDPIDS(BlockSettings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        VoxelShape vx1 = IBlock.getVoxelShapeByDirection(4, 2, 0, 12, 16, 12, IBlock.getStatePropertySafe(state, FACING));
        return vx1;
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockDCMetroLCDPIDSEntity(blockPos, blockState);
    }
}