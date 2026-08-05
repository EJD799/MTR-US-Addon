package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockNYCSubwayEntrance2SignEntity extends BlockEntityExtension {

    public BlockNYCSubwayEntrance2SignEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.NYC_SUBWAY_ENTRANCE_2_SIGN.get(), pos, state);
    }
}