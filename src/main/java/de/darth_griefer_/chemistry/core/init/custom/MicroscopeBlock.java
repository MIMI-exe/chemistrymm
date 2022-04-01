package de.darth_griefer_.chemistry.core.init.custom;

import de.darth_griefer_.chemistry.container.LightningChannelerContainer;
import de.darth_griefer_.chemistry.container.MicroscopeContainer;
import de.darth_griefer_.chemistry.tileentity.LightningChannelerTile;
import de.darth_griefer_.chemistry.tileentity.MicroscopeTile;
import de.darth_griefer_.chemistry.tileentity.ModTileEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class MicroscopeBlock extends HorizontalBlock {
    public MicroscopeBlock(Properties builder) {
        super(builder);
    }

    private INamedContainerProvider createContainerProvider(World worldIn, BlockPos pos) {
        return new INamedContainerProvider() {
            @Override
            public ITextComponent getDisplayName() {
                return new TranslationTextComponent("screen.chemistry.lightning_channeler");
            }

            @Nullable
            @Override
            public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
                return new MicroscopeContainer(i, worldIn, pos, playerInventory, playerEntity);
            }
        };
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntities.MICROSCOPE_TILE.get().create();
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(11, 0, 4, 12, 1, 5),
            Block.makeCuboidShape(4, 0, 4, 5, 1, 5),
            Block.makeCuboidShape(4, 0, 11, 5, 1, 12),
            Block.makeCuboidShape(11, 0, 11, 12, 1, 12),
            Block.makeCuboidShape(3, 1, 3, 13, 2, 11),
            Block.makeCuboidShape(7, 0, 12, 9, 3, 14),
            Block.makeCuboidShape(9, 1, 11, 13, 2, 13),
            Block.makeCuboidShape(3, 1, 11, 7, 2, 13),
            Block.makeCuboidShape(7, 3, 13, 9, 4, 14),
            Block.makeCuboidShape(9, 2, 10, 10, 3, 13),
            Block.makeCuboidShape(9, 4, 10, 10, 5, 13),
            Block.makeCuboidShape(6, 2, 10, 7, 3, 13),
            Block.makeCuboidShape(6, 4, 10, 7, 5, 13),
            Block.makeCuboidShape(5, 3, 12, 11, 4, 13),
            Block.makeCuboidShape(11, 3, 4, 12, 4, 13),
            Block.makeCuboidShape(4, 3, 4, 5, 4, 13),
            Block.makeCuboidShape(5, 3, 4, 11, 4, 12),
            Block.makeCuboidShape(7, 1, 11, 9, 2, 12),
            Block.makeCuboidShape(7, 4, 12, 9, 6, 14),
            Block.makeCuboidShape(7, 6, 11, 9, 8, 14),
            Block.makeCuboidShape(7, 8, 11, 9, 9, 13),
            Block.makeCuboidShape(7, 10, 10, 9, 11, 12),
            Block.makeCuboidShape(6, 12, 9, 10, 13, 11),
            Block.makeCuboidShape(7, 9, 10, 9, 10, 13),
            Block.makeCuboidShape(7, 11, 9, 9, 12, 12),
            Block.makeCuboidShape(7, 13, 9, 9, 14, 10),
            Block.makeCuboidShape(7, 8, 8, 9, 16, 9),
            Block.makeCuboidShape(7, 8, 5, 9, 16, 6),
            Block.makeCuboidShape(6, 8, 6, 7, 16, 8),
            Block.makeCuboidShape(9, 8, 6, 10, 16, 8),
            Block.makeCuboidShape(7, 8, 6, 9, 15, 8),
            Block.makeCuboidShape(7, 5, 6, 9, 8, 8),
            Block.makeCuboidShape(9, 11, 8, 10, 14, 9),
            Block.makeCuboidShape(9, 11, 5, 10, 14, 6),
            Block.makeCuboidShape(6, 11, 5, 7, 14, 6),
            Block.makeCuboidShape(7, 11, 4, 9, 14, 5),
            Block.makeCuboidShape(6, 11, 8, 7, 14, 9),
            Block.makeCuboidShape(5, 11, 6, 6, 14, 8),
            Block.makeCuboidShape(10, 11, 6, 11, 14, 8),
            Block.makeCuboidShape(10, 12, 9, 11, 13, 12),
            Block.makeCuboidShape(5, 12, 9, 6, 13, 12),
            Block.makeCuboidShape(10, 11, 10, 11, 12, 11),
            Block.makeCuboidShape(10, 13, 10, 11, 14, 11),
            Block.makeCuboidShape(5, 13, 10, 6, 14, 11),
            Block.makeCuboidShape(5, 11, 10, 6, 12, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(4, 0, 11, 5, 1, 12),
            Block.makeCuboidShape(11, 0, 11, 12, 1, 12),
            Block.makeCuboidShape(11, 0, 4, 12, 1, 5),
            Block.makeCuboidShape(4, 0, 4, 5, 1, 5),
            Block.makeCuboidShape(3, 1, 5, 13, 2, 13),
            Block.makeCuboidShape(7, 0, 2, 9, 3, 4),
            Block.makeCuboidShape(3, 1, 3, 7, 2, 5),
            Block.makeCuboidShape(9, 1, 3, 13, 2, 5),
            Block.makeCuboidShape(7, 3, 2, 9, 4, 3),
            Block.makeCuboidShape(6, 2, 3, 7, 3, 6),
            Block.makeCuboidShape(6, 4, 3, 7, 5, 6),
            Block.makeCuboidShape(9, 2, 3, 10, 3, 6),
            Block.makeCuboidShape(9, 4, 3, 10, 5, 6),
            Block.makeCuboidShape(5, 3, 3, 11, 4, 4),
            Block.makeCuboidShape(4, 3, 3, 5, 4, 12),
            Block.makeCuboidShape(11, 3, 3, 12, 4, 12),
            Block.makeCuboidShape(5, 3, 4, 11, 4, 12),
            Block.makeCuboidShape(7, 1, 4, 9, 2, 5),
            Block.makeCuboidShape(7, 4, 2, 9, 6, 4),
            Block.makeCuboidShape(7, 6, 2, 9, 8, 5),
            Block.makeCuboidShape(7, 8, 3, 9, 9, 5),
            Block.makeCuboidShape(7, 10, 4, 9, 11, 6),
            Block.makeCuboidShape(6, 12, 5, 10, 13, 7),
            Block.makeCuboidShape(7, 9, 3, 9, 10, 6),
            Block.makeCuboidShape(7, 11, 4, 9, 12, 7),
            Block.makeCuboidShape(7, 13, 6, 9, 14, 7),
            Block.makeCuboidShape(7, 8, 7, 9, 16, 8),
            Block.makeCuboidShape(7, 8, 10, 9, 16, 11),
            Block.makeCuboidShape(9, 8, 8, 10, 16, 10),
            Block.makeCuboidShape(6, 8, 8, 7, 16, 10),
            Block.makeCuboidShape(7, 8, 8, 9, 15, 10),
            Block.makeCuboidShape(7, 5, 8, 9, 8, 10),
            Block.makeCuboidShape(6, 11, 7, 7, 14, 8),
            Block.makeCuboidShape(6, 11, 10, 7, 14, 11),
            Block.makeCuboidShape(9, 11, 10, 10, 14, 11),
            Block.makeCuboidShape(7, 11, 11, 9, 14, 12),
            Block.makeCuboidShape(9, 11, 7, 10, 14, 8),
            Block.makeCuboidShape(10, 11, 8, 11, 14, 10),
            Block.makeCuboidShape(5, 11, 8, 6, 14, 10),
            Block.makeCuboidShape(5, 12, 4, 6, 13, 7),
            Block.makeCuboidShape(10, 12, 4, 11, 13, 7),
            Block.makeCuboidShape(5, 11, 5, 6, 12, 6),
            Block.makeCuboidShape(5, 13, 5, 6, 14, 6),
            Block.makeCuboidShape(10, 13, 5, 11, 14, 6),
            Block.makeCuboidShape(10, 11, 5, 11, 12, 6)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(4, 0, 4, 5, 1, 5),
            Block.makeCuboidShape(4, 0, 11, 5, 1, 12),
            Block.makeCuboidShape(11, 0, 11, 12, 1, 12),
            Block.makeCuboidShape(11, 0, 4, 12, 1, 5),
            Block.makeCuboidShape(3, 1, 3, 11, 2, 13),
            Block.makeCuboidShape(12, 0, 7, 14, 3, 9),
            Block.makeCuboidShape(11, 1, 3, 13, 2, 7),
            Block.makeCuboidShape(11, 1, 9, 13, 2, 13),
            Block.makeCuboidShape(13, 3, 7, 14, 4, 9),
            Block.makeCuboidShape(10, 2, 6, 13, 3, 7),
            Block.makeCuboidShape(10, 4, 6, 13, 5, 7),
            Block.makeCuboidShape(10, 2, 9, 13, 3, 10),
            Block.makeCuboidShape(10, 4, 9, 13, 5, 10),
            Block.makeCuboidShape(12, 3, 5, 13, 4, 11),
            Block.makeCuboidShape(4, 3, 4, 13, 4, 5),
            Block.makeCuboidShape(4, 3, 11, 13, 4, 12),
            Block.makeCuboidShape(4, 3, 5, 12, 4, 11),
            Block.makeCuboidShape(11, 1, 7, 12, 2, 9),
            Block.makeCuboidShape(12, 4, 7, 14, 6, 9),
            Block.makeCuboidShape(11, 6, 7, 14, 8, 9),
            Block.makeCuboidShape(11, 8, 7, 13, 9, 9),
            Block.makeCuboidShape(10, 10, 7, 12, 11, 9),
            Block.makeCuboidShape(9, 12, 6, 11, 13, 10),
            Block.makeCuboidShape(10, 9, 7, 13, 10, 9),
            Block.makeCuboidShape(9, 11, 7, 12, 12, 9),
            Block.makeCuboidShape(9, 13, 7, 10, 14, 9),
            Block.makeCuboidShape(8, 8, 7, 9, 16, 9),
            Block.makeCuboidShape(5, 8, 7, 6, 16, 9),
            Block.makeCuboidShape(6, 8, 9, 8, 16, 10),
            Block.makeCuboidShape(6, 8, 6, 8, 16, 7),
            Block.makeCuboidShape(6, 8, 7, 8, 15, 9),
            Block.makeCuboidShape(6, 5, 7, 8, 8, 9),
            Block.makeCuboidShape(8, 11, 6, 9, 14, 7),
            Block.makeCuboidShape(5, 11, 6, 6, 14, 7),
            Block.makeCuboidShape(5, 11, 9, 6, 14, 10),
            Block.makeCuboidShape(4, 11, 7, 5, 14, 9),
            Block.makeCuboidShape(8, 11, 9, 9, 14, 10),
            Block.makeCuboidShape(6, 11, 10, 8, 14, 11),
            Block.makeCuboidShape(6, 11, 5, 8, 14, 6),
            Block.makeCuboidShape(9, 12, 5, 12, 13, 6),
            Block.makeCuboidShape(9, 12, 10, 12, 13, 11),
            Block.makeCuboidShape(10, 11, 5, 11, 12, 6),
            Block.makeCuboidShape(10, 13, 5, 11, 14, 6),
            Block.makeCuboidShape(10, 13, 10, 11, 14, 11),
            Block.makeCuboidShape(10, 11, 10, 11, 12, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(11, 0, 11, 12, 1, 12),
            Block.makeCuboidShape(11, 0, 4, 12, 1, 5),
            Block.makeCuboidShape(4, 0, 4, 5, 1, 5),
            Block.makeCuboidShape(4, 0, 11, 5, 1, 12),
            Block.makeCuboidShape(5, 1, 3, 13, 2, 13),
            Block.makeCuboidShape(2, 0, 7, 4, 3, 9),
            Block.makeCuboidShape(3, 1, 9, 5, 2, 13),
            Block.makeCuboidShape(3, 1, 3, 5, 2, 7),
            Block.makeCuboidShape(2, 3, 7, 3, 4, 9),
            Block.makeCuboidShape(3, 2, 9, 6, 3, 10),
            Block.makeCuboidShape(3, 4, 9, 6, 5, 10),
            Block.makeCuboidShape(3, 2, 6, 6, 3, 7),
            Block.makeCuboidShape(3, 4, 6, 6, 5, 7),
            Block.makeCuboidShape(3, 3, 5, 4, 4, 11),
            Block.makeCuboidShape(3, 3, 11, 12, 4, 12),
            Block.makeCuboidShape(3, 3, 4, 12, 4, 5),
            Block.makeCuboidShape(4, 3, 5, 12, 4, 11),
            Block.makeCuboidShape(4, 1, 7, 5, 2, 9),
            Block.makeCuboidShape(2, 4, 7, 4, 6, 9),
            Block.makeCuboidShape(2, 6, 7, 5, 8, 9),
            Block.makeCuboidShape(3, 8, 7, 5, 9, 9),
            Block.makeCuboidShape(4, 10, 7, 6, 11, 9),
            Block.makeCuboidShape(5, 12, 6, 7, 13, 10),
            Block.makeCuboidShape(3, 9, 7, 6, 10, 9),
            Block.makeCuboidShape(4, 11, 7, 7, 12, 9),
            Block.makeCuboidShape(6, 13, 7, 7, 14, 9),
            Block.makeCuboidShape(7, 8, 7, 8, 16, 9),
            Block.makeCuboidShape(10, 8, 7, 11, 16, 9),
            Block.makeCuboidShape(8, 8, 6, 10, 16, 7),
            Block.makeCuboidShape(8, 8, 9, 10, 16, 10),
            Block.makeCuboidShape(8, 8, 7, 10, 15, 9),
            Block.makeCuboidShape(8, 5, 7, 10, 8, 9),
            Block.makeCuboidShape(7, 11, 9, 8, 14, 10),
            Block.makeCuboidShape(10, 11, 9, 11, 14, 10),
            Block.makeCuboidShape(10, 11, 6, 11, 14, 7),
            Block.makeCuboidShape(11, 11, 7, 12, 14, 9),
            Block.makeCuboidShape(7, 11, 6, 8, 14, 7),
            Block.makeCuboidShape(8, 11, 5, 10, 14, 6),
            Block.makeCuboidShape(8, 11, 10, 10, 14, 11),
            Block.makeCuboidShape(4, 12, 10, 7, 13, 11),
            Block.makeCuboidShape(4, 12, 5, 7, 13, 6),
            Block.makeCuboidShape(5, 11, 10, 6, 12, 11),
            Block.makeCuboidShape(5, 13, 10, 6, 14, 11),
            Block.makeCuboidShape(5, 13, 5, 6, 14, 6),
            Block.makeCuboidShape(5, 11, 5, 6, 12, 6)
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