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
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.entity.Entity;

import org.mtrus.entity.SeatEntity;
import org.mtrus.ModEntityTypes;

import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.IBlock;

import org.mtr.mapping.holder.*;

public class OBJBench extends Block implements IBlock, BlockWithEntity {

    private final String model;
    private final double[][] boxes;
    private final boolean hasLightLayer;

    public static final DirectionProperty FACING =
            BlockStateProperties.HORIZONTAL_FACING;


    public OBJBench(BlockSettings settings, String model, int lightLevel, double[][] boxes, boolean hasLightLayer) {
        super((BlockBehaviour.Properties) settings.data.lightLevel(state -> lightLevel));

        this.model = model;
        this.boxes = boxes;
        this.hasLightLayer = hasLightLayer;

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
        return new OBJBenchEntity(pos, state);
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

    public boolean getHasLightLayer() {
        return hasLightLayer;
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



    @Override
    public InteractionResult use(
            BlockState state,
            Level level,
            net.minecraft.core.BlockPos pos,
            Player player,
            InteractionHand hand,
            BlockHitResult hit
    ) {

        if (level.isClientSide()) {
            return InteractionResult.SUCCESS;
        }


        // Don't create another seat if someone is already sitting here
        for (Entity entity : level.getEntities(
                null,
                new net.minecraft.world.phys.AABB(pos)
        )) {
            if (entity instanceof SeatEntity) {
                return InteractionResult.CONSUME;
            }
        }


        SeatEntity seat = new SeatEntity(
                ModEntityTypes.SEAT.get(),
                new org.mtr.mapping.holder.World(level)
        );


        //Direction facing = state.getValue(FACING);

        double x = pos.getX() + 0.5;
        double y = pos.getY() + 0.55;
        double z = pos.getZ() + 0.5;


        // Adjust this depending on your bench model
        /*switch (facing) {
            case NORTH -> z += 0.15;
            case SOUTH -> z -= 0.15;
            case EAST -> x -= 0.15;
            case WEST -> x += 0.15;
        }*/


        seat.setPos(x, y, z);

        level.addFreshEntity(seat);

        player.startRiding(seat, true);


        return InteractionResult.CONSUME;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onRemove(
            BlockState state,
            Level level,
            net.minecraft.core.BlockPos pos,
            BlockState newState,
            boolean moved
    ) {
        if (!state.is(newState.getBlock())) {

            for (Entity entity : level.getEntities(
                    null,
                    new net.minecraft.world.phys.AABB(pos)
            )) {
                if (entity instanceof SeatEntity) {
                    entity.discard();
                }
            }
        }

        super.onRemove(state, level, pos, newState, moved);
    }
}