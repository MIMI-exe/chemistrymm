package de.darth_griefer_.chemistry.core.init.custom;

import de.darth_griefer_.chemistry.container.LightningChannelerContainer;
import de.darth_griefer_.chemistry.tileentity.LightningChannelerTile;
import de.darth_griefer_.chemistry.tileentity.ModTileEntities;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
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
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class LightningChannelerBlock extends HorizontalBlock {
    public LightningChannelerBlock(Properties properties) {
        super(properties);
    }



    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos,
                                             PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(!worldIn.isRemote()) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);

            if(!player.isCrouching()) {
                if(tileEntity instanceof LightningChannelerTile) {
                    INamedContainerProvider containerProvider = createContainerProvider(worldIn, pos);

                    NetworkHooks.openGui(((ServerPlayerEntity)player), containerProvider, tileEntity.getPos());
                } else {
                    throw new IllegalStateException("Our Container provider is missing!");
                }
            } else {
                if(tileEntity instanceof LightningChannelerTile) {
                    if(worldIn.isThundering()) {
                        EntityType.LIGHTNING_BOLT.spawn(((ServerWorld) worldIn), null, player,
                                pos, SpawnReason.TRIGGERED, true, true);

                        ((LightningChannelerTile)tileEntity).lightningHasStruck();
                    }
                }
            }
        }
        return ActionResultType.SUCCESS;
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
                return new LightningChannelerContainer(i, worldIn, pos, playerInventory, playerEntity);
            }
        };
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntities.LIGHTNING_CHANNELER_TILE.get().create();
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(6, 4, 0, 10, 5, 4),
            Block.makeCuboidShape(5, 3, 0, 11, 4, 1),
            Block.makeCuboidShape(12, 11, 2, 13, 12, 3),
            Block.makeCuboidShape(7, 5, 1, 9, 6, 4),
            Block.makeCuboidShape(12, 12, 3, 13, 13, 4),
            Block.makeCuboidShape(3, 12, 3, 4, 13, 4),
            Block.makeCuboidShape(3, 12, 12, 4, 13, 13),
            Block.makeCuboidShape(12, 12, 12, 13, 13, 13),
            Block.makeCuboidShape(13, 10, 13, 14, 11, 14),
            Block.makeCuboidShape(13, 10, 2, 14, 11, 3),
            Block.makeCuboidShape(2, 10, 2, 3, 11, 3),
            Block.makeCuboidShape(2, 10, 13, 3, 11, 14),
            Block.makeCuboidShape(2, 11, 12, 3, 12, 13),
            Block.makeCuboidShape(3, 11, 13, 4, 12, 14),
            Block.makeCuboidShape(12, 11, 13, 13, 12, 14),
            Block.makeCuboidShape(13, 11, 12, 14, 12, 13),
            Block.makeCuboidShape(13, 11, 3, 14, 12, 4),
            Block.makeCuboidShape(3, 11, 2, 4, 12, 3),
            Block.makeCuboidShape(2, 11, 3, 3, 12, 4),
            Block.makeCuboidShape(7, 6, 7, 9, 10, 9),
            Block.makeCuboidShape(13, 10, 3, 14, 11, 5),
            Block.makeCuboidShape(13, 10, 11, 14, 11, 13),
            Block.makeCuboidShape(2, 10, 11, 3, 11, 13),
            Block.makeCuboidShape(2, 10, 3, 3, 11, 5),
            Block.makeCuboidShape(11, 10, 2, 13, 11, 3),
            Block.makeCuboidShape(11, 10, 13, 13, 11, 14),
            Block.makeCuboidShape(3, 10, 13, 5, 11, 14),
            Block.makeCuboidShape(3, 10, 2, 5, 11, 3),
            Block.makeCuboidShape(4, 4, 7, 5, 6, 9),
            Block.makeCuboidShape(11, 4, 7, 12, 6, 9),
            Block.makeCuboidShape(7, 4, 11, 9, 6, 12),
            Block.makeCuboidShape(7, 4, 4, 9, 6, 5),
            Block.makeCuboidShape(13, 9, 10, 14, 10, 13),
            Block.makeCuboidShape(13, 9, 3, 14, 10, 6),
            Block.makeCuboidShape(2, 9, 3, 3, 10, 6),
            Block.makeCuboidShape(2, 9, 10, 3, 10, 13),
            Block.makeCuboidShape(3, 9, 13, 6, 10, 14),
            Block.makeCuboidShape(10, 9, 13, 13, 10, 14),
            Block.makeCuboidShape(10, 9, 2, 13, 10, 3),
            Block.makeCuboidShape(3, 9, 2, 6, 10, 3),
            Block.makeCuboidShape(4, 8, 12, 5, 9, 13),
            Block.makeCuboidShape(11, 8, 12, 12, 9, 13),
            Block.makeCuboidShape(11, 8, 3, 12, 9, 4),
            Block.makeCuboidShape(4, 8, 3, 5, 9, 4),
            Block.makeCuboidShape(3, 8, 3, 4, 9, 5),
            Block.makeCuboidShape(3, 8, 11, 4, 9, 13),
            Block.makeCuboidShape(12, 8, 11, 13, 9, 13),
            Block.makeCuboidShape(12, 8, 3, 13, 9, 5),
            Block.makeCuboidShape(5, 8, 2, 11, 9, 3),
            Block.makeCuboidShape(5, 8, 13, 11, 9, 14),
            Block.makeCuboidShape(13, 8, 5, 14, 9, 11),
            Block.makeCuboidShape(2, 8, 5, 3, 9, 11),
            Block.makeCuboidShape(11, 7, 4, 12, 8, 5),
            Block.makeCuboidShape(11, 7, 11, 12, 8, 12),
            Block.makeCuboidShape(4, 7, 11, 5, 8, 12),
            Block.makeCuboidShape(4, 7, 4, 5, 8, 5),
            Block.makeCuboidShape(5, 7, 11, 7, 8, 13),
            Block.makeCuboidShape(7, 7, 12, 9, 8, 13),
            Block.makeCuboidShape(9, 7, 11, 11, 8, 13),
            Block.makeCuboidShape(11, 7, 9, 13, 8, 11),
            Block.makeCuboidShape(12, 7, 7, 13, 8, 9),
            Block.makeCuboidShape(11, 7, 5, 13, 8, 7),
            Block.makeCuboidShape(9, 7, 3, 11, 8, 5),
            Block.makeCuboidShape(7, 7, 3, 9, 8, 4),
            Block.makeCuboidShape(5, 7, 3, 7, 8, 5),
            Block.makeCuboidShape(3, 7, 5, 5, 8, 7),
            Block.makeCuboidShape(3, 7, 9, 5, 8, 11),
            Block.makeCuboidShape(3, 7, 7, 4, 8, 9),
            Block.makeCuboidShape(10, 6, 7, 12, 7, 9),
            Block.makeCuboidShape(7, 6, 10, 9, 7, 12),
            Block.makeCuboidShape(4, 6, 7, 6, 7, 9),
            Block.makeCuboidShape(7, 6, 4, 9, 7, 6),
            Block.makeCuboidShape(9, 6, 9, 11, 7, 11),
            Block.makeCuboidShape(5, 6, 9, 7, 7, 11),
            Block.makeCuboidShape(9, 6, 5, 11, 7, 7),
            Block.makeCuboidShape(5, 6, 5, 7, 7, 7),
            Block.makeCuboidShape(7, 5, 9, 9, 6, 10),
            Block.makeCuboidShape(7, 5, 6, 9, 6, 7),
            Block.makeCuboidShape(6, 5, 7, 10, 6, 9),
            Block.makeCuboidShape(1, 3, 1, 15, 4, 15),
            Block.makeCuboidShape(0, 0, 0, 16, 3, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 4, 6, 4, 5, 10),
            Block.makeCuboidShape(0, 3, 5, 1, 4, 11),
            Block.makeCuboidShape(2, 11, 3, 3, 12, 4),
            Block.makeCuboidShape(1, 5, 7, 4, 6, 9),
            Block.makeCuboidShape(3, 12, 3, 4, 13, 4),
            Block.makeCuboidShape(3, 12, 12, 4, 13, 13),
            Block.makeCuboidShape(12, 12, 12, 13, 13, 13),
            Block.makeCuboidShape(12, 12, 3, 13, 13, 4),
            Block.makeCuboidShape(13, 10, 2, 14, 11, 3),
            Block.makeCuboidShape(2, 10, 2, 3, 11, 3),
            Block.makeCuboidShape(2, 10, 13, 3, 11, 14),
            Block.makeCuboidShape(13, 10, 13, 14, 11, 14),
            Block.makeCuboidShape(12, 11, 13, 13, 12, 14),
            Block.makeCuboidShape(13, 11, 12, 14, 12, 13),
            Block.makeCuboidShape(13, 11, 3, 14, 12, 4),
            Block.makeCuboidShape(12, 11, 2, 13, 12, 3),
            Block.makeCuboidShape(3, 11, 2, 4, 12, 3),
            Block.makeCuboidShape(2, 11, 12, 3, 12, 13),
            Block.makeCuboidShape(3, 11, 13, 4, 12, 14),
            Block.makeCuboidShape(7, 6, 7, 9, 10, 9),
            Block.makeCuboidShape(3, 10, 2, 5, 11, 3),
            Block.makeCuboidShape(11, 10, 2, 13, 11, 3),
            Block.makeCuboidShape(11, 10, 13, 13, 11, 14),
            Block.makeCuboidShape(3, 10, 13, 5, 11, 14),
            Block.makeCuboidShape(2, 10, 3, 3, 11, 5),
            Block.makeCuboidShape(13, 10, 3, 14, 11, 5),
            Block.makeCuboidShape(13, 10, 11, 14, 11, 13),
            Block.makeCuboidShape(2, 10, 11, 3, 11, 13),
            Block.makeCuboidShape(7, 4, 11, 9, 6, 12),
            Block.makeCuboidShape(7, 4, 4, 9, 6, 5),
            Block.makeCuboidShape(11, 4, 7, 12, 6, 9),
            Block.makeCuboidShape(4, 4, 7, 5, 6, 9),
            Block.makeCuboidShape(10, 9, 2, 13, 10, 3),
            Block.makeCuboidShape(3, 9, 2, 6, 10, 3),
            Block.makeCuboidShape(3, 9, 13, 6, 10, 14),
            Block.makeCuboidShape(10, 9, 13, 13, 10, 14),
            Block.makeCuboidShape(13, 9, 10, 14, 10, 13),
            Block.makeCuboidShape(13, 9, 3, 14, 10, 6),
            Block.makeCuboidShape(2, 9, 3, 3, 10, 6),
            Block.makeCuboidShape(2, 9, 10, 3, 10, 13),
            Block.makeCuboidShape(12, 8, 11, 13, 9, 12),
            Block.makeCuboidShape(12, 8, 4, 13, 9, 5),
            Block.makeCuboidShape(3, 8, 4, 4, 9, 5),
            Block.makeCuboidShape(3, 8, 11, 4, 9, 12),
            Block.makeCuboidShape(3, 8, 12, 5, 9, 13),
            Block.makeCuboidShape(11, 8, 12, 13, 9, 13),
            Block.makeCuboidShape(11, 8, 3, 13, 9, 4),
            Block.makeCuboidShape(3, 8, 3, 5, 9, 4),
            Block.makeCuboidShape(2, 8, 5, 3, 9, 11),
            Block.makeCuboidShape(13, 8, 5, 14, 9, 11),
            Block.makeCuboidShape(5, 8, 2, 11, 9, 3),
            Block.makeCuboidShape(5, 8, 13, 11, 9, 14),
            Block.makeCuboidShape(4, 7, 4, 5, 8, 5),
            Block.makeCuboidShape(11, 7, 4, 12, 8, 5),
            Block.makeCuboidShape(11, 7, 11, 12, 8, 12),
            Block.makeCuboidShape(4, 7, 11, 5, 8, 12),
            Block.makeCuboidShape(11, 7, 9, 13, 8, 11),
            Block.makeCuboidShape(12, 7, 7, 13, 8, 9),
            Block.makeCuboidShape(11, 7, 5, 13, 8, 7),
            Block.makeCuboidShape(9, 7, 3, 11, 8, 5),
            Block.makeCuboidShape(7, 7, 3, 9, 8, 4),
            Block.makeCuboidShape(5, 7, 3, 7, 8, 5),
            Block.makeCuboidShape(3, 7, 5, 5, 8, 7),
            Block.makeCuboidShape(3, 7, 7, 4, 8, 9),
            Block.makeCuboidShape(3, 7, 9, 5, 8, 11),
            Block.makeCuboidShape(5, 7, 11, 7, 8, 13),
            Block.makeCuboidShape(9, 7, 11, 11, 8, 13),
            Block.makeCuboidShape(7, 7, 12, 9, 8, 13),
            Block.makeCuboidShape(7, 6, 4, 9, 7, 6),
            Block.makeCuboidShape(10, 6, 7, 12, 7, 9),
            Block.makeCuboidShape(7, 6, 10, 9, 7, 12),
            Block.makeCuboidShape(4, 6, 7, 6, 7, 9),
            Block.makeCuboidShape(9, 6, 5, 11, 7, 7),
            Block.makeCuboidShape(9, 6, 9, 11, 7, 11),
            Block.makeCuboidShape(5, 6, 5, 7, 7, 7),
            Block.makeCuboidShape(5, 6, 9, 7, 7, 11),
            Block.makeCuboidShape(9, 5, 7, 10, 6, 9),
            Block.makeCuboidShape(6, 5, 7, 7, 6, 9),
            Block.makeCuboidShape(7, 5, 6, 9, 6, 10),
            Block.makeCuboidShape(1, 3, 1, 15, 4, 15),
            Block.makeCuboidShape(0, 0, 0, 16, 3, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(6, 4, 12, 10, 5, 16),
            Block.makeCuboidShape(5, 3, 15, 11, 4, 16),
            Block.makeCuboidShape(3, 11, 13, 4, 12, 14),
            Block.makeCuboidShape(7, 5, 12, 9, 6, 15),
            Block.makeCuboidShape(3, 12, 12, 4, 13, 13),
            Block.makeCuboidShape(12, 12, 12, 13, 13, 13),
            Block.makeCuboidShape(12, 12, 3, 13, 13, 4),
            Block.makeCuboidShape(3, 12, 3, 4, 13, 4),
            Block.makeCuboidShape(2, 10, 2, 3, 11, 3),
            Block.makeCuboidShape(2, 10, 13, 3, 11, 14),
            Block.makeCuboidShape(13, 10, 13, 14, 11, 14),
            Block.makeCuboidShape(13, 10, 2, 14, 11, 3),
            Block.makeCuboidShape(13, 11, 3, 14, 12, 4),
            Block.makeCuboidShape(12, 11, 2, 13, 12, 3),
            Block.makeCuboidShape(3, 11, 2, 4, 12, 3),
            Block.makeCuboidShape(2, 11, 3, 3, 12, 4),
            Block.makeCuboidShape(2, 11, 12, 3, 12, 13),
            Block.makeCuboidShape(12, 11, 13, 13, 12, 14),
            Block.makeCuboidShape(13, 11, 12, 14, 12, 13),
            Block.makeCuboidShape(7, 6, 7, 9, 10, 9),
            Block.makeCuboidShape(2, 10, 11, 3, 11, 13),
            Block.makeCuboidShape(2, 10, 3, 3, 11, 5),
            Block.makeCuboidShape(13, 10, 3, 14, 11, 5),
            Block.makeCuboidShape(13, 10, 11, 14, 11, 13),
            Block.makeCuboidShape(3, 10, 13, 5, 11, 14),
            Block.makeCuboidShape(3, 10, 2, 5, 11, 3),
            Block.makeCuboidShape(11, 10, 2, 13, 11, 3),
            Block.makeCuboidShape(11, 10, 13, 13, 11, 14),
            Block.makeCuboidShape(11, 4, 7, 12, 6, 9),
            Block.makeCuboidShape(4, 4, 7, 5, 6, 9),
            Block.makeCuboidShape(7, 4, 4, 9, 6, 5),
            Block.makeCuboidShape(7, 4, 11, 9, 6, 12),
            Block.makeCuboidShape(2, 9, 3, 3, 10, 6),
            Block.makeCuboidShape(2, 9, 10, 3, 10, 13),
            Block.makeCuboidShape(13, 9, 10, 14, 10, 13),
            Block.makeCuboidShape(13, 9, 3, 14, 10, 6),
            Block.makeCuboidShape(10, 9, 2, 13, 10, 3),
            Block.makeCuboidShape(3, 9, 2, 6, 10, 3),
            Block.makeCuboidShape(3, 9, 13, 6, 10, 14),
            Block.makeCuboidShape(10, 9, 13, 13, 10, 14),
            Block.makeCuboidShape(11, 8, 3, 12, 9, 4),
            Block.makeCuboidShape(4, 8, 3, 5, 9, 4),
            Block.makeCuboidShape(4, 8, 12, 5, 9, 13),
            Block.makeCuboidShape(11, 8, 12, 12, 9, 13),
            Block.makeCuboidShape(12, 8, 11, 13, 9, 13),
            Block.makeCuboidShape(12, 8, 3, 13, 9, 5),
            Block.makeCuboidShape(3, 8, 3, 4, 9, 5),
            Block.makeCuboidShape(3, 8, 11, 4, 9, 13),
            Block.makeCuboidShape(5, 8, 13, 11, 9, 14),
            Block.makeCuboidShape(5, 8, 2, 11, 9, 3),
            Block.makeCuboidShape(2, 8, 5, 3, 9, 11),
            Block.makeCuboidShape(13, 8, 5, 14, 9, 11),
            Block.makeCuboidShape(4, 7, 11, 5, 8, 12),
            Block.makeCuboidShape(4, 7, 4, 5, 8, 5),
            Block.makeCuboidShape(11, 7, 4, 12, 8, 5),
            Block.makeCuboidShape(11, 7, 11, 12, 8, 12),
            Block.makeCuboidShape(9, 7, 3, 11, 8, 5),
            Block.makeCuboidShape(7, 7, 3, 9, 8, 4),
            Block.makeCuboidShape(5, 7, 3, 7, 8, 5),
            Block.makeCuboidShape(3, 7, 5, 5, 8, 7),
            Block.makeCuboidShape(3, 7, 7, 4, 8, 9),
            Block.makeCuboidShape(3, 7, 9, 5, 8, 11),
            Block.makeCuboidShape(5, 7, 11, 7, 8, 13),
            Block.makeCuboidShape(7, 7, 12, 9, 8, 13),
            Block.makeCuboidShape(9, 7, 11, 11, 8, 13),
            Block.makeCuboidShape(11, 7, 9, 13, 8, 11),
            Block.makeCuboidShape(11, 7, 5, 13, 8, 7),
            Block.makeCuboidShape(12, 7, 7, 13, 8, 9),
            Block.makeCuboidShape(4, 6, 7, 6, 7, 9),
            Block.makeCuboidShape(7, 6, 4, 9, 7, 6),
            Block.makeCuboidShape(10, 6, 7, 12, 7, 9),
            Block.makeCuboidShape(7, 6, 10, 9, 7, 12),
            Block.makeCuboidShape(5, 6, 5, 7, 7, 7),
            Block.makeCuboidShape(9, 6, 5, 11, 7, 7),
            Block.makeCuboidShape(5, 6, 9, 7, 7, 11),
            Block.makeCuboidShape(9, 6, 9, 11, 7, 11),
            Block.makeCuboidShape(7, 5, 6, 9, 6, 7),
            Block.makeCuboidShape(7, 5, 9, 9, 6, 10),
            Block.makeCuboidShape(6, 5, 7, 10, 6, 9),
            Block.makeCuboidShape(1, 3, 1, 15, 4, 15),
            Block.makeCuboidShape(0, 0, 0, 16, 3, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(12, 4, 6, 16, 5, 10),
            Block.makeCuboidShape(15, 3, 5, 16, 4, 11),
            Block.makeCuboidShape(13, 11, 12, 14, 12, 13),
            Block.makeCuboidShape(12, 5, 7, 15, 6, 9),
            Block.makeCuboidShape(12, 12, 12, 13, 13, 13),
            Block.makeCuboidShape(12, 12, 3, 13, 13, 4),
            Block.makeCuboidShape(3, 12, 3, 4, 13, 4),
            Block.makeCuboidShape(3, 12, 12, 4, 13, 13),
            Block.makeCuboidShape(2, 10, 13, 3, 11, 14),
            Block.makeCuboidShape(13, 10, 13, 14, 11, 14),
            Block.makeCuboidShape(13, 10, 2, 14, 11, 3),
            Block.makeCuboidShape(2, 10, 2, 3, 11, 3),
            Block.makeCuboidShape(3, 11, 2, 4, 12, 3),
            Block.makeCuboidShape(2, 11, 3, 3, 12, 4),
            Block.makeCuboidShape(2, 11, 12, 3, 12, 13),
            Block.makeCuboidShape(3, 11, 13, 4, 12, 14),
            Block.makeCuboidShape(12, 11, 13, 13, 12, 14),
            Block.makeCuboidShape(13, 11, 3, 14, 12, 4),
            Block.makeCuboidShape(12, 11, 2, 13, 12, 3),
            Block.makeCuboidShape(7, 6, 7, 9, 10, 9),
            Block.makeCuboidShape(11, 10, 13, 13, 11, 14),
            Block.makeCuboidShape(3, 10, 13, 5, 11, 14),
            Block.makeCuboidShape(3, 10, 2, 5, 11, 3),
            Block.makeCuboidShape(11, 10, 2, 13, 11, 3),
            Block.makeCuboidShape(13, 10, 11, 14, 11, 13),
            Block.makeCuboidShape(2, 10, 11, 3, 11, 13),
            Block.makeCuboidShape(2, 10, 3, 3, 11, 5),
            Block.makeCuboidShape(13, 10, 3, 14, 11, 5),
            Block.makeCuboidShape(7, 4, 4, 9, 6, 5),
            Block.makeCuboidShape(7, 4, 11, 9, 6, 12),
            Block.makeCuboidShape(4, 4, 7, 5, 6, 9),
            Block.makeCuboidShape(11, 4, 7, 12, 6, 9),
            Block.makeCuboidShape(3, 9, 13, 6, 10, 14),
            Block.makeCuboidShape(10, 9, 13, 13, 10, 14),
            Block.makeCuboidShape(10, 9, 2, 13, 10, 3),
            Block.makeCuboidShape(3, 9, 2, 6, 10, 3),
            Block.makeCuboidShape(2, 9, 3, 3, 10, 6),
            Block.makeCuboidShape(2, 9, 10, 3, 10, 13),
            Block.makeCuboidShape(13, 9, 10, 14, 10, 13),
            Block.makeCuboidShape(13, 9, 3, 14, 10, 6),
            Block.makeCuboidShape(3, 8, 4, 4, 9, 5),
            Block.makeCuboidShape(3, 8, 11, 4, 9, 12),
            Block.makeCuboidShape(12, 8, 11, 13, 9, 12),
            Block.makeCuboidShape(12, 8, 4, 13, 9, 5),
            Block.makeCuboidShape(11, 8, 3, 13, 9, 4),
            Block.makeCuboidShape(3, 8, 3, 5, 9, 4),
            Block.makeCuboidShape(3, 8, 12, 5, 9, 13),
            Block.makeCuboidShape(11, 8, 12, 13, 9, 13),
            Block.makeCuboidShape(13, 8, 5, 14, 9, 11),
            Block.makeCuboidShape(2, 8, 5, 3, 9, 11),
            Block.makeCuboidShape(5, 8, 13, 11, 9, 14),
            Block.makeCuboidShape(5, 8, 2, 11, 9, 3),
            Block.makeCuboidShape(11, 7, 11, 12, 8, 12),
            Block.makeCuboidShape(4, 7, 11, 5, 8, 12),
            Block.makeCuboidShape(4, 7, 4, 5, 8, 5),
            Block.makeCuboidShape(11, 7, 4, 12, 8, 5),
            Block.makeCuboidShape(3, 7, 5, 5, 8, 7),
            Block.makeCuboidShape(3, 7, 7, 4, 8, 9),
            Block.makeCuboidShape(3, 7, 9, 5, 8, 11),
            Block.makeCuboidShape(5, 7, 11, 7, 8, 13),
            Block.makeCuboidShape(7, 7, 12, 9, 8, 13),
            Block.makeCuboidShape(9, 7, 11, 11, 8, 13),
            Block.makeCuboidShape(11, 7, 9, 13, 8, 11),
            Block.makeCuboidShape(12, 7, 7, 13, 8, 9),
            Block.makeCuboidShape(11, 7, 5, 13, 8, 7),
            Block.makeCuboidShape(9, 7, 3, 11, 8, 5),
            Block.makeCuboidShape(5, 7, 3, 7, 8, 5),
            Block.makeCuboidShape(7, 7, 3, 9, 8, 4),
            Block.makeCuboidShape(7, 6, 10, 9, 7, 12),
            Block.makeCuboidShape(4, 6, 7, 6, 7, 9),
            Block.makeCuboidShape(7, 6, 4, 9, 7, 6),
            Block.makeCuboidShape(10, 6, 7, 12, 7, 9),
            Block.makeCuboidShape(5, 6, 9, 7, 7, 11),
            Block.makeCuboidShape(5, 6, 5, 7, 7, 7),
            Block.makeCuboidShape(9, 6, 9, 11, 7, 11),
            Block.makeCuboidShape(9, 6, 5, 11, 7, 7),
            Block.makeCuboidShape(6, 5, 7, 7, 6, 9),
            Block.makeCuboidShape(9, 5, 7, 10, 6, 9),
            Block.makeCuboidShape(7, 5, 6, 9, 6, 10),
            Block.makeCuboidShape(1, 3, 1, 15, 4, 15),
            Block.makeCuboidShape(0, 0, 0, 16, 3, 16)
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
