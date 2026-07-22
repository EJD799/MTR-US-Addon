package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mod.block.BlockPSDTop;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetroPSDGlassEntity extends BlockPSDTop.BlockEntityBase {
    public BlockDCMetroPSDGlassEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METRO_PSD_GLASS.get(), pos, state);
    }
}