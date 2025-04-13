package hy.forge.generic_ae.datagen;

import hy.forge.generic_ae.GAERegistries;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GAETagProviders {
    static class Block extends BlockTagsProvider {
        public Block(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, modId, existingFileHelper);
        }
        
        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            this.tag(BlockTags.NEEDS_IRON_TOOL)
                    .add(GAERegistries.BLOCK_FE_PORT.get());
            this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(GAERegistries.BLOCK_FE_PORT.get())
                    .add(GAERegistries.BLOCK_BLOCK_OF_IMAGINARY_MATTERS.get());
        }
    }
}
