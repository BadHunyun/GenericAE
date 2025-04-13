package hy.forge.generic_ae.datagen;

import hy.forge.generic_ae.GAERegistries;
import hy.forge.generic_ae.GenericAe;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class GAELanguageProvider extends LanguageProvider {
    public GAELanguageProvider(PackOutput output) {
        super(output, GenericAe.MOD_ID, "en_us");
    }
    
    @Override
    protected void addTranslations() {
        this.add(GAERegistries.ITEM_GENERIC_PROCESSOR.get(), "Generic Processor");
        this.add(GAERegistries.ITEM_PRINTED_GENERIC_PROCESSOR.get(), "Printed Generic Processor");
        this.add(GAERegistries.ITEM_BLOCK_OF_IMAGINARY_MATTERS.get(), "Block of Imaginary Matters");
        this.add(GAERegistries.ITEM_IMAGINARY_MATTERS.get(), "Imaginary Matters");
        this.add(GAERegistries.ITEM_FE_PORT.get(), "FE Port");
        
        this.add("itemGroup.generic_ae.generic_ae", "Generic AE");
    }
}
