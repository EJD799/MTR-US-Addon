package org.mtrus;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.CreativeModeTabHolder;
import org.mtr.mapping.registry.Registry;

public final class ModCreativeModeTabs {

    public static CreativeModeTabHolder MAIN;

    public static void registerModCreativeModeTabs(Registry registry) {
        MAIN = registry.createCreativeModeTabHolder(
                new Identifier(MTRUSAddon.MOD_ID, "main"),
                () -> ModItems.MTRUS_ICON.getDefaultStack()
        );
    }

    public static void fillTabs() {
        // Items are added automatically through registerBlockWithBlockItem
    }

    private ModCreativeModeTabs() {
    }
}