package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockNYCSubwayStationNameWallEntity extends BlockEntityExtension {

    public BlockNYCSubwayStationNameWallEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.NYC_SUBWAY_STATION_NAME_WALL.get(), pos, state);
    }
}