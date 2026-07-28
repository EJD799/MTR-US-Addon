package org.mtrus.block;

import org.mtrus.ModItems;
import org.mtrus.block.BlockDCMetroPSD2DoorEntity;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.BlockPSDAPGDoorBase;
import org.mtr.mod.block.IBlock;

@SuppressWarnings("unused")
public class BlockDCMetroPSD2Door extends BlockPSDAPGDoorBase implements BlockWithEntity {
    @Override
    public Item asItem2() {
        return ModItems.DC_METRO_PSD_2_DOOR.get();
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new BlockDCMetroPSD2DoorEntity(blockPos, blockState);
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