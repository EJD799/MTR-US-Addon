package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mod.block.BlockPSDTop;
import org.mtrus.ModBlockEntityTypes;

public class BlockDCMetroPSD2GlassEntity extends BlockPSDTop.BlockEntityBase {
    public BlockDCMetroPSD2GlassEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.DC_METRO_PSD_2_GLASS.get(), pos, state);
    }
}