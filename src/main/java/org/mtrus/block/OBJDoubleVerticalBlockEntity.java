package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class OBJDoubleVerticalBlockEntity extends BlockEntityExtension {

    public OBJDoubleVerticalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.OBJ_DOUBLE_VERTICAL_BLOCK.get(), pos, state);
    }
}