package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockPlatformLightEntity extends BlockEntityExtension {

    public BlockPlatformLightEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.PLATFORM_LIGHT.get(), pos, state);
    }
}