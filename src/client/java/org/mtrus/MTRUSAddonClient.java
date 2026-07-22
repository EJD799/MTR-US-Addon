package org.mtrus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

import org.mtr.mapping.registry.RegistryClient;
import org.mtrus.render.RenderPlatformLight;
import org.mtrus.render.RenderOBJBlock;
import org.mtrus.render.RenderDCMetroStationNameWall;
import org.mtrus.render.RenderDCMetroStationNamePole;
import org.mtrus.render.RenderDCMetroStationPole;
import org.mtrus.render.RenderDCMetroPlatformPole;
import org.mtrus.render.RenderDCMetroLEDPIDS;
import org.mtrus.render.RenderDCMetroNewLEDPIDS;
import org.mtrus.block.BlockDCMetroPSDDoorEntity;
import org.mtrus.render.RenderDCMetroLCDPIDS;
import org.mtrus.render.RenderDCMetroPSDDoor;
import org.mtrus.render.RenderDCMetrobusSign;
import org.mtrus.render.RenderDCMetrobusStationName;
import org.mtrus.render.RenderDCMetrobusPIDS;

public class MTRUSAddonClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.PLATFORM_NA_3.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.PLATFORM_NA_3_INDENTED.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.PLATFORM_NA_3_SLAB.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_PLATFORM_POLE_LIGHT.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_PLATFORM_POLE_LIGHT_D.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_FARE_GATE_1_ENTRANCE.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_FARE_GATE_1_EXIT.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_FARE_GATE_2_ENTRANCE.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_FARE_GATE_2_EXIT.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_PSD_DOOR.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_PSD_GLASS.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METROBUS_SIGN.get().data,
                RenderType.cutout()
        );


        RegistryClient registryClient =
                new RegistryClient(MTRUSAddon.registry);


        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.PLATFORM_LIGHT,
                argument -> {
                        return new RenderPlatformLight(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.OBJ_BLOCK,
                argument -> {
                        return new RenderOBJBlock(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METRO_STATION_NAME_WALL,
                argument -> {
                        return new RenderDCMetroStationNameWall(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METRO_STATION_NAME_POLE,
                argument -> {
                        return new RenderDCMetroStationNamePole(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METRO_STATION_POLE,
                argument -> {
                        return new RenderDCMetroStationPole(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METRO_PLATFORM_POLE,
                argument -> {
                        return new RenderDCMetroPlatformPole(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METRO_LED_PIDS,
                argument -> {
                        return new RenderDCMetroLEDPIDS(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METRO_NEW_LED_PIDS,
                argument -> {
                        return new RenderDCMetroNewLEDPIDS(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METRO_LCD_PIDS,
                argument -> {
                        return new RenderDCMetroLCDPIDS(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METRO_PSD_DOOR,
                argument -> {
                        return new RenderDCMetroPSDDoor<BlockDCMetroPSDDoorEntity>(argument, 2);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METROBUS_SIGN,
                argument -> {
                        return new RenderDCMetrobusSign(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METROBUS_STATION_NAME,
                argument -> {
                        return new RenderDCMetrobusStationName(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.DC_METROBUS_PIDS,
                argument -> {
                        return new RenderDCMetrobusPIDS(argument);
                }
        );

	registryClient.init();
    }
}