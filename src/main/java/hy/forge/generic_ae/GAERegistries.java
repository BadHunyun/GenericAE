package hy.forge.generic_ae;

import hy.forge.generic_ae.blocks.Block$BlockOfImaginaryMatters;
import hy.forge.generic_ae.blocks.BlockFEPort;
import hy.forge.generic_ae.items.BlockItemFEPort;
import hy.forge.generic_ae.items.BlockItem$BlockOfImaginaryMatters;
import hy.forge.generic_ae.items.ItemGenericProcessor;
import hy.forge.generic_ae.items.ItemImaginaryMatters;
import hy.forge.generic_ae.items.ItemPrintedGenericProcessor;
import hy.forge.generic_ae.tile.TileFEPort;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GAERegistries {
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GenericAe.MOD_ID);
    private static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GenericAe.MOD_ID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, GenericAe.MOD_ID);
    private static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GenericAe.MOD_ID);
    
    public static final RegistryObject<Item> ITEM_GENERIC_PROCESSOR =
            ITEMS.register("generic_processor", ItemGenericProcessor::new);
    public static final RegistryObject<Item> ITEM_PRINTED_GENERIC_PROCESSOR =
            ITEMS.register("printed_generic_processor", ItemPrintedGenericProcessor::new);
    public static final RegistryObject<Item> ITEM_BLOCK_OF_IMAGINARY_MATTERS =
            ITEMS.register("block_of_imaginary_matters", BlockItem$BlockOfImaginaryMatters::new);
    public static final RegistryObject<Item> ITEM_IMAGINARY_MATTERS =
            ITEMS.register("imaginary_matters", ItemImaginaryMatters::new);
    public static final RegistryObject<Item> ITEM_FE_PORT =
            ITEMS.register("fe_port", BlockItemFEPort::new);
    
    public static final RegistryObject<Block> BLOCK_BLOCK_OF_IMAGINARY_MATTERS =
            BLOCKS.register("block_of_imaginary_matters", Block$BlockOfImaginaryMatters::new);
    public static final RegistryObject<Block> BLOCK_FE_PORT =
            BLOCKS.register("fe_port", BlockFEPort::new);
    
    public static final RegistryObject<BlockEntityType<TileFEPort>> TILE_FE_PORT =
            BLOCK_ENTITIES.register("fe_port", () ->
                    BlockEntityType.Builder.of(TileFEPort::new, BLOCK_FE_PORT.get()).build(null));
    
    
    
    public static final RegistryObject<CreativeModeTab> GAE_TAB =
            TABS.register("generic_ae", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup." + GenericAe.MOD_ID + ".generic_ae"))
                            .icon(() -> ITEM_GENERIC_PROCESSOR.get().getDefaultInstance())
                            .displayItems((params, output) -> {
                                output.accept(ITEM_GENERIC_PROCESSOR.get());
                                output.accept(ITEM_PRINTED_GENERIC_PROCESSOR.get());
                                output.accept(ITEM_IMAGINARY_MATTERS.get());
                                output.accept(ITEM_BLOCK_OF_IMAGINARY_MATTERS.get());
                                output.accept(ITEM_FE_PORT.get());
                            })
                            .build()
            );
    
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
        BLOCK_ENTITIES.register(bus);
        TABS.register(bus);
    }
}
