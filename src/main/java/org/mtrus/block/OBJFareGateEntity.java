package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class OBJFareGateEntity extends BlockEntityExtension {

    public OBJFareGateEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.OBJ_FARE_GATE.get(), pos, state);
    }
}