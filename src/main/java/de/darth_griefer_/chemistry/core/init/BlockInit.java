package de.darth_griefer_.chemistry.core.init;

import de.darth_griefer_.chemistry.Chemistry;
import de.darth_griefer_.chemistry.core.init.custom.LightningChannelerBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Chemistry.MOD_ID);

    public static final RegistryObject<Block> CARBON_BLOCK = BLOCKS.register("carbon_block",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.GRAY).hardnessAndResistance(3.5f,10).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LITHIUM_BLOCK = BLOCKS.register("lithium_block",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.GOLD).hardnessAndResistance(4.5f,15).harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.NETHER_GOLD)));

    public static final RegistryObject<Block> WASSERSTOFF_BLOCK = BLOCKS.register("wasserstoff_block",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.DIAMOND).hardnessAndResistance(5.5f,15).harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.GLASS)));

   public static final RegistryObject<Block> LITHIUM_ORE = BLOCKS.register("lithium_ore",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.STONE).hardnessAndResistance(2.5f,5).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BORON_BLOCK = BLOCKS.register("boron_block",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.STONE).hardnessAndResistance(4.5f,6).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));

    public static final RegistryObject<Block> NEON_BLOCK = BLOCKS.register("neon_block",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.PURPLE).hardnessAndResistance(3.5f,10).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CARBON_ORE = BLOCKS.register("carbon_ore",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.STONE).hardnessAndResistance(2.5f,5).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BERYLLIUM_BLOCK = BLOCKS.register("beryllium_block",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.STONE).hardnessAndResistance(2.5f,5).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BORON_ORE = BLOCKS.register("boron_ore",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.STONE).hardnessAndResistance(2.5f,5).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));

    public static final RegistryObject<Block> BERYLLIUM_ORE = BLOCKS.register("beryllium_ore",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.STONE).hardnessAndResistance(2.5f,5).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));

    public static final RegistryObject<Block> STICKSTOFF_BLOCK = BLOCKS.register("stickstoff_block",
            ()->new Block(AbstractBlock.Properties.create((Material.IRON), MaterialColor.STONE).hardnessAndResistance(2.5f,5).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SIEDELION = BLOCKS.register("siedelion",
            ()->new FlowerBlock(Effects.HUNGER,2,AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> LIGHTNING_CHANNELER = BLOCKS.register("lightning_channeler",
            ()->new LightningChannelerBlock(AbstractBlock.Properties.create(Material.IRON)));


}
