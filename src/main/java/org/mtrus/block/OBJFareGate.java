package org.mtrus.block;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.data.TicketSystem;
import org.mtr.mod.data.TicketSystem.EnumTicketBarrierOpen;

public class OBJFareGate extends BlockTicketBarrier implements BlockWithEntity {
    private final String model1;
    private final String model2;
    private final double[][] boxes;
    private final boolean hasLightLayer;
    private final boolean isEntrance;
    private final SoundEvent sound;

    public OBJFareGate(String model1, String model2, double[][] boxes, boolean isEntrance, boolean hasLightLayer, SoundEvent sound) {
        super(isEntrance);

        this.model1 = model1;
        this.model2 = model2;
        this.boxes = boxes;
        this.hasLightLayer = hasLightLayer;
        this.isEntrance = isEntrance;
        this.sound = sound;
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        for (double[] box : boxes) {
            VoxelShape voxel = IBlock.getVoxelShapeByDirection(box[0], box[1], box[2], box[3], box[4], box[5], facing);
            shape = VoxelShapes.union(shape, voxel);
        }

        return shape;
    }

    @Override
    public BlockEntityExtension createBlockEntity(
            BlockPos pos,
            org.mtr.mapping.holder.BlockState state
    ) {
        return new OBJFareGateEntity(pos, state);
    }

    public String getModel1() {
        return model1;
    }

    public String getModel2() {
        return model2;
    }

    public Boolean getHasLightLayer() {
        return hasLightLayer;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void onEntityCollision2(BlockState state, World world, BlockPos blockPos, Entity entity) {
      if (!world.isClient() && PlayerEntity.isInstance(entity)) {
         Direction facing = IBlock.getStatePropertySafe(state, FACING);
         Vector3d playerPosRotated = entity.getPos().subtract((double)blockPos.getX() + (double)0.5F, (double)0.0F, (double)blockPos.getZ() + (double)0.5F).rotateY((float)Math.toRadians((double)facing.asRotation()));
         @SuppressWarnings({ })
         TicketSystem.EnumTicketBarrierOpen open = (TicketSystem.EnumTicketBarrierOpen)IBlock.getStatePropertySafe(state, new Property((net.minecraft.world.level.block.state.properties.Property)OPEN.data));
         if ((open == EnumTicketBarrierOpen.OPEN || open == EnumTicketBarrierOpen.OPEN_CONCESSIONARY) && playerPosRotated.getZMapped() > (double)0.0F) {
            world.setBlockState(blockPos, state.with(new Property((net.minecraft.world.level.block.state.properties.Property)OPEN.data), EnumTicketBarrierOpen.CLOSED));
         } else if (open == EnumTicketBarrierOpen.CLOSED && playerPosRotated.getZMapped() < (double)0.0F) {
            BlockPos blockPosCopy = new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ());
            world.setBlockState(blockPosCopy, state.with(new Property((net.minecraft.world.level.block.state.properties.Property)OPEN.data), EnumTicketBarrierOpen.PENDING));
            TicketSystem.passThrough(world, blockPosCopy, PlayerEntity.cast(entity), this.isEntrance, !this.isEntrance, this.sound, this.sound, this.sound, this.sound, (SoundEvent)null, false, (newOpen) -> {
               world.setBlockState(blockPosCopy, state.with(new Property((net.minecraft.world.level.block.state.properties.Property)OPEN.data), newOpen));
               if (newOpen != EnumTicketBarrierOpen.CLOSED && !hasScheduledBlockTick(world, blockPosCopy, new Block(this))) {
                  scheduleBlockTick(world, blockPosCopy, new Block(this), 40);
               }

            });
         }
      }

   }
}