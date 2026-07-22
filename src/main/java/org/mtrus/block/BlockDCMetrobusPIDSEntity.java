package org.mtrus.block;

import com.lx862.jcm.mod.block.entity.PIDSBlockEntity;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.Direction;
import org.mtr.mod.block.IBlock;
import org.mtrus.ModBlockEntityTypes;

import static com.lx862.jcm.mod.block.base.DirectionalBlock.FACING;

public class BlockDCMetrobusPIDSEntity extends PIDSBlockEntity {

    public BlockDCMetrobusPIDSEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntityTypes.DC_METROBUS_PIDS.get(), blockPos, blockState);
    }

    @Override
    public String getPIDSType() {
        return "pids_1a";
    }

    @Override
    public String getDefaultPresetId() {
        return "wmata_bus_pids";
    }

    @Override
    public int getRowAmount() {
        return 2;
    }

    @Override
    public boolean isKeyBlock() {
        Direction dir = IBlock.getStatePropertySafe(getCachedState2(), FACING);
        return dir.equals(Direction.NORTH) || dir.equals(Direction.EAST);
    }
}