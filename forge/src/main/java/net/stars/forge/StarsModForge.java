package net.stars.forge;

import dev.architectury.platform.forge.EventBuses;
import net.stars.StarsMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StarsMod.MOD_ID)
public class StarsModForge {
    public StarsModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(StarsMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        StarsMod.init();
    }
}
