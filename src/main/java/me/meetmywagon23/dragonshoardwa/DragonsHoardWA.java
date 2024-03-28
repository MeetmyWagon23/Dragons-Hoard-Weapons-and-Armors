package me.meetmywagon23.dragonshoardwa;

import me.meetmywagon23.dragonshoardwa.registries.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DragonsHoardWA implements ModInitializer {
    public static final String MOD_ID = "dragonshoardwa";
    public static Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        ItemsRegistry.register();
        ItemGroupRegistry.registerItemGroups();
        ToolsRegistry.register();
        ArmorsRegistry.register();
        WeaponsRegistry.register();
    }
}
