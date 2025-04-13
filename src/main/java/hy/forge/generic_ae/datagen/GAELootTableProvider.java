package hy.forge.generic_ae.datagen;

import hy.forge.generic_ae.GAERegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class GAELootTableProvider extends LootTableProvider {
    public GAELootTableProvider(PackOutput pOutput, Set<ResourceLocation> pRequiredTables, List<SubProviderEntry> pSubProviders) {
        super(pOutput, pRequiredTables, pSubProviders);
    }
    
    static class ImaginaryMatter extends BlockLootSubProvider {
        public ImaginaryMatter() {
            super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
        }
        
        @Override
        protected void generate() {
            dropSelf(GAERegistries.BLOCK_BLOCK_OF_IMAGINARY_MATTERS.get());
        }
        
        public static SubProviderEntry getSubProvider() {
            return new LootTableProvider.SubProviderEntry(
                    ImaginaryMatter::new,
                    LootContextParamSets.EMPTY
            );
        }
    }
}
