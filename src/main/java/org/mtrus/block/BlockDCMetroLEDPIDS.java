package org.mtrus.block;

import com.lx862.jcm.mod.block.JCMPIDSBlock;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.block.IBlock;

public class BlockDCMetroLEDPIDS extends JCMPIDSBlock {

    public BlockDCMetroLEDPIDS(BlockSettings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        VoxelShape vx1 = IBlock.getVoxelShapeByDirection(3, 2, 0, 13, 16, 12, IBlock.getStatePropertySafe(state, FACING));
        return vx1;
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockDCMetroLEDPIDSEntity(blockPos, blockState);
    }
}