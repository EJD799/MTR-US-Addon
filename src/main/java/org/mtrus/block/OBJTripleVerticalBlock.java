package org.mtrus.block;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.IBlock;

import com.lx862.jcm.mod.block.base.Vertical3Block;

public class OBJTripleVerticalBlock extends Vertical3Block implements BlockWithEntity {
    private final String model;
    private final double[][] boxes1;
    private final double[][] boxes2;
    private final double[][] boxes3;
    private final boolean hasLightLayer;

    public OBJTripleVerticalBlock(BlockSettings blockSettings, String model, double[][] boxes1, double[][] boxes2, double[][] boxes3, boolean hasLightLayer) {
        super(blockSettings);

        this.model = model;
        this.boxes1 = boxes1;
        this.boxes2 = boxes2;
        this.boxes3 = boxes3;
        this.hasLightLayer = hasLightLayer;
    }

    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        double[][] selectedBoxes;
        if (IBlock.getStatePropertySafe(state, THIRD) == IBlock.EnumThird.LOWER) {
            selectedBoxes = boxes1;
        } else if (IBlock.getStatePropertySafe(state, THIRD) == IBlock.EnumThird.MIDDLE) {
            selectedBoxes = boxes2;
        } else {
            selectedBoxes = boxes3;
        }

        for (double[] box : selectedBoxes) {
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
        return new OBJTripleVerticalBlockEntity(pos, state);
    }

    public String getModel() {
        return model;
    }

    public boolean getHasLightLayer() {
        return hasLightLayer;
    }
}