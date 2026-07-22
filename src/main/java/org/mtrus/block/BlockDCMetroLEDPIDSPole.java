package org.mtrus.block;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;


public class BlockDCMetroLEDPIDSPole extends Block {
    private final double[][] boxes = {{4, 0, 4, 12, 16, 12}};


    public BlockDCMetroLEDPIDSPole(BlockBehaviour.Properties properties) {
        super(properties);
    }


    @Override
    public net.minecraft.world.phys.shapes.VoxelShape getShape(
            BlockState state,
            net.minecraft.world.level.BlockGetter level,
            net.minecraft.core.BlockPos pos,
            net.minecraft.world.phys.shapes.CollisionContext context
    ) {
        net.minecraft.world.phys.shapes.VoxelShape shape =
                net.minecraft.world.phys.shapes.Shapes.empty();

        for (double[] box : boxes) {

            double x1 = box[0] / 16.0;
            double y1 = box[1] / 16.0;
            double z1 = box[2] / 16.0;
            double x2 = box[3] / 16.0;
            double y2 = box[4] / 16.0;
            double z2 = box[5] / 16.0;

            net.minecraft.world.phys.shapes.VoxelShape rotated = net.minecraft.world.phys.shapes.Shapes.box(
                    x1, y1, z1,
                    x2, y2, z2
            );

            shape = net.minecraft.world.phys.shapes.Shapes.or(shape, rotated);
        }

        return shape;
    }


    @Override
    public net.minecraft.world.phys.shapes.VoxelShape getCollisionShape(
            BlockState state,
            net.minecraft.world.level.BlockGetter level,
            net.minecraft.core.BlockPos pos,
            net.minecraft.world.phys.shapes.CollisionContext context
    ) {
        return getShape(state, level, pos, context);
    }
}