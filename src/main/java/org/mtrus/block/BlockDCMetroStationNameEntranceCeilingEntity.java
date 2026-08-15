package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetroStationNameEntranceCeilingEntity extends BlockEntityExtension {

    public BlockDCMetroStationNameEntranceCeilingEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METRO_STATION_NAME_ENTRANCE_CEILING.get(), pos, state);
    }
}