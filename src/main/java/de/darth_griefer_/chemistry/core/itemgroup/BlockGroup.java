package de.darth_griefer_.chemistry.core.itemgroup;

import de.darth_griefer_.chemistry.core.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BlockGroup extends ItemGroup {

    public static final BlockGroup BLOECKE = new BlockGroup(ItemGroup.GROUPS.length,"bloecke");

    public BlockGroup(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(BlockInit.CARBON_BLOCK.get());

    }
}
