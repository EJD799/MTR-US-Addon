package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetroPlatformPoleEntity extends BlockEntityExtension {

    public BlockDCMetroPlatformPoleEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METRO_PLATFORM_POLE.get(), pos, state);
    }
}