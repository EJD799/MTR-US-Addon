package org.mtrus.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;

public class BlockDCMetroStationPole extends Block implements BlockWithEntity {

    private final Boolean isDiagonal;

    public BlockDCMetroStationPole(BlockSettings settings, Boolean isDiagonal) {
        super((BlockBehaviour.Properties) settings.data);

        this.isDiagonal = isDiagonal;

        registerDefaultState(
                defaultBlockState()
        );
    }

    @Override
    public BlockEntityExtension createBlockEntity(
            BlockPos pos,
            org.mtr.mapping.holder.BlockState state
    ) {
        return new BlockDCMetroStationPoleEntity(pos, state);
    }

    public Boolean getIsDiagonal() {
        return isDiagonal;
    }
}