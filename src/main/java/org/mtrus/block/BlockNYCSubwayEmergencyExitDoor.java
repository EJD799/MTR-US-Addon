package org.mtrus.block;

import java.util.List;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.block.IBlock.DoubleBlockHalf;
import org.mtrus.ModSoundEvents;

import com.lx862.jcm.mod.block.base.Vertical2Block;

public class BlockNYCSubwayEmergencyExitDoor extends Vertical2Block implements BlockWithEntity {
    public static final EnumProperty<EnumNYCSubwayEmergencyExitDoorOpen> OPEN = EnumProperty.of("open", EnumNYCSubwayEmergencyExitDoorOpen.class);

    public BlockNYCSubwayEmergencyExitDoor(BlockSettings blockSettings) {
        super(blockSettings);
    }

    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);
        
        VoxelShape shape = IBlock.getVoxelShapeByDirection(0, 0, 7.75, 16, 16, 8.25, facing);

        return shape;
    }

    @Override
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (IBlock.getStatePropertySafe(state, BlockNYCSubwayEmergencyExitDoor.OPEN) == BlockNYCSubwayEmergencyExitDoor.EnumNYCSubwayEmergencyExitDoorOpen.OPEN) {
            return VoxelShapes.empty();
        } else {
            Direction facing = IBlock.getStatePropertySafe(state, FACING);
        
            VoxelShape shape = IBlock.getVoxelShapeByDirection(0, 0, 7.75, 16, 16, 8.25, facing);

            return shape;
        }
    }

    @Override
    public BlockEntityExtension createBlockEntity(
            BlockPos pos,
            org.mtr.mapping.holder.BlockState state
    ) {
        return new BlockNYCSubwayEmergencyExitDoorEntity(pos, state);
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(OPEN);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.setBlockState(
            pos,
            state.with(
                new Property((net.minecraft.world.level.block.state.properties.Property) OPEN.data),
                EnumNYCSubwayEmergencyExitDoorOpen.OPEN
            )
        );

        BlockPos otherPos = state.get(new Property((net.minecraft.world.level.block.state.properties.Property) HALF.data))
                == DoubleBlockHalf.LOWER
                ? pos.up()
                : pos.down();

        BlockState otherState = world.getBlockState(otherPos);

        if (otherState.isOf(new Block(this))) {
            world.setBlockState(
                otherPos,
                otherState.with(
                    new Property((net.minecraft.world.level.block.state.properties.Property) OPEN.data),
                    EnumNYCSubwayEmergencyExitDoorOpen.OPEN
                )
            );
        }

        world.playSound((PlayerEntity)null, pos, ModSoundEvents.NYC_SUBWAY_EMERGENCY_EXIT_DOOR.get(), SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!hasScheduledBlockTick(world, pos, new Block(this))) {
            scheduleBlockTick(world, pos, new Block(this), 60);
        }

        return ActionResult.SUCCESS;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void scheduledTick2(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.setBlockState(
            pos,
            state.with(
                new Property((net.minecraft.world.level.block.state.properties.Property) OPEN.data),
                EnumNYCSubwayEmergencyExitDoorOpen.CLOSED
            )
        );

        BlockPos otherPos = state.get(new Property((net.minecraft.world.level.block.state.properties.Property) HALF.data))
                == DoubleBlockHalf.LOWER
                ? pos.up()
                : pos.down();

        BlockState otherState = world.getBlockState(otherPos);

        if (otherState.isOf(new Block(this))) {
            world.setBlockState(
                otherPos,
                otherState.with(
                    new Property((net.minecraft.world.level.block.state.properties.Property) OPEN.data),
                    EnumNYCSubwayEmergencyExitDoorOpen.CLOSED
                )
            );
        }
    }

    public static enum EnumNYCSubwayEmergencyExitDoorOpen implements StringIdentifiable {
        CLOSED("closed"),
        OPEN("open");

        private final String name;

        private EnumNYCSubwayEmergencyExitDoorOpen(String nameIn) {
            this.name = nameIn;
        }

        public String asString2() {
            return this.name;
        }
    }
}