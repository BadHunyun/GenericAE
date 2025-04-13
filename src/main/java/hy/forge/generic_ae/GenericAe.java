package hy.forge.generic_ae;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GenericAe.MOD_ID)
public class GenericAe {
    public static final String MOD_ID = "generic_ae";
    
    public GenericAe() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        GAERegistries.register(bus);
        bus.addListener(GenericAe::commonInitializing);
        bus.addListener(GenericAe::clientInitializing);
    }
    
    private static void commonInitializing(FMLCommonSetupEvent event) {
    }
    
    private static void clientInitializing(FMLClientSetupEvent event) {
    }
}
