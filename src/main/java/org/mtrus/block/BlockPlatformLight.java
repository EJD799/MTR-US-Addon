package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.BlockPlatform;

public class BlockPlatformLight extends BlockPlatform implements BlockWithEntity {

    private final boolean light2;

    public BlockPlatformLight(BlockSettings blockSettings, boolean isIndented, boolean light2) {
        super(blockSettings, isIndented);
        this.light2 = light2;
    }

    public boolean isLight2() {
        return light2;
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos pos, BlockState state) {
        return new BlockPlatformLightEntity(pos, state);
    }
}