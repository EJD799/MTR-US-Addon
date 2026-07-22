package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetrobusStationNameEntity extends BlockEntityExtension {

    public BlockDCMetrobusStationNameEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METROBUS_STATION_NAME.get(), pos, state);
    }
}