package org.mtrus.render;

import com.lx862.jcm.mod.data.pids.preset.PIDSPresetBase;
import com.lx862.jcm.mod.render.block.PIDSRenderer;

import org.mtr.core.operation.ArrivalResponse;
import org.mtr.libraries.it.unimi.dsi.fastutil.longs.LongImmutableList;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mod.render.StoredMatrixTransformations;

import org.mtrus.block.BlockDCMetroLEDPIDSEntity;

public class RenderDCMetroLEDPIDS extends PIDSRenderer<BlockDCMetroLEDPIDSEntity> {
    @SuppressWarnings("deprecation")
    public RenderDCMetroLEDPIDS(Argument dispatcher) {
        super(dispatcher);
    }

    @Override
    public void renderPIDS(BlockDCMetroLEDPIDSEntity blockEntity, PIDSPresetBase pidsPreset, GraphicsHolder graphicsHolder, StoredMatrixTransformations storedMatrixTransformations, World world, BlockState state, BlockPos pos, Direction facing, LongImmutableList targetPlatformIds, ObjectArrayList<ArrivalResponse> arrivals, float tickDelta, boolean[] rowHidden, int light) {
        storedMatrixTransformations.add(graphicsHolderNew -> {
            graphicsHolderNew.translate(-0.21, -0.48, -0.255);
        });
        pidsPreset.render(blockEntity, graphicsHolder, storedMatrixTransformations, world, blockEntity.getPos2(), facing, targetPlatformIds, arrivals, rowHidden, tickDelta, 0, 0, 136, 76, light);
    }
}