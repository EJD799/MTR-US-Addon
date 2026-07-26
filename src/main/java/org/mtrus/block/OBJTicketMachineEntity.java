package org.mtrus.block;

import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtrus.ModBlockEntityTypes;

public class OBJTicketMachineEntity extends BlockEntityExtension {

    public OBJTicketMachineEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.OBJ_TICKET_MACHINE.get(), pos, state);
    }
}