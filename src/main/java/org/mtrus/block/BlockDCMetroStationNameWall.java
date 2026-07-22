package org.mtrus.block;

import org.jetbrains.annotations.Nullable;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;
import org.mtrus.ModBlocks;

import java.util.List;

public class BlockDCMetroStationNameWall extends BlockExtension implements IBlock, DirectionHelper, BlockWithEntity {

    public BlockDCMetroStationNameWall(BlockSettings blockSettings) {
        super(blockSettings);
    }


    @Override
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new BlockDCMetroStationNameWallEntity(pos, state);
    }


    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape2(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        return IBlock.getVoxelShapeByDirection(
                0,
                0,
                15,
                16,
                16,
                16,
                facing
        );
    }


    @Override
    public VoxelShape getCollisionShape2(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        return VoxelShapes.empty();
    }


    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        Direction facing = ctx.getPlayerFacing().getOpposite();
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();

        BlockPos leftPos = pos.offset(facing.rotateYClockwise());
        BlockPos rightPos = pos.offset(facing.rotateYCounterclockwise());

        if (!world.getBlockState(leftPos).isAir()
                || !world.getBlockState(rightPos).isAir()) {
            return null;
        }

        return getDefaultState2()
                .with(
                        new Property<>(FACING.data),
                        facing.data
                );
    }


    @Override
    public void onPlaced2(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        if (!world.isClient()) {
            Direction facing = IBlock.getStatePropertySafe(state, FACING);

            BlockState endState = ModBlocks.DC_METRO_STATION_NAME_WALL_END.get()
                    .getDefaultState()
                    .with(new Property<>(FACING.data), facing.data);

            world.setBlockState(
                    pos.offset(facing.rotateYClockwise()),
                    endState,
                    3
            );

            world.setBlockState(
                    pos.offset(facing.rotateYCounterclockwise()),
                    endState,
                    3
            );
        }
    }


    @Override
    public void onBreak2(
            World world,
            BlockPos pos,
            BlockState state,
            PlayerEntity player
    ) {

        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        BlockPos left = pos.offset(facing.rotateYClockwise());
        BlockPos right = pos.offset(facing.rotateYCounterclockwise());


        if (world.getBlockState(left).getBlock().data instanceof BlockDCMetroStationNameWallEnd) {
            IBlock.onBreakCreative(world, player, left);
        }


        if (world.getBlockState(right).getBlock().data instanceof BlockDCMetroStationNameWallEnd) {
            IBlock.onBreakCreative(world, player, right);
        }


        super.onBreak2(world, pos, state, player);
    }
}