package org.mtrus;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.Item;
import org.mtr.mapping.holder.ItemSettings;
import org.mtr.mapping.registry.ItemRegistryObject;
import org.mtr.mapping.registry.Registry;

import org.mtrus.item.ItemDCMetroPSD;
import org.mtrus.item.ItemDCMetroPSD2;

public class ModItems {

    public static final Item MTRUS_ICON = new Item(new ItemSettings().maxCount(1));
    public static ItemRegistryObject DC_METRO_PSD_DOOR;
    public static ItemRegistryObject DC_METRO_PSD_GLASS;
    public static ItemRegistryObject DC_METRO_PSD_2_DOOR;
    public static ItemRegistryObject DC_METRO_PSD_2_GLASS;

    public static void registerModItems(Registry registry) {
        registry.registerItem(new Identifier(MTRUSAddon.MOD_ID, "mtrus_icon"), settings -> MTRUS_ICON);

        DC_METRO_PSD_DOOR = registry.registerItem(
            new Identifier(MTRUSAddon.MOD_ID, "dc_metro_psd_door"),
            itemSettings -> new Item(
                new ItemDCMetroPSD(ItemDCMetroPSD.EnumPSDAPGItem.DOOR,
                    ItemDCMetroPSD.EnumPSDAPGType.APG,
                    itemSettings
                )
            ),
            ModCreativeModeTabs.MAIN
        );
        
        DC_METRO_PSD_GLASS = registry.registerItem(
            new Identifier(MTRUSAddon.MOD_ID, "dc_metro_psd_glass"),
            itemSettings -> new Item(
                new ItemDCMetroPSD(ItemDCMetroPSD.EnumPSDAPGItem.GLASS,
                    ItemDCMetroPSD.EnumPSDAPGType.APG,
                    itemSettings
                )
            ),
            ModCreativeModeTabs.MAIN
        );

        DC_METRO_PSD_2_DOOR = registry.registerItem(
            new Identifier(MTRUSAddon.MOD_ID, "dc_metro_psd_2_door"),
            itemSettings -> new Item(
                new ItemDCMetroPSD2(ItemDCMetroPSD2.EnumPSDAPGItem.DOOR,
                    ItemDCMetroPSD2.EnumPSDAPGType.APG,
                    itemSettings
                )
            ),
            ModCreativeModeTabs.MAIN
        );
        
        DC_METRO_PSD_2_GLASS = registry.registerItem(
            new Identifier(MTRUSAddon.MOD_ID, "dc_metro_psd_2_glass"),
            itemSettings -> new Item(
                new ItemDCMetroPSD2(ItemDCMetroPSD2.EnumPSDAPGItem.GLASS,
                    ItemDCMetroPSD2.EnumPSDAPGType.APG,
                    itemSettings
                )
            ),
            ModCreativeModeTabs.MAIN
        );
    }
}