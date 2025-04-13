package hy.forge.generic_ae.tile;

import hy.forge.generic_ae.GAERegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.energy.EnergyStorage;
import org.jetbrains.annotations.NotNull;

public class TileFEPort extends BlockEntity {
    public static final String ENERGY_TAG = "Energy";
    
    public static final int CAPACITY = 100000;
    
    private final EnergyStorage energyStorage = new EnergyStorage(CAPACITY);
    
    public TileFEPort(BlockPos pPos, BlockState pBlockState) {
        super(GAERegistries.TILE_FE_PORT.get(), pPos, pBlockState);
    }
    
    public int getEnergyStored() {
        return energyStorage.getEnergyStored();
    }
    
    @Override
    protected void saveAdditional(@NotNull CompoundTag tag) {
        super.saveAdditional(tag);
        tag.put(ENERGY_TAG, energyStorage.serializeNBT());
    }
    
    @Override
    public void load(@NotNull CompoundTag tag) {
        super.load(tag);
        if (tag.contains(ENERGY_TAG)) {
            energyStorage.deserializeNBT(tag.get(ENERGY_TAG));
        }
    }
}
