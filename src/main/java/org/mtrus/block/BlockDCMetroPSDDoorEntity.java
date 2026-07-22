package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mod.block.BlockPSDAPGDoorBase;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetroPSDDoorEntity extends BlockPSDAPGDoorBase.BlockEntityBase {
    public BlockDCMetroPSDDoorEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METRO_PSD_DOOR.get(), pos, state);
    }
}