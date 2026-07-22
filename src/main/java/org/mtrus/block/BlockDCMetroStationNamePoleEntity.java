package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetroStationNamePoleEntity extends BlockEntityExtension {

    public BlockDCMetroStationNamePoleEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METRO_STATION_NAME_POLE.get(), pos, state);
    }
}