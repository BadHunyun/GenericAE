package hy.forge.generic_ae.datagen;

import hy.forge.generic_ae.GAERegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class GAERecipeProvider extends RecipeProvider {
    public GAERecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }
    
    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        RecipeProvider.nineBlockStorageRecipes(consumer,
                RecipeCategory.MISC, GAERegistries.ITEM_IMAGINARY_MATTERS.get(),
                RecipeCategory.MISC, GAERegistries.ITEM_BLOCK_OF_IMAGINARY_MATTERS.get());
    }
}
