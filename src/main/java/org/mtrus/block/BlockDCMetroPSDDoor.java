package org.mtrus.block;

import org.mtrus.ModItems;
import org.mtrus.block.BlockDCMetroPSDDoorEntity;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.BlockPSDAPGDoorBase;
import org.mtr.mod.block.IBlock;

@SuppressWarnings("unused")
public class BlockDCMetroPSDDoor extends BlockPSDAPGDoorBase implements BlockWithEntity {
    @Override
    public Item asItem2() {
        return ModItems.DC_METRO_PSD_DOOR.get();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockDCMetroPSDDoorEntity(blockPos, blockState);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView blockView, BlockPos pos, ShapeContext shapeContext) {
        return IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 16.0, 16.0, 4.0, IBlock.getStatePropertySafe(state, FACING));
    }

    @Override
    public VoxelShape getCollisionShape2(BlockState state, BlockView blockView, BlockPos pos, ShapeContext shapeContext) {
        final BlockEntity blockEntity = blockView.getBlockEntity(pos);
        final World world = blockEntity == null ? null : blockEntity.getWorld();
        if(world == null || !world.isClient()) return VoxelShapes.empty();

        if(((BlockEntityBase) blockEntity.data).getDoorValue() == 0.0) {
            return IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 16.0, 16.0, 4.0, IBlock.getStatePropertySafe(state, FACING));
        }
        return VoxelShapes.empty();
    }
}