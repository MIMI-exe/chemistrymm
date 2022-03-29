package de.darth_griefer_.chemistry.tileentity;

import de.darth_griefer_.chemistry.Chemistry;
import de.darth_griefer_.chemistry.core.init.BlockInit;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Chemistry.MOD_ID);

    public static RegistryObject<TileEntityType<LightningChannelerTile>> LIGHTNING_CHANNELER_TILE =
            TILE_ENTITIES.register("lightning_channeler_tile", () -> TileEntityType.Builder.create(
                    LightningChannelerTile::new, BlockInit.LIGHTNING_CHANNELER.get()).build(null));

    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}
