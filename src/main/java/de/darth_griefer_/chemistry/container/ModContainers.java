package de.darth_griefer_.chemistry.container;

import de.darth_griefer_.chemistry.Chemistry;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class  ModContainers {

    public static DeferredRegister<ContainerType<?>> CONTAINERS
            = DeferredRegister.create(ForgeRegistries.CONTAINERS, Chemistry.MOD_ID);

    public static final RegistryObject<ContainerType<LightningChannelerContainer>> LIGHTNING_CHANNELER_CONTAINER
            = CONTAINERS.register("lightning_channeler_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new LightningChannelerContainer(windowId, world, pos, inv, inv.player );
            })));

    public static final RegistryObject<ContainerType<MicroscopeContainer>> MICROSCOPE_CONTAINER
            = CONTAINERS.register("microscope_container",
            () -> IForgeContainerType.create(((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                World world = inv.player.getEntityWorld();
                return new MicroscopeContainer(windowId, world, pos, inv, inv.player );
            })));


    public static void register(IEventBus eventBus){
        CONTAINERS.register(eventBus);

    }

}
