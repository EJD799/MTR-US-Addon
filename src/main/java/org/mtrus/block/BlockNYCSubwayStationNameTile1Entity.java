package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockNYCSubwayStationNameTile1Entity extends BlockEntityExtension {

    public BlockNYCSubwayStationNameTile1Entity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.NYC_SUBWAY_STATION_NAME_TILE_1.get(), pos, state);
    }
}