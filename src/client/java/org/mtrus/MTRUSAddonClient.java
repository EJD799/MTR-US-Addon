package org.mtrus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.io.Reader;

import org.mtr.mapping.holder.MinecraftClient;
import org.mtr.mapping.registry.RegistryClient;
import org.mtr.mod.InitClient;
import org.mtrus.block.BlockDCMetroPSDDoorEntity;
import org.mtrus.block.BlockDCMetroPSD2DoorEntity;
import org.mtrus.render.RenderPlatformLight;
import org.mtrus.render.RenderSeatEntity;
import org.mtrus.render.RenderOBJBlock;
import org.mtrus.render.RenderOBJDoubleVerticalBlock;
import org.mtrus.render.RenderOBJTripleVerticalBlock;
import org.mtrus.render.RenderOBJFareGate;
import org.mtrus.render.RenderOBJTicketMachine;
import org.mtrus.render.RenderOBJBench;
import org.mtrus.render.RenderOBJSignalLight;
import org.mtrus.render.RenderDCMetroStationNameWall;
import org.mtrus.render.RenderDCMetroStationNamePole;
import org.mtrus.render.RenderDCMetroStationPole;
import org.mtrus.render.RenderDCMetroPlatformPole;
import org.mtrus.render.RenderDCMetroLEDPIDS;
import org.mtrus.render.RenderDCMetroNewLEDPIDS;
import org.mtrus.render.RenderDCMetroLCDPIDS;
import org.mtrus.render.RenderDCMetroPSDDoor;
import org.mtrus.render.RenderDCMetroPSD2Door;
import org.mtrus.render.RenderDCMetrobusSign;
import org.mtrus.render.RenderDCMetrobusStationName;
import org.mtrus.render.RenderDCMetrobusPIDS;
import org.mtrus.render.RenderNYCSubwayStationNamePillar;
import org.mtrus.render.RenderNYCSubwayStationNameWall;
import org.mtrus.render.RenderNYCSubwayStationNameTile1;
import org.mtrus.render.RenderNYCSubwayStationNameTile2;
import org.mtrus.render.RenderNYCSubwayEntrance1Sign;
import org.mtrus.render.RenderNYCSubwayEntrance2Sign;
import org.mtrus.screen.ResourcePackWarningScreen;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MTRUSAddonClient implements ClientModInitializer {

    public static final RegistryClient registryClient = new RegistryClient(MTRUSAddon.registry);

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
                ModBlocks.DC_METRO_PSD_2_DOOR.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METRO_PSD_2_GLASS.get().data,
                RenderType.cutout()
        );

        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.DC_METROBUS_SIGN.get().data,
                RenderType.cutout()
        );

        /*
          REGISTER BLOCK ENTITY RENDERERS
        */

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
                ModBlockEntityTypes.OBJ_DOUBLE_VERTICAL_BLOCK,
                argument -> {
                        return new RenderOBJDoubleVerticalBlock(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.OBJ_TRIPLE_VERTICAL_BLOCK,
                argument -> {
                        return new RenderOBJTripleVerticalBlock(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.OBJ_FARE_GATE,
                argument -> {
                        return new RenderOBJFareGate(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.OBJ_TICKET_MACHINE,
                argument -> {
                        return new RenderOBJTicketMachine(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.OBJ_BENCH,
                argument -> {
                        return new RenderOBJBench(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.OBJ_SIGNAL_LIGHT,
                argument -> {
                        return new RenderOBJSignalLight(argument);
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
                ModBlockEntityTypes.DC_METRO_PSD_2_DOOR,
                argument -> {
                        return new RenderDCMetroPSD2Door<BlockDCMetroPSD2DoorEntity>(argument, 2);
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

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.NYC_SUBWAY_STATION_NAME_PILLAR,
                argument -> {
                        return new RenderNYCSubwayStationNamePillar(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.NYC_SUBWAY_STATION_NAME_WALL,
                argument -> {
                        return new RenderNYCSubwayStationNameWall(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.NYC_SUBWAY_STATION_NAME_TILE_1,
                argument -> {
                        return new RenderNYCSubwayStationNameTile1(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.NYC_SUBWAY_STATION_NAME_TILE_2,
                argument -> {
                        return new RenderNYCSubwayStationNameTile2(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.NYC_SUBWAY_ENTRANCE_1_SIGN,
                argument -> {
                        return new RenderNYCSubwayEntrance1Sign(argument);
                }
        );

        registryClient.registerBlockEntityRenderer(
                ModBlockEntityTypes.NYC_SUBWAY_ENTRANCE_2_SIGN,
                argument -> {
                        return new RenderNYCSubwayEntrance2Sign(argument);
                }
        );

        /*
          REGISTER ENTITY RENDERERS
        */

        registryClient.registerEntityRenderer(
                ModEntityTypes.SEAT,
                argument -> {
                        return new RenderSeatEntity(argument);
                }
        );

        /*
          REGISTER STATION COLORED BLOCKS
        */

        registryClient.registerBlockColors((blockState, blockRenderView, blockPos, tintIndex) -> InitClient.getStationColor(blockPos),
		ModBlocks.NYC_SUBWAY_PILLAR_6,
                ModBlocks.NYC_SUBWAY_WALL_TILE_3,
                ModBlocks.NYC_SUBWAY_WALL_TILE_4,
                ModBlocks.NYC_SUBWAY_WALL_TILE_7,
                ModBlocks.NYC_SUBWAY_STATION_NAME_TILE_1
        );

        /*
          REGISTER RESOURCE PACK WARNING SCREEN
        */

        registryClient.eventRegistryClient.registerStartClientTick(() -> {
            if (!resourcePackChecked) {
                checkResourcePackVersion();
            }

            ResourcePackWarningScreen.handle();
        });

	    registryClient.init();
    }

    public static final int REQUIRED_PACK_VERSION = 1;
    public static final String REQUIRED_PACK_VERSION_STRING = "v4.3";
    public static final String REQUIRED_PACK_LINK = "https://modrinth.com/resourcepack/us-pids-pack/version/4.3";
    public static boolean resourcePackChecked = false;
    public static boolean resourcePackValid = false;
    public static int detectedVersion = -1;

    private static void checkResourcePackVersion() {
        resourcePackChecked = true;

        try {
            net.minecraft.server.packs.resources.ResourceManager resourceManager =
                MinecraftClient.getInstance().getResourceManager().data;

            Optional<net.minecraft.server.packs.resources.Resource> resource =
                resourceManager.getResource(new net.minecraft.resources.ResourceLocation(
                    "uspidspack",
                    "version.json"
                ));

            if (resource.isEmpty()) {
                resourcePackValid = false;
                detectedVersion = -1;
                return;
            }

            try (Reader reader = new InputStreamReader(resource.get().open(), StandardCharsets.UTF_8)) {
                JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();

                detectedVersion = json.get("version").getAsInt();
                resourcePackValid = detectedVersion == REQUIRED_PACK_VERSION;
            }
        } catch (Exception e) {
            resourcePackValid = false;
            detectedVersion = -1;
            e.printStackTrace();
        }
    }
}