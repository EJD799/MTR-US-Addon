package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockNYCSubwayEntrance1SignEntity extends BlockEntityExtension {

    public BlockNYCSubwayEntrance1SignEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.NYC_SUBWAY_ENTRANCE_1_SIGN.get(), pos, state);
    }
}