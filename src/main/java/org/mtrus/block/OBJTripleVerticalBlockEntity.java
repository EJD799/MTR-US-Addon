package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class OBJTripleVerticalBlockEntity extends BlockEntityExtension {

    public OBJTripleVerticalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.OBJ_TRIPLE_VERTICAL_BLOCK.get(), pos, state);
    }
}