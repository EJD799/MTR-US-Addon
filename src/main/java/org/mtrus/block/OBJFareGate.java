package org.mtrus.block;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.IBlock;

public class OBJFareGate extends BlockTicketBarrier implements BlockWithEntity {
    private final String model1;
    private final String model2;
    private final double[][] boxes;

    public OBJFareGate(String model1, String model2, double[][] boxes, boolean isEntrance) {
        super(isEntrance);

        this.model1 = model1;
        this.model2 = model2;
        this.boxes = boxes;
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        for (double[] box : boxes) {
            VoxelShape voxel = IBlock.getVoxelShapeByDirection(box[0], box[1], box[2], box[3], box[4], box[5], facing);
            shape = VoxelShapes.union(shape, voxel);
        }

        return shape;
    }

    @Override
    public BlockEntityExtension createBlockEntity(
            BlockPos pos,
            org.mtr.mapping.holder.BlockState state
    ) {
        return new OBJFareGateEntity(pos, state);
    }

    public String getModel1() {
        return model1;
    }

    public String getModel2() {
        return model2;
    }
}