package org.mtrus.block;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

public class FacingSlabBlock extends SlabBlock {

    public static final DirectionProperty FACING =
            BlockStateProperties.HORIZONTAL_FACING;


    public FacingSlabBlock(BlockBehaviour.Properties properties) {
        super(properties);

        registerDefaultState(
                defaultBlockState()
                        .setValue(TYPE, net.minecraft.world.level.block.state.properties.SlabType.BOTTOM)
                        .setValue(WATERLOGGED, false)
                        .setValue(FACING, Direction.NORTH)
        );
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = super.getStateForPlacement(context);

        if (state == null) {
            return null;
        }

        return state.setValue(
                FACING,
                context.getHorizontalDirection().getOpposite()
        );
    }


    @Override
    protected void createBlockStateDefinition(
            StateDefinition.Builder<net.minecraft.world.level.block.Block, BlockState> builder
    ) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }
}