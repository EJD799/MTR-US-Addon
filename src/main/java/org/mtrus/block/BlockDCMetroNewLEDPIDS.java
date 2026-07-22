package org.mtrus.block;

import com.lx862.jcm.mod.block.JCMPIDSBlock;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.block.IBlock;

public class BlockDCMetroNewLEDPIDS extends JCMPIDSBlock {

    public BlockDCMetroNewLEDPIDS(BlockSettings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        VoxelShape vx1 = IBlock.getVoxelShapeByDirection(4, 2, 0, 12, 16, 12, IBlock.getStatePropertySafe(state, FACING));
        return vx1;
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockDCMetroNewLEDPIDSEntity(blockPos, blockState);
    }
}