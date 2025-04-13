package hy.forge.generic_ae.datagen;

import hy.forge.generic_ae.GAERegistries;
import hy.forge.generic_ae.GenericAe;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GAEBlockStateProvider extends BlockStateProvider {
    public GAEBlockStateProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, GenericAe.MOD_ID, fileHelper);
    }
    
    @Override
    protected void registerStatesAndModels() {
        simpleBlock(GAERegistries.BLOCK_FE_PORT.get());
    }
}
