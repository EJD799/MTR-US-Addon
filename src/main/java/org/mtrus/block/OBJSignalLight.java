package org.mtrus.block;

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public BlockState getPlacementState2(ItemPlacementContext ctx) {
		BlockState superState = super.getPlacementState2(ctx);
		return superState == null ? null : superState.with(new Property((net.minecraft.world.level.block.state.properties.Property)FACING.data), Direction.fromHorizontal(ctx.getPlayerFacing().getHorizontal()).data);
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

	@Override
	public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        for (double[] box : boxes) {
            VoxelShape voxel = IBlock.getVoxelShapeByDirection(box[0], box[1], box[2], box[3], box[4], box[5], facing);
            shape = VoxelShapes.union(shape, voxel);
        }

        return shape;
    }

	@Override
	public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return getOutlineShape2(state, world, pos, context);
	}
}