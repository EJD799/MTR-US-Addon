package org.mtrus.block;

import java.util.ArrayList;

import org.mtr.core.operation.BlockRails;
import org.mtr.libraries.it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import org.mtr.libraries.it.unimi.dsi.fastutil.ints.IntArrayList;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;
import org.mtr.mapping.holder.BlockEntityType;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.CompoundTag;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.InitClient;
import org.mtr.mod.packet.PacketBlockRails;
import org.mtr.mod.packet.PacketTurnOnBlockEntity;

public class OBJSignalLightEntity extends BlockEntityExtension {

    private long lastOccupiedTime1;
    private long lastOccupiedTime2;
    private int oldRedstoneLevel;
    private long lastAcceptedRedstoneTime;
    private boolean acceptRedstone;
    private boolean outputRedstone;
    public final boolean isDoubleSided;

    private final IntAVLTreeSet signalColors1 = new IntAVLTreeSet();
    private final IntAVLTreeSet signalColors2 = new IntAVLTreeSet();

    private static final String KEY_ACCEPT_REDSTONE = "accept_redstone";
    private static final String KEY_OUTPUT_REDSTONE = "output_redstone";
    private static final String KEY_SIGNAL_COLORS_1 = "signal_colors_1";
    private static final String KEY_SIGNAL_COLORS_2 = "signal_colors_2";

    public OBJSignalLightEntity(BlockEntityType<?> type, boolean isDoubleSided, BlockPos pos, BlockState state) {
        super(type, pos, state);
        this.isDoubleSided = isDoubleSided;
    }

    @Override
    public void readCompoundTag(CompoundTag compoundTag) {
        acceptRedstone = compoundTag.getBoolean(KEY_ACCEPT_REDSTONE);
        outputRedstone = compoundTag.getBoolean(KEY_OUTPUT_REDSTONE);
        signalColors1.clear();
        for (final int color : compoundTag.getIntArray(KEY_SIGNAL_COLORS_1)) {
            signalColors1.add(color);
        }
        signalColors2.clear();
        for (final int color : compoundTag.getIntArray(KEY_SIGNAL_COLORS_2)) {
            signalColors2.add(color);
        }
        super.readCompoundTag(compoundTag);
    }

    @Override
    public void writeCompoundTag(CompoundTag compoundTag) {
        compoundTag.putBoolean(KEY_ACCEPT_REDSTONE, acceptRedstone);
        compoundTag.putBoolean(KEY_OUTPUT_REDSTONE, outputRedstone);
        compoundTag.putIntArray(KEY_SIGNAL_COLORS_1, new ArrayList<>(signalColors1));
        compoundTag.putIntArray(KEY_SIGNAL_COLORS_2, new ArrayList<>(signalColors2));
        super.writeCompoundTag(compoundTag);
    }

    public void setData(boolean acceptRedstone, boolean outputRedstone, IntAVLTreeSet signalColors, boolean isBackSide) {
        this.acceptRedstone = acceptRedstone;
        this.outputRedstone = outputRedstone;
        getSignalColors(isBackSide).clear();
        getSignalColors(isBackSide).addAll(signalColors);
        markDirty2();
    }

    public boolean getAcceptRedstone() {
        return acceptRedstone;
    }

    public boolean getOutputRedstone() {
        return outputRedstone && !acceptRedstone;
    }

    public IntAVLTreeSet getSignalColors(boolean isBackSide) {
        return isBackSide ? signalColors2 : signalColors1;
    }

    public int getActualAspect(boolean occupied, boolean isBackSide) {
        final long currentTime = System.currentTimeMillis();
        if (occupied) {
            if (isBackSide) {
                lastOccupiedTime2 = currentTime;
            } else {
                lastOccupiedTime1 = currentTime;
            }
            return 1;
        } else {
            final long difference = currentTime - (isBackSide ? lastOccupiedTime2 : lastOccupiedTime1);
            if (difference >= OBJSignalLight.getCooldown2()) {
                return 0;
            } else if (difference >= OBJSignalLight.getCooldown1()) {
                return 3;
            } else {
                return 2;
            }
        }
    }

    public void checkForRedstoneUpdate(int redstoneLevel, ObjectArrayList<String> railIds1, ObjectArrayList<String> railIds2) {
        final int newRedstoneLevel = getOutputRedstone() ? redstoneLevel : 0;
        if (oldRedstoneLevel != newRedstoneLevel) {
            oldRedstoneLevel = newRedstoneLevel;
            InitClient.REGISTRY_CLIENT.sendPacketToServer(new PacketTurnOnBlockEntity(getPos2(), newRedstoneLevel));
        }

        final long currentTime = System.currentTimeMillis();
        final World world = getWorld2();

        if (getAcceptRedstone() && currentTime - lastAcceptedRedstoneTime > OBJSignalLight.getAcceptRedstoneCooldown() && world != null) {
            lastAcceptedRedstoneTime = currentTime;
            for (final Direction direction : Direction.values()) {
                if (world.isEmittingRedstonePower(getPos2().offset(direction.getOpposite()), direction)) {
                    if (!railIds1.isEmpty()) {
                        InitClient.REGISTRY_CLIENT.sendPacketToServer(new PacketBlockRails(new BlockRails(railIds1, new IntArrayList(signalColors1))));
                    }
                    if (!railIds2.isEmpty()) {
                        InitClient.REGISTRY_CLIENT.sendPacketToServer(new PacketBlockRails(new BlockRails(railIds2, new IntArrayList(signalColors2))));
                    }
                    break;
                }
            }
        }
    }
}