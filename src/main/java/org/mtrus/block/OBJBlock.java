package org.mtrus.block;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.IBlock;

import org.mtr.mapping.holder.*;

public class OBJBlock extends Block implements IBlock, BlockWithEntity {

    private final String model;
    private final double[][] boxes;

    public static final DirectionProperty FACING =
            BlockStateProperties.HORIZONTAL_FACING;


    public OBJBlock(BlockSettings settings, String model, int lightLevel, double[][] boxes) {
        super((BlockBehaviour.Properties) settings.data.lightLevel(state -> lightLevel));

        this.model = model;
        this.boxes = boxes;

        registerDefaultState(
            defaultBlockState().setValue(FACING, Direction.NORTH)
        );
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.INVISIBLE;
    }

    @Override
    public boolean skipRendering(
            net.minecraft.world.level.block.state.BlockState state,
            net.minecraft.world.level.block.state.BlockState adjacentBlockState,
            net.minecraft.core.Direction direction
    ) {
        return false;
    }

    @Override
    public BlockEntityExtension createBlockEntity(
            BlockPos pos,
            org.mtr.mapping.holder.BlockState state
    ) {
        return new OBJBlockEntity(pos, state);
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState()
                .setValue(
                        FACING,
                        context.getHorizontalDirection().getOpposite()
                );
    }


    @Override
    protected void createBlockStateDefinition(
            StateDefinition.Builder<Block, BlockState> builder
    ) {
        builder.add(FACING);
    }


    public String getModel() {
        return model;
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