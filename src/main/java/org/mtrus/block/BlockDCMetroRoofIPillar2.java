package org.mtrus.block;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

public class BlockDCMetroRoofIPillar2 extends Block {

    public static final DirectionProperty FACING =
            BlockStateProperties.HORIZONTAL_FACING;

    private final double[][] boxes = {{0, 0, 6, 11, 16, 10}};


    public BlockDCMetroRoofIPillar2(BlockBehaviour.Properties properties) {
        super(properties);

        registerDefaultState(
                defaultBlockState()
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


    @Override
    public net.minecraft.world.phys.shapes.VoxelShape getShape(
            BlockState state,
            net.minecraft.world.level.BlockGetter level,
            net.minecraft.core.BlockPos pos,
            net.minecraft.world.phys.shapes.CollisionContext context
    ) {
        net.minecraft.world.phys.shapes.VoxelShape shape =
                net.minecraft.world.phys.shapes.Shapes.empty();

        Direction facing = state.getValue(FACING);

        for (double[] box : boxes) {

            double x1 = box[0] / 16.0;
            double y1 = box[1] / 16.0;
            double z1 = box[2] / 16.0;
            double x2 = box[3] / 16.0;
            double y2 = box[4] / 16.0;
            double z2 = box[5] / 16.0;

            net.minecraft.world.phys.shapes.VoxelShape rotated;

            switch (facing) {
                case NORTH:
                    rotated = net.minecraft.world.phys.shapes.Shapes.box(
                            x1, y1, z1,
                            x2, y2, z2
                    );
                    break;

                case SOUTH:
                    rotated = net.minecraft.world.phys.shapes.Shapes.box(
                            1 - x2, y1, 1 - z2,
                            1 - x1, y2, 1 - z1
                    );
                    break;

                case EAST:
                    rotated = net.minecraft.world.phys.shapes.Shapes.box(
                            1 - z2, y1, x1,
                            1 - z1, y2, x2
                    );
                    break;

                case WEST:
                    rotated = net.minecraft.world.phys.shapes.Shapes.box(
                            z1, y1, 1 - x2,
                            z2, y2, 1 - x1
                    );
                    break;

                default:
                    rotated = net.minecraft.world.phys.shapes.Shapes.box(
                            x1, y1, z1,
                            x2, y2, z2
                    );
            }

            shape = net.minecraft.world.phys.shapes.Shapes.or(shape, rotated);
        }

        return shape;
    }


    @Override
    public net.minecraft.world.phys.shapes.VoxelShape getCollisionShape(
            BlockState state,
            net.minecraft.world.level.BlockGetter level,
            net.minecraft.core.BlockPos pos,
            net.minecraft.world.phys.shapes.CollisionContext context
    ) {
        return getShape(state, level, pos, context);
    }
}