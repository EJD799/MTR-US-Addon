package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetrobusSignEntity extends BlockEntityExtension {

    public BlockDCMetrobusSignEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METROBUS_SIGN.get(), pos, state);
    }
}