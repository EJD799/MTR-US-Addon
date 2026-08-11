package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockNYCSubwayEmergencyExitDoorEntity extends BlockEntityExtension {

    public BlockNYCSubwayEmergencyExitDoorEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.NYC_SUBWAY_EMERGENCY_EXIT_DOOR.get(), pos, state);
    }
}