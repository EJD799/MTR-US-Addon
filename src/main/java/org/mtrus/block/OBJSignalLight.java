package org.mtrus.block;

import org.mtr.core.tool.Angle;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.mapper.BlockExtension;
import org.mtr.mapping.mapper.BlockWithEntity;
import org.mtr.mapping.mapper.DirectionHelper;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.Init;
import org.mtr.mod.packet.PacketOpenBlockEntityScreen;
import org.mtrus.ModBlockEntityTypes;
import org.mtr.mod.block.IBlock;

import java.util.List;

public class OBJSignalLight extends BlockExtension implements DirectionHelper, BlockWithEntity {

	public static final IntegerProperty POWER = IntegerProperty.of("power", 0, 15);
	private static final int COOLDOWN_1 = 2000;
	private static final int COOLDOWN_2 = COOLDOWN_1 + 2000;
	private static final int ACCEPT_REDSTONE_COOLDOWN = 800;

	private final String model;
	private final int aspects;
	private final String modelLight1;
	private final String modelLight2;
	private final String modelLight3;
	private final double[][] boxes;

	public OBJSignalLight(BlockSettings blockSettings, String model, boolean is3Aspect, String modelLight1, String modelLight2, String modelLight3, double[][] boxes) {
		super(blockSettings);

		this.model = model;
		this.aspects = is3Aspect ? 3 : 2;
		this.modelLight1 = modelLight1;
		this.modelLight2 = modelLight2;
		this.modelLight3 = modelLight3;
		this.boxes = boxes;
	}

	public String getModel() {
		return model;
	}

	public int getAspects() {
		return aspects;
	}

	public String getModelLight1() {
		return modelLight1;
	}

	public String getModelLight2() {
		return modelLight2;
	}

	public String getModelLight3() {
		return modelLight3;
	}

	public double[][] getBoxes() {
		return boxes;
	}

	public static int getCooldown1() {
		return COOLDOWN_1;
	}

	public static int getCooldown2() {
		return COOLDOWN_2;
	}

	public static int getAcceptRedstoneCooldown() {
		return ACCEPT_REDSTONE_COOLDOWN;
	}

	@Override
	public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		return IBlock.checkHoldingBrush(world, player, () -> {
			final BlockEntity entity = world.getBlockEntity(pos);
			if (entity != null && entity.data instanceof OBJSignalLightEntity) {
				((OBJSignalLightEntity) entity.data).markDirty2();
				Init.REGISTRY.sendPacketToClient(ServerPlayerEntity.cast(player), new PacketOpenBlockEntityScreen(pos));
			}
		});
	}

	@Override
	public BlockState getPlacementState2(ItemPlacementContext ctx) {
		final int quadrant = Angle.getQuadrant(ctx.getPlayerYaw(), true);
		return getDefaultState2().with(new Property<>(FACING.data), Direction.fromHorizontal(quadrant / 4).data);
	}

	@Override
	public boolean emitsRedstonePower2(BlockState blockState) {
		return true;
	}

	@Override
	public int getWeakRedstonePower2(BlockState state, BlockView world, BlockPos pos, Direction direction) {
		return IBlock.getStatePropertySafe(state, POWER);
	}

	@Override
	public void addBlockProperties(List<HolderBase<?>> properties) {
		properties.add(FACING);
		properties.add(POWER);
	}

	public void power(World world, BlockState state, BlockPos pos, int level) {
		final int oldPowered = IBlock.getStatePropertySafe(state, POWER);
		if (oldPowered != level) {
			world.setBlockState(pos, state.with(new Property<>(POWER.data), level));
		}
	}

	public static float getAngle(BlockState state) {
		return IBlock.getStatePropertySafe(state, DirectionHelper.FACING).asRotation();
	}

	@Override
    public BlockEntityExtension createBlockEntity(
            BlockPos pos,
            org.mtr.mapping.holder.BlockState state
    ) {
        return new OBJSignalLightEntity(ModBlockEntityTypes.OBJ_SIGNAL_LIGHT.get(), false, pos, state);
    }
}