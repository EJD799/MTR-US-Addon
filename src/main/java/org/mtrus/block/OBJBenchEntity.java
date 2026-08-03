package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class OBJBenchEntity extends BlockEntityExtension {

    public OBJBenchEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.OBJ_BENCH.get(), pos, state);
    }
}