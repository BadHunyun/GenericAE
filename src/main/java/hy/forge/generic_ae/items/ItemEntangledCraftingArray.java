package hy.forge.generic_ae.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class ItemEntangledCraftingArray extends Item {
    public ItemEntangledCraftingArray() {
        super(new Properties().stacksTo(16));
    }
    
    @Override
    public @NotNull Component getDescription() {
        return Component.translatable("item.entangled_crafting_array.tooltip");
    }
}
