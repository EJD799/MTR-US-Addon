package org.mtrus;

import net.fabricmc.api.ModInitializer;
import org.mtr.mapping.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MTRUSAddon implements ModInitializer {

    public static final String MOD_ID = "mtrus";

    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    public static final Registry registry = new Registry();

    @Override
    public void onInitialize() {
        LOGGER.info("Loading MTR US Addon!");

        ModCreativeModeTabs.registerModCreativeModeTabs(registry);
        ModBlocks.registerModBlocks(registry);
        ModItems.registerModItems(registry);
        ModBlockEntityTypes.registerBlockEntityTypes();

        registry.init();
    }
}