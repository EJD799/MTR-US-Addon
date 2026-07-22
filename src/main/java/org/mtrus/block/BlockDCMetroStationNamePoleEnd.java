package org.mtrus.block;

import java.util.List;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;

public class BlockDCMetroStationNamePoleEnd extends BlockExtension implements IBlock, DirectionHelper {

    public BlockDCMetroStationNamePoleEnd() {
        super(
            org.mtr.mod.Blocks.createDefaultBlockSettings(false, blockState -> 0).nonOpaque()
        );
    }


    @Override
    public void onBreak2(
            World world,
            BlockPos pos,
            BlockState state,
            PlayerEntity player
    ) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        BlockPos mainPos = null;

        BlockPos[] checks = {
                pos.offset(facing.rotateYClockwise()),
                pos.offset(facing.rotateYCounterclockwise())
        };

        for (BlockPos check : checks) {
            if (world.getBlockState(check).getBlock().data instanceof BlockDCMetroStationNamePole) {
                mainPos = check;
                break;
            }
        }

        if (mainPos != null) {

            // Remove the opposite end
            BlockPos otherEnd1 = mainPos.offset(facing.rotateYClockwise());
            BlockPos otherEnd2 = mainPos.offset(facing.rotateYCounterclockwise());

            if (!otherEnd1.equals(pos) &&
                    world.getBlockState(otherEnd1).getBlock().data instanceof BlockDCMetroStationNamePoleEnd) {
                IBlock.onBreakCreative(world, player, otherEnd1);
            }

            if (!otherEnd2.equals(pos) &&
                    world.getBlockState(otherEnd2).getBlock().data instanceof BlockDCMetroStationNamePoleEnd) {
                IBlock.onBreakCreative(world, player, otherEnd2);
            }

            // Remove the main block
            IBlock.onBreakCreative(world, player, mainPos);
        }

        super.onBreak2(world, pos, state, player);
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
                6,
                16,
                16,
                8,
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
}