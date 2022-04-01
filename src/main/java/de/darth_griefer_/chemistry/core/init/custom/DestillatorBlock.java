package de.darth_griefer_.chemistry.core.init.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class DestillatorBlock extends HorizontalBlock {
    public DestillatorBlock(Properties builder) {
        super(builder);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(3, 1, 10, 6, 2, 13),
            Block.makeCuboidShape(7, 1, 4, 10, 2, 7),
            Block.makeCuboidShape(6, 2, 10, 7, 5, 13),
            Block.makeCuboidShape(10, 2, 4, 11, 15, 7),
            Block.makeCuboidShape(6, 2, 4, 7, 15, 7),
            Block.makeCuboidShape(7, 2, 3, 10, 15, 4),
            Block.makeCuboidShape(3, 2, 9, 6, 5, 10),
            Block.makeCuboidShape(7, 2, 7, 10, 8, 8),
            Block.makeCuboidShape(7, 9, 7, 10, 15, 8),
            Block.makeCuboidShape(3, 2, 13, 6, 5, 14),
            Block.makeCuboidShape(2, 2, 10, 3, 5, 13),
            Block.makeCuboidShape(8, 1, 7, 9, 2, 8),
            Block.makeCuboidShape(10, 1, 5, 11, 2, 6),
            Block.makeCuboidShape(8, 1, 3, 9, 2, 4),
            Block.makeCuboidShape(6, 1, 5, 7, 2, 6),
            Block.makeCuboidShape(4, 1, 9, 5, 2, 10),
            Block.makeCuboidShape(2, 1, 11, 3, 2, 12),
            Block.makeCuboidShape(6, 1, 11, 7, 2, 12),
            Block.makeCuboidShape(4, 1, 13, 5, 2, 14),
            Block.makeCuboidShape(12, 1, 11, 13, 2, 12),
            Block.makeCuboidShape(12, 14, 11, 13, 15, 12),
            Block.makeCuboidShape(13, 1, 11, 14, 15, 12),
            Block.makeCuboidShape(12, 1, 12, 13, 15, 13),
            Block.makeCuboidShape(11, 1, 11, 12, 9, 12),
            Block.makeCuboidShape(12, 1, 10, 13, 15, 11),
            Block.makeCuboidShape(3, 6, 11, 4, 15, 12),
            Block.makeCuboidShape(4, 6, 10, 5, 15, 11),
            Block.makeCuboidShape(5, 6, 11, 6, 9, 12),
            Block.makeCuboidShape(5, 12, 11, 6, 15, 12),
            Block.makeCuboidShape(11, 12, 11, 12, 15, 12),
            Block.makeCuboidShape(4, 6, 12, 5, 15, 13),
            Block.makeCuboidShape(5, 5, 10, 6, 6, 13),
            Block.makeCuboidShape(3, 5, 10, 4, 6, 13),
            Block.makeCuboidShape(4, 5, 10, 5, 6, 11),
            Block.makeCuboidShape(4, 5, 12, 5, 6, 13),
            Block.makeCuboidShape(14, 1, 14, 16, 15, 16),
            Block.makeCuboidShape(14, 1, 0, 16, 15, 2),
            Block.makeCuboidShape(0, 1, 0, 2, 15, 2),
            Block.makeCuboidShape(0, 1, 14, 2, 15, 16),
            Block.makeCuboidShape(5, 9, 11, 8, 10, 12),
            Block.makeCuboidShape(9, 9, 11, 12, 10, 12),
            Block.makeCuboidShape(5, 11, 11, 12, 12, 12),
            Block.makeCuboidShape(5, 10, 12, 12, 11, 13),
            Block.makeCuboidShape(5, 10, 10, 12, 11, 11),
            Block.makeCuboidShape(8, 7, 12, 9, 10, 13),
            Block.makeCuboidShape(7, 8, 7, 8, 9, 12),
            Block.makeCuboidShape(9, 8, 7, 10, 9, 12),
            Block.makeCuboidShape(8, 7, 8, 9, 8, 12),
            Block.makeCuboidShape(8, 9, 8, 9, 10, 11),
            Block.makeCuboidShape(6, 1, 1, 10, 15, 2),
            Block.makeCuboidShape(5, 1, 0, 6, 15, 2),
            Block.makeCuboidShape(10, 1, 0, 11, 15, 2),
            Block.makeCuboidShape(6, 1, 0, 7, 3, 1),
            Block.makeCuboidShape(8, 1, 0, 9, 3, 1),
            Block.makeCuboidShape(9, 4, 0, 10, 6, 1),
            Block.makeCuboidShape(7, 4, 0, 8, 6, 1),
            Block.makeCuboidShape(6, 7, 0, 7, 9, 1),
            Block.makeCuboidShape(8, 7, 0, 9, 9, 1),
            Block.makeCuboidShape(9, 10, 0, 10, 12, 1),
            Block.makeCuboidShape(7, 10, 0, 8, 12, 1),
            Block.makeCuboidShape(6, 13, 0, 7, 15, 1),
            Block.makeCuboidShape(8, 13, 0, 9, 15, 1),
            Block.makeCuboidShape(6, 3, 0, 10, 4, 1),
            Block.makeCuboidShape(6, 6, 0, 10, 7, 1),
            Block.makeCuboidShape(6, 9, 0, 10, 10, 1),
            Block.makeCuboidShape(6, 12, 0, 10, 13, 1),
            Block.makeCuboidShape(7, 1, 0, 8, 3, 1),
            Block.makeCuboidShape(9, 1, 0, 10, 3, 1),
            Block.makeCuboidShape(8, 4, 0, 9, 6, 1),
            Block.makeCuboidShape(6, 4, 0, 7, 6, 1),
            Block.makeCuboidShape(7, 7, 0, 8, 9, 1),
            Block.makeCuboidShape(9, 7, 0, 10, 9, 1),
            Block.makeCuboidShape(8, 10, 0, 9, 12, 1),
            Block.makeCuboidShape(6, 10, 0, 7, 12, 1),
            Block.makeCuboidShape(7, 13, 0, 8, 15, 1),
            Block.makeCuboidShape(9, 13, 0, 10, 15, 1)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(3, 1, 3, 6, 2, 6),
            Block.makeCuboidShape(9, 1, 7, 12, 2, 10),
            Block.makeCuboidShape(3, 2, 6, 6, 5, 7),
            Block.makeCuboidShape(9, 2, 10, 12, 15, 11),
            Block.makeCuboidShape(9, 2, 6, 12, 15, 7),
            Block.makeCuboidShape(12, 2, 7, 13, 15, 10),
            Block.makeCuboidShape(6, 2, 3, 7, 5, 6),
            Block.makeCuboidShape(8, 2, 7, 9, 8, 10),
            Block.makeCuboidShape(8, 9, 7, 9, 15, 10),
            Block.makeCuboidShape(2, 2, 3, 3, 5, 6),
            Block.makeCuboidShape(3, 2, 2, 6, 5, 3),
            Block.makeCuboidShape(8, 1, 8, 9, 2, 9),
            Block.makeCuboidShape(10, 1, 10, 11, 2, 11),
            Block.makeCuboidShape(12, 1, 8, 13, 2, 9),
            Block.makeCuboidShape(10, 1, 6, 11, 2, 7),
            Block.makeCuboidShape(6, 1, 4, 7, 2, 5),
            Block.makeCuboidShape(4, 1, 2, 5, 2, 3),
            Block.makeCuboidShape(4, 1, 6, 5, 2, 7),
            Block.makeCuboidShape(2, 1, 4, 3, 2, 5),
            Block.makeCuboidShape(4, 1, 12, 5, 2, 13),
            Block.makeCuboidShape(4, 14, 12, 5, 15, 13),
            Block.makeCuboidShape(4, 1, 13, 5, 15, 14),
            Block.makeCuboidShape(3, 1, 12, 4, 15, 13),
            Block.makeCuboidShape(4, 1, 11, 5, 9, 12),
            Block.makeCuboidShape(5, 1, 12, 6, 15, 13),
            Block.makeCuboidShape(4, 6, 3, 5, 15, 4),
            Block.makeCuboidShape(5, 6, 4, 6, 15, 5),
            Block.makeCuboidShape(4, 6, 5, 5, 9, 6),
            Block.makeCuboidShape(4, 12, 5, 5, 15, 6),
            Block.makeCuboidShape(4, 12, 11, 5, 15, 12),
            Block.makeCuboidShape(3, 6, 4, 4, 15, 5),
            Block.makeCuboidShape(3, 5, 5, 6, 6, 6),
            Block.makeCuboidShape(3, 5, 3, 6, 6, 4),
            Block.makeCuboidShape(5, 5, 4, 6, 6, 5),
            Block.makeCuboidShape(3, 5, 4, 4, 6, 5),
            Block.makeCuboidShape(0, 1, 14, 2, 15, 16),
            Block.makeCuboidShape(14, 1, 14, 16, 15, 16),
            Block.makeCuboidShape(14, 1, 0, 16, 15, 2),
            Block.makeCuboidShape(0, 1, 0, 2, 15, 2),
            Block.makeCuboidShape(4, 9, 5, 5, 10, 8),
            Block.makeCuboidShape(4, 9, 9, 5, 10, 12),
            Block.makeCuboidShape(4, 11, 5, 5, 12, 12),
            Block.makeCuboidShape(3, 10, 5, 4, 11, 12),
            Block.makeCuboidShape(5, 10, 5, 6, 11, 12),
            Block.makeCuboidShape(3, 7, 8, 4, 10, 9),
            Block.makeCuboidShape(4, 8, 7, 9, 9, 8),
            Block.makeCuboidShape(4, 8, 9, 9, 9, 10),
            Block.makeCuboidShape(4, 7, 8, 8, 8, 9),
            Block.makeCuboidShape(5, 9, 8, 8, 10, 9),
            Block.makeCuboidShape(14, 1, 6, 15, 15, 10),
            Block.makeCuboidShape(14, 1, 5, 16, 15, 6),
            Block.makeCuboidShape(14, 1, 10, 16, 15, 11),
            Block.makeCuboidShape(15, 1, 6, 16, 3, 7),
            Block.makeCuboidShape(15, 1, 8, 16, 3, 9),
            Block.makeCuboidShape(15, 4, 9, 16, 6, 10),
            Block.makeCuboidShape(15, 4, 7, 16, 6, 8),
            Block.makeCuboidShape(15, 7, 6, 16, 9, 7),
            Block.makeCuboidShape(15, 7, 8, 16, 9, 9),
            Block.makeCuboidShape(15, 10, 9, 16, 12, 10),
            Block.makeCuboidShape(15, 10, 7, 16, 12, 8),
            Block.makeCuboidShape(15, 13, 6, 16, 15, 7),
            Block.makeCuboidShape(15, 13, 8, 16, 15, 9),
            Block.makeCuboidShape(15, 3, 6, 16, 4, 10),
            Block.makeCuboidShape(15, 6, 6, 16, 7, 10),
            Block.makeCuboidShape(15, 9, 6, 16, 10, 10),
            Block.makeCuboidShape(15, 12, 6, 16, 13, 10),
            Block.makeCuboidShape(15, 1, 7, 16, 3, 8),
            Block.makeCuboidShape(15, 1, 9, 16, 3, 10),
            Block.makeCuboidShape(15, 4, 8, 16, 6, 9),
            Block.makeCuboidShape(15, 4, 6, 16, 6, 7),
            Block.makeCuboidShape(15, 7, 7, 16, 9, 8),
            Block.makeCuboidShape(15, 7, 9, 16, 9, 10),
            Block.makeCuboidShape(15, 10, 8, 16, 12, 9),
            Block.makeCuboidShape(15, 10, 6, 16, 12, 7),
            Block.makeCuboidShape(15, 13, 7, 16, 15, 8),
            Block.makeCuboidShape(15, 13, 9, 16, 15, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(10, 1, 3, 13, 2, 6),
            Block.makeCuboidShape(6, 1, 9, 9, 2, 12),
            Block.makeCuboidShape(9, 2, 3, 10, 5, 6),
            Block.makeCuboidShape(5, 2, 9, 6, 15, 12),
            Block.makeCuboidShape(9, 2, 9, 10, 15, 12),
            Block.makeCuboidShape(6, 2, 12, 9, 15, 13),
            Block.makeCuboidShape(10, 2, 6, 13, 5, 7),
            Block.makeCuboidShape(6, 2, 8, 9, 8, 9),
            Block.makeCuboidShape(6, 9, 8, 9, 15, 9),
            Block.makeCuboidShape(10, 2, 2, 13, 5, 3),
            Block.makeCuboidShape(13, 2, 3, 14, 5, 6),
            Block.makeCuboidShape(7, 1, 8, 8, 2, 9),
            Block.makeCuboidShape(5, 1, 10, 6, 2, 11),
            Block.makeCuboidShape(7, 1, 12, 8, 2, 13),
            Block.makeCuboidShape(9, 1, 10, 10, 2, 11),
            Block.makeCuboidShape(11, 1, 6, 12, 2, 7),
            Block.makeCuboidShape(13, 1, 4, 14, 2, 5),
            Block.makeCuboidShape(9, 1, 4, 10, 2, 5),
            Block.makeCuboidShape(11, 1, 2, 12, 2, 3),
            Block.makeCuboidShape(3, 1, 4, 4, 2, 5),
            Block.makeCuboidShape(3, 14, 4, 4, 15, 5),
            Block.makeCuboidShape(2, 1, 4, 3, 15, 5),
            Block.makeCuboidShape(3, 1, 3, 4, 15, 4),
            Block.makeCuboidShape(4, 1, 4, 5, 9, 5),
            Block.makeCuboidShape(3, 1, 5, 4, 15, 6),
            Block.makeCuboidShape(12, 6, 4, 13, 15, 5),
            Block.makeCuboidShape(11, 6, 5, 12, 15, 6),
            Block.makeCuboidShape(10, 6, 4, 11, 9, 5),
            Block.makeCuboidShape(10, 12, 4, 11, 15, 5),
            Block.makeCuboidShape(4, 12, 4, 5, 15, 5),
            Block.makeCuboidShape(11, 6, 3, 12, 15, 4),
            Block.makeCuboidShape(10, 5, 3, 11, 6, 6),
            Block.makeCuboidShape(12, 5, 3, 13, 6, 6),
            Block.makeCuboidShape(11, 5, 5, 12, 6, 6),
            Block.makeCuboidShape(11, 5, 3, 12, 6, 4),
            Block.makeCuboidShape(0, 1, 0, 2, 15, 2),
            Block.makeCuboidShape(0, 1, 14, 2, 15, 16),
            Block.makeCuboidShape(14, 1, 14, 16, 15, 16),
            Block.makeCuboidShape(14, 1, 0, 16, 15, 2),
            Block.makeCuboidShape(8, 9, 4, 11, 10, 5),
            Block.makeCuboidShape(4, 9, 4, 7, 10, 5),
            Block.makeCuboidShape(4, 11, 4, 11, 12, 5),
            Block.makeCuboidShape(4, 10, 3, 11, 11, 4),
            Block.makeCuboidShape(4, 10, 5, 11, 11, 6),
            Block.makeCuboidShape(7, 7, 3, 8, 10, 4),
            Block.makeCuboidShape(8, 8, 4, 9, 9, 9),
            Block.makeCuboidShape(6, 8, 4, 7, 9, 9),
            Block.makeCuboidShape(7, 7, 4, 8, 8, 8),
            Block.makeCuboidShape(7, 9, 5, 8, 10, 8),
            Block.makeCuboidShape(6, 1, 14, 10, 15, 15),
            Block.makeCuboidShape(10, 1, 14, 11, 15, 16),
            Block.makeCuboidShape(5, 1, 14, 6, 15, 16),
            Block.makeCuboidShape(9, 1, 15, 10, 3, 16),
            Block.makeCuboidShape(7, 1, 15, 8, 3, 16),
            Block.makeCuboidShape(6, 4, 15, 7, 6, 16),
            Block.makeCuboidShape(8, 4, 15, 9, 6, 16),
            Block.makeCuboidShape(9, 7, 15, 10, 9, 16),
            Block.makeCuboidShape(7, 7, 15, 8, 9, 16),
            Block.makeCuboidShape(6, 10, 15, 7, 12, 16),
            Block.makeCuboidShape(8, 10, 15, 9, 12, 16),
            Block.makeCuboidShape(9, 13, 15, 10, 15, 16),
            Block.makeCuboidShape(7, 13, 15, 8, 15, 16),
            Block.makeCuboidShape(6, 3, 15, 10, 4, 16),
            Block.makeCuboidShape(6, 6, 15, 10, 7, 16),
            Block.makeCuboidShape(6, 9, 15, 10, 10, 16),
            Block.makeCuboidShape(6, 12, 15, 10, 13, 16),
            Block.makeCuboidShape(8, 1, 15, 9, 3, 16),
            Block.makeCuboidShape(6, 1, 15, 7, 3, 16),
            Block.makeCuboidShape(7, 4, 15, 8, 6, 16),
            Block.makeCuboidShape(9, 4, 15, 10, 6, 16),
            Block.makeCuboidShape(8, 7, 15, 9, 9, 16),
            Block.makeCuboidShape(6, 7, 15, 7, 9, 16),
            Block.makeCuboidShape(7, 10, 15, 8, 12, 16),
            Block.makeCuboidShape(9, 10, 15, 10, 12, 16),
            Block.makeCuboidShape(8, 13, 15, 9, 15, 16),
            Block.makeCuboidShape(6, 13, 15, 7, 15, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(10, 1, 10, 13, 2, 13),
            Block.makeCuboidShape(4, 1, 6, 7, 2, 9),
            Block.makeCuboidShape(10, 2, 9, 13, 5, 10),
            Block.makeCuboidShape(4, 2, 5, 7, 15, 6),
            Block.makeCuboidShape(4, 2, 9, 7, 15, 10),
            Block.makeCuboidShape(3, 2, 6, 4, 15, 9),
            Block.makeCuboidShape(9, 2, 10, 10, 5, 13),
            Block.makeCuboidShape(7, 2, 6, 8, 8, 9),
            Block.makeCuboidShape(7, 9, 6, 8, 15, 9),
            Block.makeCuboidShape(13, 2, 10, 14, 5, 13),
            Block.makeCuboidShape(10, 2, 13, 13, 5, 14),
            Block.makeCuboidShape(7, 1, 7, 8, 2, 8),
            Block.makeCuboidShape(5, 1, 5, 6, 2, 6),
            Block.makeCuboidShape(3, 1, 7, 4, 2, 8),
            Block.makeCuboidShape(5, 1, 9, 6, 2, 10),
            Block.makeCuboidShape(9, 1, 11, 10, 2, 12),
            Block.makeCuboidShape(11, 1, 13, 12, 2, 14),
            Block.makeCuboidShape(11, 1, 9, 12, 2, 10),
            Block.makeCuboidShape(13, 1, 11, 14, 2, 12),
            Block.makeCuboidShape(11, 1, 3, 12, 2, 4),
            Block.makeCuboidShape(11, 14, 3, 12, 15, 4),
            Block.makeCuboidShape(11, 1, 2, 12, 15, 3),
            Block.makeCuboidShape(12, 1, 3, 13, 15, 4),
            Block.makeCuboidShape(11, 1, 4, 12, 9, 5),
            Block.makeCuboidShape(10, 1, 3, 11, 15, 4),
            Block.makeCuboidShape(11, 6, 12, 12, 15, 13),
            Block.makeCuboidShape(10, 6, 11, 11, 15, 12),
            Block.makeCuboidShape(11, 6, 10, 12, 9, 11),
            Block.makeCuboidShape(11, 12, 10, 12, 15, 11),
            Block.makeCuboidShape(11, 12, 4, 12, 15, 5),
            Block.makeCuboidShape(12, 6, 11, 13, 15, 12),
            Block.makeCuboidShape(10, 5, 10, 13, 6, 11),
            Block.makeCuboidShape(10, 5, 12, 13, 6, 13),
            Block.makeCuboidShape(10, 5, 11, 11, 6, 12),
            Block.makeCuboidShape(12, 5, 11, 13, 6, 12),
            Block.makeCuboidShape(14, 1, 0, 16, 15, 2),
            Block.makeCuboidShape(0, 1, 0, 2, 15, 2),
            Block.makeCuboidShape(0, 1, 14, 2, 15, 16),
            Block.makeCuboidShape(14, 1, 14, 16, 15, 16),
            Block.makeCuboidShape(11, 9, 8, 12, 10, 11),
            Block.makeCuboidShape(11, 9, 4, 12, 10, 7),
            Block.makeCuboidShape(11, 11, 4, 12, 12, 11),
            Block.makeCuboidShape(12, 10, 4, 13, 11, 11),
            Block.makeCuboidShape(10, 10, 4, 11, 11, 11),
            Block.makeCuboidShape(12, 7, 7, 13, 10, 8),
            Block.makeCuboidShape(7, 8, 8, 12, 9, 9),
            Block.makeCuboidShape(7, 8, 6, 12, 9, 7),
            Block.makeCuboidShape(8, 7, 7, 12, 8, 8),
            Block.makeCuboidShape(8, 9, 7, 11, 10, 8),
            Block.makeCuboidShape(1, 1, 6, 2, 15, 10),
            Block.makeCuboidShape(0, 1, 10, 2, 15, 11),
            Block.makeCuboidShape(0, 1, 5, 2, 15, 6),
            Block.makeCuboidShape(0, 1, 9, 1, 3, 10),
            Block.makeCuboidShape(0, 1, 7, 1, 3, 8),
            Block.makeCuboidShape(0, 4, 6, 1, 6, 7),
            Block.makeCuboidShape(0, 4, 8, 1, 6, 9),
            Block.makeCuboidShape(0, 7, 9, 1, 9, 10),
            Block.makeCuboidShape(0, 7, 7, 1, 9, 8),
            Block.makeCuboidShape(0, 10, 6, 1, 12, 7),
            Block.makeCuboidShape(0, 10, 8, 1, 12, 9),
            Block.makeCuboidShape(0, 13, 9, 1, 15, 10),
            Block.makeCuboidShape(0, 13, 7, 1, 15, 8),
            Block.makeCuboidShape(0, 3, 6, 1, 4, 10),
            Block.makeCuboidShape(0, 6, 6, 1, 7, 10),
            Block.makeCuboidShape(0, 9, 6, 1, 10, 10),
            Block.makeCuboidShape(0, 12, 6, 1, 13, 10),
            Block.makeCuboidShape(0, 1, 8, 1, 3, 9),
            Block.makeCuboidShape(0, 1, 6, 1, 3, 7),
            Block.makeCuboidShape(0, 4, 7, 1, 6, 8),
            Block.makeCuboidShape(0, 4, 9, 1, 6, 10),
            Block.makeCuboidShape(0, 7, 8, 1, 9, 9),
            Block.makeCuboidShape(0, 7, 6, 1, 9, 7),
            Block.makeCuboidShape(0, 10, 7, 1, 12, 8),
            Block.makeCuboidShape(0, 10, 9, 1, 12, 10),
            Block.makeCuboidShape(0, 13, 8, 1, 15, 9),
            Block.makeCuboidShape(0, 13, 6, 1, 15, 7)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch (state.get(HORIZONTAL_FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;

            default:
                return SHAPE_N;

        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

}
