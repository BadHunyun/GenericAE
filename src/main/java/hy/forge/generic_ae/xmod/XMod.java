package hy.forge.generic_ae.xmod;

import net.minecraftforge.fml.ModList;

public class XMod {
    public boolean IS_EXTENDED_AE_LOADED = ModList.get().isLoaded("expatternproviders");
    public boolean IS_MEGA_CELLS_LOADED = ModList.get().isLoaded("megacells");
    
    public XMod() {
        String[] mods = {
                "expatternproviders",
                "megacells"
        };
        for (var mod: mods) {
            if (!ModList.get().isLoaded(mod))
                continue;
            switch (mod) {
                case "expatternproviders":
                case "megacells":
            }
        }
    }
}
