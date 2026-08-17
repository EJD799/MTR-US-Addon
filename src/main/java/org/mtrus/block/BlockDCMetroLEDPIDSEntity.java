package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.World;

// KEEP OLD BLOCK ENTITIES FOR COMPATIBILITY
public class BlockDCMetroLEDPIDSEntity extends OBJPIDSEntity {

    private boolean migrated = false;

    public BlockDCMetroLEDPIDSEntity(BlockPos blockPos, BlockState blockState) {
        super(blockPos, blockState);
    }

    @Override
    public void blockEntityTick() {
        if (migrated) {
            return;
        }

        migrated = true;

        World world = getWorld2();

        if (world != null && !world.isClient()) {
            BlockPos pos = getPos2();
            BlockState state = getCachedState2();

            world.setBlockState(pos, state);
        }
    }
}