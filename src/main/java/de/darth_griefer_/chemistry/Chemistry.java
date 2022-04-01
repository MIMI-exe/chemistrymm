package de.darth_griefer_.chemistry;


import de.darth_griefer_.chemistry.screen.LightningChannelerScreen;
import de.darth_griefer_.chemistry.screen.MicroscopeScreen;
import de.darth_griefer_.chemistry.world.structure.ModStructures;
import de.darth_griefer_.chemistry.container.ModContainers;
import de.darth_griefer_.chemistry.tileentity.ModTileEntities;
import de.darth_griefer_.chemistry.core.init.BlockInit;
import de.darth_griefer_.chemistry.core.init.ItemInit;
import de.darth_griefer_.chemistry.core.itemgroup.BlockGroup;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("chemistry")
@Mod.EventBusSubscriber(modid = Chemistry.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class Chemistry {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID ="chemistry" ;


    public Chemistry() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(eventBus);
        BlockInit.BLOCKS.register(eventBus);
        ModTileEntities.register(eventBus);
        ModContainers.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);

        ModStructures.register(eventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {

            ModStructures.setupStructures();
        };

   @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->
        {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(BlockGroup.BLOECKE))
                    .setRegistryName(block.getRegistryName()));
        });


    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {

            RenderTypeLookup.setRenderLayer(BlockInit.SIEDELION.get(), RenderType.getCutout());

            ScreenManager.registerFactory(ModContainers.LIGHTNING_CHANNELER_CONTAINER.get(),
                    LightningChannelerScreen::new);

            RenderTypeLookup.setRenderLayer(BlockInit.LIGHTNING_CHANNELER.get(), RenderType.getCutout());


            RenderTypeLookup.setRenderLayer(BlockInit.MICROSCOPE.get(), RenderType.getCutout());

            RenderTypeLookup.setRenderLayer(BlockInit.DESTILLATOR.get(), RenderType.getCutout());


        });
   }
}
