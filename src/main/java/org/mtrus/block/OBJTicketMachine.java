package org.mtrus.block;

import static org.mtr.mod.Blocks.createDefaultBlockSettings;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mod.block.BlockTicketMachine;

public class OBJTicketMachine extends BlockTicketMachine implements BlockWithEntity {
    private final String model;
    private final boolean hasLightLayer;

    public OBJTicketMachine(String model, boolean hasLightLayer) {
        super(createDefaultBlockSettings(false).nonOpaque());

        this.model = model;
        this.hasLightLayer = hasLightLayer;
    }

    @Override
    public BlockEntityExtension createBlockEntity(
            BlockPos pos,
            org.mtr.mapping.holder.BlockState state
    ) {
        return new OBJTicketMachineEntity(pos, state);
    }

    public String getModel() {
        return model;
    }

    public Boolean getHasLightLayer() {
        return hasLightLayer;
    }
}