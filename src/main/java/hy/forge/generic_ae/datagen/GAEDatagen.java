package hy.forge.generic_ae.datagen;

import hy.forge.generic_ae.GenericAe;
import net.minecraft.WorldVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = GenericAe.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GAEDatagen extends DataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        generator.addProvider(event.includeClient(), new GAELanguageProvider(output));
//        generator.addProvider(event.includeClient(), new GAEBlockStateProvider(output, fileHelper));
        generator.addProvider(event.includeServer(), new GAERecipeProvider(output));
        generator.addProvider(event.includeServer(),
                new GAETagProviders.Block(output, lookupProvider, GenericAe.MOD_ID, fileHelper));
//        generator.addProvider(event.includeServer(), new GAELootTableProvider(output, Collections.emptySet(), List.of(
//                GAELootTableProvider.ImaginaryMatter.getSubProvider()
//        )));
    }
    
    public GAEDatagen(Path pRootOutputFolder, WorldVersion pVersion, boolean pAlwaysGenerate) {
        super(pRootOutputFolder, pVersion, pAlwaysGenerate);
    }
}
