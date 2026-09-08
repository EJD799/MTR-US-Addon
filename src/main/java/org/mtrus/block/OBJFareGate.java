package org.mtrus.block;

import java.util.List;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.data.TicketSystem;
import org.mtr.mod.data.TicketSystem.EnumTicketBarrierOpen;

public class OBJFareGate extends BlockTicketBarrier implements BlockWithEntity {

    public static final EnumProperty<EnumFareGateDirection> FARE_GATE_DIRECTION =
            EnumProperty.of("fare_gate_direction", EnumFareGateDirection.class);

    private final java.util.Map<Entity, Long> twoWayCooldowns =
        new java.util.HashMap<>();

    private final String model1;
    private final String model2;
    private final String model3;
    private final double[][] boxes;
    private final boolean hasLightLayer;
    private final EnumFareGateMode mode;
    private final SoundEvent sound1;
    private final SoundEvent sound2;

    public OBJFareGate(
            String model1,
            String model2,
            String model3,
            double[][] boxes,
            EnumFareGateMode mode,
            boolean hasLightLayer,
            SoundEvent sound1,
            SoundEvent sound2
    ) {
        super(mode == EnumFareGateMode.ENTRANCE || mode == EnumFareGateMode.TWOWAY);

        this.model1 = model1;
        this.model2 = model2;
        this.model3 = model3;
        this.boxes = boxes;
        this.hasLightLayer = hasLightLayer;
        this.mode = mode;
        this.sound1 = sound1;
        this.sound2 = sound2;
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(FARE_GATE_DIRECTION);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public BlockState getPlacementState2(ItemPlacementContext ctx) {
        return this.getDefaultState2()
                .with(
                        new Property(
                                (net.minecraft.world.level.block.state.properties.Property)
                                        FACING.data
                        ),
                        ctx.getPlayerFacing().data
                )
                .with(
                        new Property(
                                (net.minecraft.world.level.block.state.properties.Property)
                                        OPEN.data
                        ),
                        EnumTicketBarrierOpen.CLOSED
                )
                .with(
                        new Property(
                                (net.minecraft.world.level.block.state.properties.Property)
                                        FARE_GATE_DIRECTION.data
                        ),
                        EnumFareGateDirection.CLOSED
                );
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void scheduledTick2(
            BlockState state,
            ServerWorld world,
            BlockPos pos,
            Random random
    ) {
        world.setBlockState(
                pos,
                state
                        .with(
                                new Property(
                                        (net.minecraft.world.level.block.state.properties.Property)
                                                OPEN.data
                                ),
                                EnumTicketBarrierOpen.CLOSED
                        )
                        .with(
                                new Property(
                                        (net.minecraft.world.level.block.state.properties.Property)
                                                FARE_GATE_DIRECTION.data
                                ),
                                EnumFareGateDirection.CLOSED
                        )
        );
    }

    @Override
    public VoxelShape getOutlineShape2(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        VoxelShape shape = VoxelShapes.empty();
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        for (double[] box : boxes) {
            VoxelShape voxel = IBlock.getVoxelShapeByDirection(
                    box[0],
                    box[1],
                    box[2],
                    box[3],
                    box[4],
                    box[5],
                    facing
            );

            shape = VoxelShapes.union(shape, voxel);
        }

        return shape;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public VoxelShape getCollisionShape2(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        TicketSystem.EnumTicketBarrierOpen open =
                (TicketSystem.EnumTicketBarrierOpen)
                        IBlock.getStatePropertySafe(
                                state,
                                new Property(
                                        (net.minecraft.world.level.block.state.properties.Property)
                                                OPEN.data
                                )
                        );

        VoxelShape leftSide = IBlock.getVoxelShapeByDirection(
                0.0,
                0.0,
                0.0,
                1.0,
                24.0,
                16.0,
                facing
        );

        VoxelShape rightSide = IBlock.getVoxelShapeByDirection(
                15.0,
                0.0,
                0.0,
                16.0,
                24.0,
                16.0,
                facing
        );

        if (open == EnumTicketBarrierOpen.OPEN
                || open == EnumTicketBarrierOpen.OPEN_CONCESSIONARY) {
            return VoxelShapes.union(leftSide, rightSide);
        }

        VoxelShape middle = IBlock.getVoxelShapeByDirection(
                0.0,
                0.0,
                7.0,
                16.0,
                24.0,
                9.0,
                facing
        );

        return VoxelShapes.union(
                VoxelShapes.union(leftSide, rightSide),
                middle
        );
    }

    @Override
    public BlockEntityExtension createBlockEntity(
            BlockPos pos,
            BlockState state
    ) {
        return new OBJFareGateEntity(pos, state);
    }

    public String getModel1() {
        return model1;
    }

    public String getModel2() {
        return model2;
    }

    public String getModel3() {
        return model3;
    }

    public Boolean getHasLightLayer() {
        return hasLightLayer;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void onEntityCollision2(
            BlockState state,
            World world,
            BlockPos blockPos,
            Entity entity
    ) {
        if (!world.isClient() && PlayerEntity.isInstance(entity)) {

            Direction facing = IBlock.getStatePropertySafe(state, FACING);

            Vector3d playerPosRotated = entity.getPos()
                    .subtract(
                            (double) blockPos.getX() + 0.5F,
                            0.0,
                            (double) blockPos.getZ() + 0.5F
                    )
                    .rotateY(
                            (float) Math.toRadians(
                                    (double) facing.asRotation()
                            )
                    );

            TicketSystem.EnumTicketBarrierOpen open =
                    (TicketSystem.EnumTicketBarrierOpen)
                            IBlock.getStatePropertySafe(
                                    state,
                                    new Property(
                                            (net.minecraft.world.level.block.state.properties.Property)
                                                    OPEN.data
                                    )
                            );

            double z = playerPosRotated.getZMapped();

            /*
            * EXIT and ENTRANCE retain the original MTR behavior.
            */
            if (mode == EnumFareGateMode.ENTRANCE
                    || mode == EnumFareGateMode.EXIT) {

                if ((open == EnumTicketBarrierOpen.OPEN
                        || open == EnumTicketBarrierOpen.OPEN_CONCESSIONARY)
                        && z > 0.0) {

                    closeGate(world, state, blockPos);

                } else if (open == EnumTicketBarrierOpen.CLOSED
                        && z < 0.0) {

                    passThrough(
                            world,
                            state,
                            blockPos,
                            entity,
                            mode == EnumFareGateMode.ENTRANCE,
                            mode == EnumFareGateMode.ENTRANCE
                                    ? EnumFareGateDirection.ENTRANCE
                                    : EnumFareGateDirection.EXIT
                    );
                }

                return;
            }

            /*
            * TWOWAY gate.
            */
            if (mode == EnumFareGateMode.TWOWAY) {

                /*
                * Remove expired cooldowns.
                */
                long currentTime = System.currentTimeMillis();

                twoWayCooldowns.entrySet().removeIf(
                        entry -> currentTime - entry.getValue() > 1000
                );

                /*
                * While the gate is open, only the direction that
                * originally opened it can close it.
                */
                if (open == EnumTicketBarrierOpen.OPEN
                        || open == EnumTicketBarrierOpen.OPEN_CONCESSIONARY) {

                    EnumFareGateDirection direction =
                            (EnumFareGateDirection)
                                    IBlock.getStatePropertySafe(
                                            state,
                                            new Property(
                                                    (net.minecraft.world.level.block.state.properties.Property)
                                                            FARE_GATE_DIRECTION.data
                                            )
                                    );

                    if (direction == EnumFareGateDirection.ENTRANCE
                            && z > 0.0) {

                        closeGate(world, state, blockPos);

                        twoWayCooldowns.put(entity, currentTime);

                    } else if (direction == EnumFareGateDirection.EXIT
                            && z < 0.0) {

                        closeGate(world, state, blockPos);

                        twoWayCooldowns.put(entity, currentTime);
                    }

                    return;
                }

                /*
                * Do not start another passage while the ticket system
                * is processing the previous one.
                */
                if (open != EnumTicketBarrierOpen.CLOSED) {
                    return;
                }

                /*
                * Prevent the player who just crossed the gate from
                * immediately triggering the opposite direction.
                */
                Long cooldownTime = twoWayCooldowns.get(entity);

                if (cooldownTime != null
                        && currentTime - cooldownTime <= 1000) {
                    return;
                }

                /*
                * Negative Z -> positive Z:
                * entrance behavior.
                */
                if (z < 0.0) {

                    passThrough(
                            world,
                            state,
                            blockPos,
                            entity,
                            true,
                            EnumFareGateDirection.ENTRANCE
                    );

                /*
                * Positive Z -> negative Z:
                * exit behavior.
                */
                } else if (z > 0.0) {

                    passThrough(
                            world,
                            state,
                            blockPos,
                            entity,
                            false,
                            EnumFareGateDirection.EXIT
                    );
                }
            }
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void passThrough(
            World world,
            BlockState state,
            BlockPos blockPos,
            Entity entity,
            boolean entrance,
            EnumFareGateDirection direction
    ) {
        BlockPos blockPosCopy = new BlockPos(
                blockPos.getX(),
                blockPos.getY(),
                blockPos.getZ()
        );

        world.setBlockState(
                blockPosCopy,
                state
                        .with(
                                new Property(
                                        (net.minecraft.world.level.block.state.properties.Property)
                                                OPEN.data
                                ),
                                EnumTicketBarrierOpen.PENDING
                        )
                        .with(
                                new Property(
                                        (net.minecraft.world.level.block.state.properties.Property)
                                                FARE_GATE_DIRECTION.data
                                ),
                                direction
                        )
        );

        SoundEvent soundToUse;

        if (direction == EnumFareGateDirection.ENTRANCE) {
            soundToUse = sound1;
        } else {
            soundToUse = sound2;
        }

        TicketSystem.passThrough(
                world,
                blockPosCopy,
                PlayerEntity.cast(entity),

                entrance,
                !entrance,

                soundToUse,
                soundToUse,
                soundToUse,
                soundToUse,

                null,
                false,

                newOpen -> {

                    EnumFareGateDirection newDirection =
                            newOpen == EnumTicketBarrierOpen.CLOSED
                                    ? EnumFareGateDirection.CLOSED
                                    : direction;

                    world.setBlockState(
                            blockPosCopy,
                            state
                                    .with(
                                            new Property(
                                                    (net.minecraft.world.level.block.state.properties.Property)
                                                            OPEN.data
                                            ),
                                            newOpen
                                    )
                                    .with(
                                            new Property(
                                                    (net.minecraft.world.level.block.state.properties.Property)
                                                            FARE_GATE_DIRECTION.data
                                            ),
                                            newDirection
                                    )
                    );

                    if (newOpen != EnumTicketBarrierOpen.CLOSED
                            && !hasScheduledBlockTick(
                                    world,
                                    blockPosCopy,
                                    new Block(this)
                            )) {

                        scheduleBlockTick(
                                world,
                                blockPosCopy,
                                new Block(this),
                                40
                        );
                    }
                }
        );
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private void closeGate(
            World world,
            BlockState state,
            BlockPos blockPos
    ) {
        world.setBlockState(
                blockPos,
                state
                        .with(
                                new Property(
                                        (net.minecraft.world.level.block.state.properties.Property)
                                                OPEN.data
                                ),
                                EnumTicketBarrierOpen.CLOSED
                        )
                        .with(
                                new Property(
                                        (net.minecraft.world.level.block.state.properties.Property)
                                                FARE_GATE_DIRECTION.data
                                ),
                                EnumFareGateDirection.CLOSED
                        )
        );
    }

    public static enum EnumFareGateDirection implements StringIdentifiable {

        CLOSED("closed"),
        ENTRANCE("entrance"),
        EXIT("exit");

        private final String name;

        private EnumFareGateDirection(String name) {
            this.name = name;
        }

        @Override
        public String asString2() {
            return this.name;
        }
    }

    public static enum EnumFareGateMode implements StringIdentifiable {

        ENTRANCE("entrance"),
        EXIT("exit"),
        TWOWAY("twoway");

        private final String name;

        private EnumFareGateMode(String nameIn) {
            this.name = nameIn;
        }

        @Override
        public String asString2() {
            return this.name;
        }
    }
}