package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mod.block.BlockPSDAPGDoorBase;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetroPSD2DoorEntity extends BlockPSDAPGDoorBase.BlockEntityBase {
    public BlockDCMetroPSD2DoorEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METRO_PSD_2_DOOR.get(), pos, state);
    }
}