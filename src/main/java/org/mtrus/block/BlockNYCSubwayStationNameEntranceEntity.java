package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockNYCSubwayStationNameEntranceEntity extends BlockEntityExtension {

    public BlockNYCSubwayStationNameEntranceEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.NYC_SUBWAY_STATION_NAME_ENTRANCE.get(), pos, state);
    }
}