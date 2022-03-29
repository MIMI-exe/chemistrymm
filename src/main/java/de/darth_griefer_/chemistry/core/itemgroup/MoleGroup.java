package de.darth_griefer_.chemistry.core.itemgroup;

import de.darth_griefer_.chemistry.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MoleGroup extends ItemGroup {

    public static final MoleGroup MOLEKUEHLE = new MoleGroup(ItemGroup.GROUPS.length,"molekuehle");

    public MoleGroup(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.HYDROXIDION.get());

    }
}
