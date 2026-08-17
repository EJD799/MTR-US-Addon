package org.mtrus.block;

import com.lx862.jcm.mod.block.entity.PIDSBlockEntity;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.CompoundTag;
import org.mtr.mapping.holder.Direction;
import org.mtr.mod.block.IBlock;
import org.mtrus.ModBlockEntityTypes;

import static com.lx862.jcm.mod.block.base.DirectionalBlock.FACING;

public class OBJPIDSEntity extends PIDSBlockEntity {

    public OBJPIDSEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntityTypes.OBJ_PIDS.get(), blockPos, blockState);
    }

    private OBJPIDS getOBJBlock() {
        return (OBJPIDS) getCachedState2().getBlock().data;
    }

    @Override
    public String getPIDSType() {
        return getOBJBlock().getPIDSType();
    }

    @Override
    public String getDefaultPresetId() {
        return getOBJBlock().getDefaultPreset();
    }

    @Override
    public int getRowAmount() {
        return getOBJBlock().getRowCount();
    }

    @Override
    public boolean isKeyBlock() {
        Direction dir = IBlock.getStatePropertySafe(getCachedState2(), FACING);
        return dir.equals(Direction.NORTH) || dir.equals(Direction.EAST);
    }

    @Override
    public void readCompoundTag(CompoundTag compoundTag) {
        super.readCompoundTag(compoundTag);

        if (getWorld2() != null && getWorld2().isClient()) {
            getWorld2().updateListeners(
                    getPos2(),
                    getCachedState2(),
                    getCachedState2(),
                    0
            );
        }
    }
}