package org.mtrus.block;

import com.lx862.jcm.mod.block.entity.PIDSBlockEntity;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.Direction;
import org.mtr.mod.block.IBlock;
import org.mtrus.ModBlockEntityTypes;

import static com.lx862.jcm.mod.block.base.DirectionalBlock.FACING;

public class OBJPIDSEntity extends PIDSBlockEntity {
    private final String pidsType;
    private final String defaultPreset;
    private final int rowCount;

    public OBJPIDSEntity(BlockPos blockPos, BlockState blockState, String pidsType, String defaultPreset, int rowCount) {
        super(ModBlockEntityTypes.OBJ_PIDS.get(), blockPos, blockState);

        this.pidsType = pidsType;
        this.defaultPreset = defaultPreset;
        this.rowCount = rowCount;
    }

    @Override
    public String getPIDSType() {
        return pidsType;
    }

    @Override
    public String getDefaultPresetId() {
        return defaultPreset;
    }

    @Override
    public int getRowAmount() {
        return rowCount;
    }

    @Override
    public boolean isKeyBlock() {
        Direction dir = IBlock.getStatePropertySafe(getCachedState2(), FACING);
        return dir.equals(Direction.NORTH) || dir.equals(Direction.EAST);
    }
}