package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.BlockView;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.ShapeContext;
import org.mtr.mapping.holder.VoxelShape;
import org.mtr.mapping.holder.VoxelShapes;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.block.IBlock.DoubleBlockHalf;

import com.lx862.jcm.mod.block.base.Vertical2Block;

public class BlockDCMetroSystemMap extends Vertical2Block {

    private final double[][] boxes1 = {{0, 0, 15, 16, 16, 16}};
    private final double[][] boxes2 = {{0, 0, 15, 16, 11.5, 16}};


    public BlockDCMetroSystemMap(BlockSettings blockSettings) {
        super(blockSettings);
    }


    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        double[][] selectedBoxes;
        if (IBlock.getStatePropertySafe(state, HALF) == DoubleBlockHalf.LOWER) {
            selectedBoxes = boxes1;
        } else {
            selectedBoxes = boxes2;
        }

        for (double[] box : selectedBoxes) {
            VoxelShape voxel = IBlock.getVoxelShapeByDirection(box[0], box[1], box[2], box[3], box[4], box[5], facing);
            shape = VoxelShapes.union(shape, voxel);
        }

        return shape;
    }
}