package org.mtrus.block;

import com.lx862.jcm.mod.block.JCMPIDSBlock;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.block.IBlock;

public class OBJPIDS extends JCMPIDSBlock {
    private final String pidsType;
    private final String defaultPreset;
    private final int rowCount;
    private final String model;
    private final double[][] boxes;
    private final boolean hasLightLayer;
    private final float[] pidsRenderValues;
    private final int pidsScreenWidth;
    private final int pidsScreenHeight;

    public OBJPIDS(BlockSettings settings, String pidsType, String defaultPreset, int rowCount, String model, double[][] boxes, boolean hasLightLayer, float[] pidsRenderValues, int pidsScreenWidth, int pidsScreenHeight) {
        super(settings);

        this.pidsType = pidsType;
        this.defaultPreset = defaultPreset;
        this.rowCount = rowCount;
        this.model = model;
        this.boxes = boxes;
        this.hasLightLayer = hasLightLayer;
        this.pidsRenderValues = pidsRenderValues;
        this.pidsScreenWidth = pidsScreenWidth;
        this.pidsScreenHeight = pidsScreenHeight;
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
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new OBJPIDSEntity(blockPos, blockState, pidsType, defaultPreset, rowCount);
    }

    public String getModel() {
        return model;
    }

    public boolean getHasLightLayer() {
        return hasLightLayer;
    }

    public float[] getPIDSRenderValues() {
        return pidsRenderValues;
    }
    
    public int getPIDSScreenWidth() {
        return pidsScreenWidth;
    }

    public int getPIDSScreenHeight() {
        return pidsScreenHeight;
    }
}