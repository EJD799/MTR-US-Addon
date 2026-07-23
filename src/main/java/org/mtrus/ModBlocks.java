package org.mtrus;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockRegistryObject;
import org.mtr.mapping.registry.Registry;
import org.mtr.mod.block.BlockPlatform;
import org.mtr.mod.block.BlockPlatformSlab;
import org.mtr.mod.item.ItemBlockEnchanted;
import org.mtrus.block.BlockPlatformLight;
import org.mtrus.block.BlockPlatformLightSlab;
import org.mtrus.block.BlockDCMetroLEDPIDS;
import org.mtrus.block.BlockDCMetroLEDPIDSPole;
import org.mtrus.block.BlockDCMetroLEDPIDSCrossbar;
import org.mtrus.block.BlockDCMetroNewLEDPIDS;
import org.mtrus.block.BlockDCMetroNewLEDPIDSPole1;
import org.mtrus.block.BlockDCMetroNewLEDPIDSPole2;
import org.mtrus.block.BlockDCMetroNewLEDPIDSPole3;
import org.mtrus.block.BlockDCMetroPSDDoor;
import org.mtrus.block.BlockDCMetroPSDGlass;
import org.mtrus.block.BlockDCMetroLCDPIDS;
import org.mtrus.block.BlockDCMetroLCDPIDSPole1;
import org.mtrus.block.BlockDCMetroLCDPIDSPole2;
import org.mtrus.block.BlockDCMetroLCDPIDSPole3;
import org.mtrus.block.BlockDCMetroFareGate;
import org.mtrus.block.FacingSlabBlock;
import org.mtrus.block.BlockDCMetroStationNameWall;
import org.mtrus.block.BlockDCMetroStationNameWallEnd;
import org.mtrus.block.BlockDCMetroStationPole;
import org.mtrus.block.BlockDCMetroPlatformPole;
import org.mtrus.block.BlockDCMetroRoofEPillar;
import org.mtrus.block.BlockDCMetroRoofEPillar2;
import org.mtrus.block.BlockDCMetroRoofFPillar;
import org.mtrus.block.BlockDCMetroRoofGPillar;
import org.mtrus.block.BlockDCMetroRoofH;
import org.mtrus.block.BlockDCMetroRoofIPillar;
import org.mtrus.block.BlockDCMetroRoofIPillar2;
import org.mtrus.block.BlockDCMetroRoofJBeam;
import org.mtrus.block.BlockDCMetroRoofJBeamPillar;
import org.mtrus.block.BlockDCMetroRoofJ11;
import org.mtrus.block.BlockDCMetroRoofJLightPole;
import org.mtrus.block.BlockDCMetroStationNamePole;
import org.mtrus.block.BlockDCMetroStationNamePoleEnd;
import org.mtrus.block.BlockDCMetroStationNamePolePole;
import org.mtrus.block.BlockDCMetroSystemMap;
import org.mtrus.block.BlockDCMetroSystemMap2;
import org.mtrus.block.BlockDCMetrobusSign;
import org.mtrus.block.BlockDCMetrobusSignPole;
import org.mtrus.block.BlockDCMetrobusStationName;
import org.mtrus.block.BlockDCMetrobusPIDS;
import org.mtrus.block.BlockNYCSubwayPillar;
import org.mtrus.block.BlockNYCSubwayStationNamePillar;
import org.mtrus.block.BlockNYCSubwayStationNameWall;
import org.mtrus.block.BlockNYCSubwayStationNameTile1;
import org.mtrus.block.BlockNYCSubwayStationNameTile2;
import org.mtrus.block.OBJBlock;
import org.mtrus.block.OBJFareGate;

import static org.mtr.mod.Blocks.createDefaultBlockSettings;

public final class ModBlocks {

    public static BlockRegistryObject PLATFORM_NA_3;
    public static BlockRegistryObject PLATFORM_NA_3_INDENTED;
    public static BlockRegistryObject PLATFORM_NA_3_SLAB;
    public static BlockRegistryObject PLATFORM_DC;
    public static BlockRegistryObject PLATFORM_DC_INDENTED;
    public static BlockRegistryObject PLATFORM_DC_SLAB;
    public static BlockRegistryObject PLATFORM_DC_LIGHT1;
    public static BlockRegistryObject PLATFORM_DC_LIGHT1_INDENTED;
    public static BlockRegistryObject PLATFORM_DC_LIGHT1_SLAB;
    public static BlockRegistryObject PLATFORM_DC_LIGHT2;
    public static BlockRegistryObject PLATFORM_DC_LIGHT2_INDENTED;
    public static BlockRegistryObject PLATFORM_DC_LIGHT2_SLAB;
    public static BlockRegistryObject DC_METRO_TILE;
    public static BlockRegistryObject DC_METRO_TILE_SLAB;
    public static BlockRegistryObject DC_METRO_CONCRETE;
    public static BlockRegistryObject DC_METRO_CONCRETE_SLAB;
    public static BlockRegistryObject DC_METRO_TRACK_LIGHT;
    public static BlockRegistryObject DC_METRO_ARCH_A1;
    public static BlockRegistryObject DC_METRO_ARCH_A2;
    public static BlockRegistryObject DC_METRO_ARCH_A3;
    public static BlockRegistryObject DC_METRO_ARCH_A4;
    public static BlockRegistryObject DC_METRO_ARCH_A5;
    public static BlockRegistryObject DC_METRO_ARCH_A6;
    public static BlockRegistryObject DC_METRO_ARCH_A7;
    public static BlockRegistryObject DC_METRO_ARCH_A8;
    public static BlockRegistryObject DC_METRO_ARCH_A9;
    public static BlockRegistryObject DC_METRO_ARCH_A10;
    public static BlockRegistryObject DC_METRO_ARCH_A11;
    public static BlockRegistryObject DC_METRO_ARCH_A12;
    public static BlockRegistryObject DC_METRO_ARCH_A13;
    public static BlockRegistryObject DC_METRO_ARCH_B1;
    public static BlockRegistryObject DC_METRO_ARCH_B2;
    public static BlockRegistryObject DC_METRO_ARCH_B3;
    public static BlockRegistryObject DC_METRO_ARCH_B4;
    public static BlockRegistryObject DC_METRO_ARCH_B5;
    public static BlockRegistryObject DC_METRO_ARCH_B6;
    public static BlockRegistryObject DC_METRO_ARCH_B7;
    public static BlockRegistryObject DC_METRO_ARCH_B8;
    public static BlockRegistryObject DC_METRO_ARCH_B9;
    public static BlockRegistryObject DC_METRO_ARCH_B10;
    public static BlockRegistryObject DC_METRO_ARCH_B11;
    public static BlockRegistryObject DC_METRO_ARCH_B12;
    public static BlockRegistryObject DC_METRO_ARCH_B13;
    public static BlockRegistryObject DC_METRO_ARCH_B14;
    public static BlockRegistryObject DC_METRO_ARCH_C1;
    public static BlockRegistryObject DC_METRO_ARCH_C2;
    public static BlockRegistryObject DC_METRO_ARCH_C3;
    public static BlockRegistryObject DC_METRO_ARCH_C4;
    public static BlockRegistryObject DC_METRO_ARCH_C5;
    public static BlockRegistryObject DC_METRO_ARCH_C6;
    public static BlockRegistryObject DC_METRO_ARCH_C7;
    public static BlockRegistryObject DC_METRO_ARCH_C8;
    public static BlockRegistryObject DC_METRO_ARCH_C9;
    public static BlockRegistryObject DC_METRO_ARCH_C10;
    public static BlockRegistryObject DC_METRO_ARCH_C11;
    public static BlockRegistryObject DC_METRO_ARCH_C12;
    public static BlockRegistryObject DC_METRO_ARCH_C13;
    public static BlockRegistryObject DC_METRO_ARCH_C14;
    public static BlockRegistryObject DC_METRO_ROOF_D1;
    public static BlockRegistryObject DC_METRO_ROOF_D1P;
    public static BlockRegistryObject DC_METRO_ROOF_D1S;
    public static BlockRegistryObject DC_METRO_ROOF_D1L;
    public static BlockRegistryObject DC_METRO_ROOF_D_PILLAR;
    public static BlockRegistryObject DC_METRO_ROOF_D2;
    public static BlockRegistryObject DC_METRO_ROOF_D2L;
    public static BlockRegistryObject DC_METRO_ROOF_D3;
    public static BlockRegistryObject DC_METRO_ROOF_D4;
    public static BlockRegistryObject DC_METRO_ROOF_D5;
    public static BlockRegistryObject DC_METRO_ROOF_D6;
    public static BlockRegistryObject DC_METRO_ROOF_D7;
    public static BlockRegistryObject DC_METRO_ROOF_E1;
    public static BlockRegistryObject DC_METRO_ROOF_E2;
    public static BlockRegistryObject DC_METRO_ROOF_E3;
    public static BlockRegistryObject DC_METRO_ROOF_E4;
    public static BlockRegistryObject DC_METRO_ROOF_E5;
    public static BlockRegistryObject DC_METRO_ROOF_E6;
    public static BlockRegistryObject DC_METRO_ROOF_E7;
    public static BlockRegistryObject DC_METRO_ROOF_E1B;
    public static BlockRegistryObject DC_METRO_ROOF_E2B;
    public static BlockRegistryObject DC_METRO_ROOF_E3B;
    public static BlockRegistryObject DC_METRO_ROOF_E4B;
    public static BlockRegistryObject DC_METRO_ROOF_E5B;
    public static BlockRegistryObject DC_METRO_ROOF_E6B;
    public static BlockRegistryObject DC_METRO_ROOF_E7B;
    public static BlockRegistryObject DC_METRO_ROOF_E_PILLAR;
    public static BlockRegistryObject DC_METRO_ROOF_E_PILLAR_2;
    public static BlockRegistryObject DC_METRO_ROOF_E_PILLAR_LIGHT;
    public static BlockRegistryObject DC_METRO_ROOF_F1;
    public static BlockRegistryObject DC_METRO_ROOF_F1E;
    public static BlockRegistryObject DC_METRO_ROOF_F2;
    public static BlockRegistryObject DC_METRO_ROOF_F2E;
    public static BlockRegistryObject DC_METRO_ROOF_F3;
    public static BlockRegistryObject DC_METRO_ROOF_F3L;
    public static BlockRegistryObject DC_METRO_ROOF_F4;
    public static BlockRegistryObject DC_METRO_ROOF_F5;
    public static BlockRegistryObject DC_METRO_ROOF_F6;
    public static BlockRegistryObject DC_METRO_ROOF_F7;
    public static BlockRegistryObject DC_METRO_ROOF_F_PILLAR;
    public static BlockRegistryObject DC_METRO_ROOF_G1;
    public static BlockRegistryObject DC_METRO_ROOF_G2;
    public static BlockRegistryObject DC_METRO_ROOF_G3;
    public static BlockRegistryObject DC_METRO_ROOF_G4;
    public static BlockRegistryObject DC_METRO_ROOF_G5;
    public static BlockRegistryObject DC_METRO_ROOF_G6;
    public static BlockRegistryObject DC_METRO_ROOF_G7;
    public static BlockRegistryObject DC_METRO_ROOF_G3L;
    public static BlockRegistryObject DC_METRO_ROOF_G1E;
    public static BlockRegistryObject DC_METRO_ROOF_G2E;
    public static BlockRegistryObject DC_METRO_ROOF_G2F;
    public static BlockRegistryObject DC_METRO_ROOF_G1B;
    public static BlockRegistryObject DC_METRO_ROOF_G2B;
    public static BlockRegistryObject DC_METRO_ROOF_G3B;
    public static BlockRegistryObject DC_METRO_ROOF_G_PILLAR;
    public static BlockRegistryObject DC_METRO_ROOF_H1;
    public static BlockRegistryObject DC_METRO_ROOF_H2;
    public static BlockRegistryObject DC_METRO_ROOF_H3;
    public static BlockRegistryObject DC_METRO_ROOF_H4;
    public static BlockRegistryObject DC_METRO_ROOF_I1;
    public static BlockRegistryObject DC_METRO_ROOF_I2;
    public static BlockRegistryObject DC_METRO_ROOF_I3;
    public static BlockRegistryObject DC_METRO_ROOF_I4;
    public static BlockRegistryObject DC_METRO_ROOF_I5;
    public static BlockRegistryObject DC_METRO_ROOF_I6;
    public static BlockRegistryObject DC_METRO_ROOF_I7;
    public static BlockRegistryObject DC_METRO_ROOF_I1B;
    public static BlockRegistryObject DC_METRO_ROOF_I2B;
    public static BlockRegistryObject DC_METRO_ROOF_I3B;
    public static BlockRegistryObject DC_METRO_ROOF_I4B;
    public static BlockRegistryObject DC_METRO_ROOF_I5B;
    public static BlockRegistryObject DC_METRO_ROOF_I6B;
    public static BlockRegistryObject DC_METRO_ROOF_I7B;
    public static BlockRegistryObject DC_METRO_ROOF_I1S;
    public static BlockRegistryObject DC_METRO_ROOF_I2S;
    public static BlockRegistryObject DC_METRO_ROOF_I3L;
    public static BlockRegistryObject DC_METRO_ROOF_I3E;
    public static BlockRegistryObject DC_METRO_ROOF_I_PILLAR;
    public static BlockRegistryObject DC_METRO_ROOF_I_PILLAR_2;
    public static BlockRegistryObject DC_METRO_ROOF_J_BEAM_PILLAR;
    public static BlockRegistryObject DC_METRO_ROOF_J1;
    public static BlockRegistryObject DC_METRO_ROOF_J2;
    public static BlockRegistryObject DC_METRO_ROOF_J3;
    public static BlockRegistryObject DC_METRO_ROOF_J3L;
    public static BlockRegistryObject DC_METRO_ROOF_J4;
    public static BlockRegistryObject DC_METRO_ROOF_J5;
    public static BlockRegistryObject DC_METRO_ROOF_J6;
    public static BlockRegistryObject DC_METRO_ROOF_J7;
    public static BlockRegistryObject DC_METRO_ROOF_J8;
    public static BlockRegistryObject DC_METRO_ROOF_J9;
    public static BlockRegistryObject DC_METRO_ROOF_J10;
    public static BlockRegistryObject DC_METRO_ROOF_J4B;
    public static BlockRegistryObject DC_METRO_ROOF_J5B;
    public static BlockRegistryObject DC_METRO_ROOF_J6B;
    public static BlockRegistryObject DC_METRO_ROOF_J7B;
    public static BlockRegistryObject DC_METRO_ROOF_J8B;
    public static BlockRegistryObject DC_METRO_ROOF_J9B;
    public static BlockRegistryObject DC_METRO_ROOF_J10B;
    public static BlockRegistryObject DC_METRO_ROOF_J11;
    public static BlockRegistryObject DC_METRO_ROOF_J12;
    public static BlockRegistryObject DC_METRO_ROOF_J13;
    public static BlockRegistryObject DC_METRO_ROOF_J14;
    public static BlockRegistryObject DC_METRO_ROOF_J_LIGHT_POLE;
    public static BlockRegistryObject DC_METRO_ROOF_J_LIGHT_POLE_2;
    public static BlockRegistryObject DC_METRO_ROOF_K1;
    public static BlockRegistryObject DC_METRO_ROOF_K1L;
    public static BlockRegistryObject DC_METRO_ROOF_K2;
    public static BlockRegistryObject DC_METRO_ROOF_K3;
    public static BlockRegistryObject DC_METRO_ROOF_K4;
    public static BlockRegistryObject DC_METRO_ROOF_K5;
    public static BlockRegistryObject DC_METRO_ROOF_L1;
    public static BlockRegistryObject DC_METRO_ROOF_L2;
    public static BlockRegistryObject DC_METRO_ROOF_L3;
    public static BlockRegistryObject DC_METRO_ROOF_L1B;
    public static BlockRegistryObject DC_METRO_ROOF_L2B;
    public static BlockRegistryObject DC_METRO_ROOF_L3B;
    public static BlockRegistryObject DC_METRO_ROOF_L1L;
    public static BlockRegistryObject DC_METRO_ROOF_L_PILLAR;
    public static BlockRegistryObject DC_METRO_ROOF_M1;
    public static BlockRegistryObject DC_METRO_ROOF_M2;
    public static BlockRegistryObject DC_METRO_ROOF_M2L;
    public static BlockRegistryObject DC_METRO_ROOF_N1;
    public static BlockRegistryObject DC_METRO_ROOF_N2;
    public static BlockRegistryObject DC_METRO_ROOF_N3;
    public static BlockRegistryObject DC_METRO_ROOF_N4;
    public static BlockRegistryObject DC_METRO_ROOF_O1;
    public static BlockRegistryObject DC_METRO_ROOF_O2;
    public static BlockRegistryObject DC_METRO_ROOF_O3;
    public static BlockRegistryObject DC_METRO_ROOF_O3L;
    public static BlockRegistryObject DC_METRO_ROOF_O4;
    public static BlockRegistryObject DC_METRO_ROOF_O5;
    public static BlockRegistryObject DC_METRO_ROOF_O6;
    public static BlockRegistryObject DC_METRO_ROOF_O7;
    public static BlockRegistryObject DC_METRO_ROOF_O8;
    public static BlockRegistryObject DC_METRO_ROOF_O9;
    public static BlockRegistryObject DC_METRO_ROOF_O10;
    public static BlockRegistryObject DC_METRO_ROOF_O11;
    public static BlockRegistryObject DC_METRO_ROOF_O12;
    public static BlockRegistryObject DC_METRO_ROOF_O13;
    public static BlockRegistryObject DC_METRO_ROOF_O14;
    public static BlockRegistryObject DC_METRO_ROOF_O15;
    public static BlockRegistryObject DC_METRO_ROOF_O_PILLAR;
    public static BlockRegistryObject DC_METRO_ROOF_O_PILLAR_2;
    public static BlockRegistryObject DC_METRO_STATION_NAME_WALL;
    public static BlockRegistryObject DC_METRO_STATION_NAME_WALL_END;
    public static BlockRegistryObject DC_METRO_STATION_NAME_POLE;
    public static BlockRegistryObject DC_METRO_STATION_NAME_POLE_END;
    public static BlockRegistryObject DC_METRO_STATION_NAME_POLE_POLE;
    public static BlockRegistryObject DC_METRO_STATION_POLE_1;
    public static BlockRegistryObject DC_METRO_STATION_POLE_1_D;
    public static BlockRegistryObject DC_METRO_STATION_POLE_2;
    public static BlockRegistryObject DC_METRO_STATION_POLE_2_D;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_1;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_1_D;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_2;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_2_D;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_3;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_3_D;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_LIGHT;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_LIGHT_D;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_LIGHT_2;
    public static BlockRegistryObject DC_METRO_PLATFORM_POLE_LIGHT_2_D;
    public static BlockRegistryObject DC_METRO_FENCE_000;
    public static BlockRegistryObject DC_METRO_FENCE_001;
    public static BlockRegistryObject DC_METRO_FENCE_002;
    public static BlockRegistryObject DC_METRO_FENCE_003;
    public static BlockRegistryObject DC_METRO_FENCE_010;
    public static BlockRegistryObject DC_METRO_FENCE_011;
    public static BlockRegistryObject DC_METRO_FENCE_012;
    public static BlockRegistryObject DC_METRO_FENCE_013;
    public static BlockRegistryObject DC_METRO_FENCE_100;
    public static BlockRegistryObject DC_METRO_FENCE_110;
    public static BlockRegistryObject DC_METRO_FENCE_200;
    public static BlockRegistryObject DC_METRO_FENCE_210;
    public static BlockRegistryObject DC_METRO_TRASH_CAN;
    public static BlockRegistryObject DC_METRO_BENCH_1;
    public static BlockRegistryObject DC_METRO_BENCH_2;
    public static BlockRegistryObject DC_METRO_LED_PIDS;
    public static BlockRegistryObject DC_METRO_LED_PIDS_POLE;
    public static BlockRegistryObject DC_METRO_LED_PIDS_CROSSBAR;
    public static BlockRegistryObject DC_METRO_NEW_LED_PIDS;
    public static BlockRegistryObject DC_METRO_NEW_LED_PIDS_POLE1;
    public static BlockRegistryObject DC_METRO_NEW_LED_PIDS_POLE2;
    public static BlockRegistryObject DC_METRO_NEW_LED_PIDS_POLE3;
    public static BlockRegistryObject DC_METRO_LCD_PIDS;
    public static BlockRegistryObject DC_METRO_LCD_PIDS_POLE1;
    public static BlockRegistryObject DC_METRO_LCD_PIDS_POLE2;
    public static BlockRegistryObject DC_METRO_LCD_PIDS_POLE3;
    public static BlockRegistryObject DC_METRO_FARE_GATE_1_ENTRANCE;
    public static BlockRegistryObject DC_METRO_FARE_GATE_1_EXIT;
    public static BlockRegistryObject DC_METRO_FARE_GATE_2_ENTRANCE;
    public static BlockRegistryObject DC_METRO_FARE_GATE_2_EXIT;
    public static BlockRegistryObject DC_METRO_SYSTEM_MAP_WALL;
    public static BlockRegistryObject DC_METRO_SYSTEM_MAP_FLOOR;
    public static BlockRegistryObject DC_METRO_SYSTEM_MAP_FLOOR_2;
    public static BlockRegistryObject DC_METRO_PSD_DOOR;
    public static BlockRegistryObject DC_METRO_PSD_GLASS;
    public static BlockRegistryObject DC_METROBUS_SIGN;
    public static BlockRegistryObject DC_METROBUS_SIGN_POLE;
    public static BlockRegistryObject DC_METROBUS_BENCH_1;
    public static BlockRegistryObject DC_METROBUS_BENCH_2;
    public static BlockRegistryObject DC_METROBUS_BENCH_3;
    public static BlockRegistryObject DC_METROBUS_WALL_1;
    public static BlockRegistryObject DC_METROBUS_WALL_2;
    public static BlockRegistryObject DC_METROBUS_WALL_3;
    public static BlockRegistryObject DC_METROBUS_WALL_1B;
    public static BlockRegistryObject DC_METROBUS_WALL_2B;
    public static BlockRegistryObject DC_METROBUS_WALL_3B;
    public static BlockRegistryObject DC_METROBUS_WALL_1M;
    public static BlockRegistryObject DC_METROBUS_ROOF_1;
    public static BlockRegistryObject DC_METROBUS_ROOF_2;
    public static BlockRegistryObject DC_METROBUS_ROOF_3;
    public static BlockRegistryObject DC_METROBUS_ROOF_4;
    public static BlockRegistryObject DC_METROBUS_ROOF_1E;
    public static BlockRegistryObject DC_METROBUS_ROOF_2E;
    public static BlockRegistryObject DC_METROBUS_ROOF_3E;
    public static BlockRegistryObject DC_METROBUS_ROOF_4E;
    public static BlockRegistryObject DC_METROBUS_ROOF_1F;
    public static BlockRegistryObject DC_METROBUS_ROOF_2F;
    public static BlockRegistryObject DC_METROBUS_ROOF_3F;
    public static BlockRegistryObject DC_METROBUS_ROOF_4F;
    public static BlockRegistryObject DC_METROBUS_ROOF_4L;
    public static BlockRegistryObject DC_METROBUS_STATION_NAME;
    public static BlockRegistryObject DC_METROBUS_PIDS;
    public static BlockRegistryObject NYC_SUBWAY_PILLAR_1;
    public static BlockRegistryObject NYC_SUBWAY_PILLAR_2;
    public static BlockRegistryObject NYC_SUBWAY_PILLAR_3;
    public static BlockRegistryObject NYC_SUBWAY_PILLAR_4;
    public static BlockRegistryObject NYC_SUBWAY_PILLAR_5;
    public static BlockRegistryObject NYC_SUBWAY_PILLAR_6;
    public static BlockRegistryObject NYC_SUBWAY_WALL_TILE_1;
    public static BlockRegistryObject NYC_SUBWAY_WALL_TILE_2;
    public static BlockRegistryObject NYC_SUBWAY_WALL_TILE_3;
    public static BlockRegistryObject NYC_SUBWAY_WALL_TILE_4;
    public static BlockRegistryObject NYC_SUBWAY_WALL_TILE_5;
    public static BlockRegistryObject NYC_SUBWAY_WALL_TILE_6;
    public static BlockRegistryObject NYC_SUBWAY_WALL_TILE_7;
    public static BlockRegistryObject NYC_SUBWAY_TRACKBED;
    public static BlockRegistryObject NYC_SUBWAY_FLOOR_TILE;
    public static BlockRegistryObject NYC_SUBWAY_FLOOR_TILE_SLAB;
    public static BlockRegistryObject NYC_SUBWAY_STATION_NAME_PILLAR;
    public static BlockRegistryObject NYC_SUBWAY_STATION_NAME_WALL;
    public static BlockRegistryObject NYC_SUBWAY_STATION_NAME_TILE_1;
    public static BlockRegistryObject NYC_SUBWAY_STATION_NAME_TILE_2;
    public static BlockRegistryObject NYC_SUBWAY_CEILING_SUPPORT;
    public static BlockRegistryObject NYC_SUBWAY_SYSTEM_MAP_WALL;
    public static BlockRegistryObject NYC_SUBWAY_SYSTEM_MAP_FLOOR;
    public static BlockRegistryObject NYC_SUBWAY_SYSTEM_MAP_FLOOR_2;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_1A;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_1B;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_1C;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_2A;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_2B;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_2C;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_3A;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_3B;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_3C;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_4A;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_4B;
    public static BlockRegistryObject NYC_SUBWAY_PLATFORM_BARRIER_4C;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_1A;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_1B;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_1C;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_2A;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_2B;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_2C;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_3A;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_3B;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_3C;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_4A;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_4B;
    public static BlockRegistryObject NYC_SUBWAY_BENCH_4C;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_1_ENTRANCE;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_1_EXIT;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_2_ENTRANCE;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_2_EXIT;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_3_ENTRANCE;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_3_EXIT;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_4_ENTRANCE;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_4_EXIT;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_5_ENTRANCE;
    public static BlockRegistryObject NYC_SUBWAY_FARE_GATE_5_EXIT;

    public static void registerModBlocks(Registry registry) {
        System.out.println("REGISTERING MTRUS BLOCKS");

        PLATFORM_NA_3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_na_3"),
                () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_NA_3_INDENTED = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_na_3_indented"),
                () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_NA_3_SLAB = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_na_3_slab"),
                () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc"),
                () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC_INDENTED = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc_indented"),
                () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC_SLAB = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc_slab"),
                () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC_LIGHT1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc_light1"),
                () -> new Block(new BlockPlatformLight(createDefaultBlockSettings(false), false, false)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC_LIGHT1_INDENTED = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc_light1_indented"),
                () -> new Block(new BlockPlatformLight(createDefaultBlockSettings(false), true, false)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC_LIGHT1_SLAB = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc_light1_slab"),
                () -> new Block(new BlockPlatformLightSlab(createDefaultBlockSettings(false), false)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC_LIGHT2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc_light2"),
                () -> new Block(new BlockPlatformLight(createDefaultBlockSettings(false), false, true)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC_LIGHT2_INDENTED = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc_light2_indented"),
                () -> new Block(new BlockPlatformLight(createDefaultBlockSettings(false), true, true)),
                ModCreativeModeTabs.MAIN
        );

        PLATFORM_DC_LIGHT2_SLAB = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "platform_dc_light2_slab"),
                () -> new Block(new BlockPlatformLightSlab(createDefaultBlockSettings(false), true)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_TILE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_tile"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_TILE_SLAB = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_tile_slab"),
                () -> new Block(new net.minecraft.world.level.block.SlabBlock(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_CONCRETE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_concrete"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_CONCRETE_SLAB = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_concrete_slab"),
                () -> new Block(new net.minecraft.world.level.block.SlabBlock(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_TRACK_LIGHT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_track_light"),
                () -> new Block(
                        new FacingSlabBlock(
                                createDefaultBlockSettings(false)
                                        .data.lightLevel(state -> 12)
                        )
                ),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A8 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a8"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a8.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A9 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a9"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a9.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A10 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a10"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a10.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A11 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a11"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a11.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A12 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a12"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a12.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_A13 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_a13"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_a13.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B8 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b8"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b8.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B9 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b9"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b9.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B10 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b10"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b10.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B11 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b11"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b11.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B12 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b12"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b12.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B13 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b13"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b13.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_B14 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_b14"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_b14.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C8 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c8"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c8.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C9 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c9"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c9.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C10 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c10"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c10.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C11 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c11"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c11.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C12 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c12"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c12.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C13 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c13"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c13.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ARCH_C14 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_arch_c14"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_arch_c14.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D1P = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d1p"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d1p.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D1S = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d1s"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d1s.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D1L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d1l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d1l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d_pillar"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D2L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d2l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d2l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_D7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_d7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_d7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E1B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e1b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e1b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E2B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e2b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e2b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E3B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e3b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e3b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E4B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e4b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e4b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E5B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e5b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e5b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E6B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e6b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e6b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E7B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e7b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e7b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e_pillar"),
                () -> new Block(new BlockDCMetroRoofEPillar(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E_PILLAR_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e_pillar_2"),
                () -> new Block(new BlockDCMetroRoofEPillar2(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_E_PILLAR_LIGHT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_e_pillar_light"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_e_pillar_light.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F1E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f1e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f1e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F2E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f2e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f2e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F3L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f3l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f3l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_f7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_F_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_f_pillar"),
                () -> new Block(new BlockDCMetroRoofFPillar(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G3L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g3l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g3l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G1E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g1e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g1e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G2E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g2e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g2e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G2F = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g2f"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g2f.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G1B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g1b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g1b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G2B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g2b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g2b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G3B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g3b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_g3b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_G_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_g_pillar"),
                () -> new Block(new BlockDCMetroRoofGPillar(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_H1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_h1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_h1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_H2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_h2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_h2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_H3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_h3"),
                () -> new Block(new BlockDCMetroRoofH(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_H4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_h4"),
                () -> new Block(new BlockDCMetroRoofH(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I1B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i1b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i1b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I2B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i2b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i2b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I3B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i3b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i3b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I4B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i4b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i4b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I5B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i5b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i5b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I6B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i6b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i6b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I7B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i7b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i7b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I1S = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i1s"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i1s.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I2S = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i2s"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i2s.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I3L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i3l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i3l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I3E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i3e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_i3e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i_pillar"),
                () -> new Block(new BlockDCMetroRoofIPillar(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_I_PILLAR_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_i_pillar_2"),
                () -> new Block(new BlockDCMetroRoofIPillar2(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J_BEAM_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j_beam_pillar"),
                () -> new Block(new BlockDCMetroRoofJBeamPillar(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j1"),
                () -> new Block(new BlockDCMetroRoofJBeam(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j2"),
                () -> new Block(new BlockDCMetroRoofJBeam(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J3L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j3l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j3l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J8 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j8"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j8.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J9 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j9"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j9.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J10 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j10"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j10.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J4B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j4b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j4b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J5B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j5b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j5b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J6B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j6b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j6b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J7B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j7b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j7b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J8B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j8b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j8b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J9B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j9b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j9b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J10B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j10b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j10b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J11 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j11"),
                () -> new Block(new BlockDCMetroRoofJ11(
                                createDefaultBlockSettings(false).nonOpaque().data.lightLevel(state -> 15)
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J12 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j12"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j12.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J13 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j13"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j13.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J14 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j14"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j14.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J_LIGHT_POLE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j_light_pole"),
                () -> new Block(new BlockDCMetroRoofJLightPole(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_J_LIGHT_POLE_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_j_light_pole_2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_j_light_pole_2.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_K1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_k1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_k1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_K1L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_k1l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_k1l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_K2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_k2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_k2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_K3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_k3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_k3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_K4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_k4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_k4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_K5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_k5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_k5.obj", 0, new double[][]{{0, 0, 12, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_L1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_l1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_l1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_L2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_l2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_l2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_L3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_l3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_l3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_L1B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_l1b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_l1b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_L2B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_l2b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_l2b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_L3B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_l3b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_l3b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_L1L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_l1l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_l1l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_L_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_l_pillar"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_l_pillar.obj", 0, new double[][]{{2, 0, 2, 14, 16, 14}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_M1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_m1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_m1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_M2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_m2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_m2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_M2L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_m2l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_m2l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_N1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_n1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_n1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_N2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_n2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_n2.obj", 0, new double[][]{{0, 0, 8, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_N3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_n3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_n3.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_N4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_n4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_n4.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O3L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o3l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o3l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o5"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o5.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o6"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o6.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o7"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o7.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O8 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o8"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o8.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O9 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o9"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o9.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O10 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o10"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o10.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O11 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o11"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o11.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O12 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o12"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o12.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O13 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o13"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o13.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O14 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o14"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o14.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O15 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o15"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o15.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o_pillar"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o_pillar.obj", 0, new double[][]{{2, 0, 2, 14, 16, 14}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_ROOF_O_PILLAR_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_roof_o_pillar_2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_roof_o_pillar_2.obj", 0, new double[][]{{2, 0, 2, 14, 16, 14}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_STATION_NAME_WALL = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_name_wall"),
                () -> new Block(new BlockDCMetroStationNameWall(createDefaultBlockSettings(false).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_STATION_NAME_WALL_END = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_name_wall_end"),
                () -> new Block(new BlockDCMetroStationNameWallEnd())
        );

        DC_METRO_STATION_NAME_POLE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_name_pole"),
                () -> new Block(new BlockDCMetroStationNamePole(createDefaultBlockSettings(false).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_STATION_NAME_POLE_END = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_name_pole_end"),
                () -> new Block(new BlockDCMetroStationNamePoleEnd())
        );

        DC_METRO_STATION_NAME_POLE_POLE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_name_pole_pole"),
                () -> new Block(new BlockDCMetroStationNamePolePole(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );
        
        DC_METRO_STATION_POLE_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_pole_1"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).nonOpaque().data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_STATION_POLE_1_D = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_pole_1_d"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).nonOpaque().data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_STATION_POLE_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_pole_2"),
                () -> new Block(new BlockDCMetroStationPole(createDefaultBlockSettings(false).nonOpaque(), false)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_STATION_POLE_2_D = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_pole_2_d"),
                () -> new Block(new BlockDCMetroStationPole(createDefaultBlockSettings(false).nonOpaque(), true)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_1"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).nonOpaque().data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_1_D = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_1_d"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).nonOpaque().data)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_2"),
                () -> new Block(new BlockDCMetroPlatformPole(createDefaultBlockSettings(false).nonOpaque(), false)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_2_D = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_2_d"),
                () -> new Block(new BlockDCMetroPlatformPole(createDefaultBlockSettings(false).nonOpaque(), true)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_3"),
                () -> new Block(new BlockDCMetroPlatformPole(createDefaultBlockSettings(false).nonOpaque(), false)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_3_D = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_3_d"),
                () -> new Block(new BlockDCMetroPlatformPole(createDefaultBlockSettings(false).nonOpaque(), true)),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_LIGHT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_light"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).nonOpaque().noCollision().data.lightLevel(state -> 15))),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_LIGHT_D = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_light_d"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).nonOpaque().noCollision().data.lightLevel(state -> 15))),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_LIGHT_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_light_2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_platform_pole_light_2.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PLATFORM_POLE_LIGHT_2_D = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole_light_2_d"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_platform_pole_light_2_d.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_000 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_000"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_000.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_001 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_001"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_001.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_002 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_002"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_002.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_003 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_003"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_003.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_010 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_010"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_010.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_011 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_011"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_011.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_012 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_012"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_012.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_013 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_013"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_013.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_100 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_100"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_100.obj", 0, new double[][]{{13, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_110 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_110"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_110.obj", 0, new double[][]{{13, 0, 13, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_200 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_200"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_200.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}, {13, 0, 0, 16, 16, 13}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FENCE_210 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fence_210"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_fence_210.obj", 0, new double[][]{{0, 0, 13, 16, 16, 16}, {13, 0, 0, 16, 16, 13}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_TRASH_CAN = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_trash_can"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_trash_can.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_BENCH_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_bench_1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_bench_1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_BENCH_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_bench_2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metro_bench_2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_LED_PIDS = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_led_pids"),
                () -> new Block(new BlockDCMetroLEDPIDS(org.mtr.mod.Blocks.createDefaultBlockSettings(false, state -> 8).strength(2.0f).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_LED_PIDS_POLE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_led_pids_pole"),
                () -> new Block(new BlockDCMetroLEDPIDSPole(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_LED_PIDS_CROSSBAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_led_pids_crossbar"),
                () -> new Block(new BlockDCMetroLEDPIDSCrossbar(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_NEW_LED_PIDS = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_new_led_pids"),
                () -> new Block(new BlockDCMetroNewLEDPIDS(org.mtr.mod.Blocks.createDefaultBlockSettings(false, state -> 8).strength(2.0f).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_NEW_LED_PIDS_POLE1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_new_led_pids_pole1"),
                () -> new Block(new BlockDCMetroNewLEDPIDSPole1(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_NEW_LED_PIDS_POLE2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_new_led_pids_pole2"),
                () -> new Block(new BlockDCMetroNewLEDPIDSPole2(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_NEW_LED_PIDS_POLE3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_new_led_pids_pole3"),
                () -> new Block(new BlockDCMetroNewLEDPIDSPole3(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_LCD_PIDS = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_lcd_pids"),
                () -> new Block(new BlockDCMetroLCDPIDS(org.mtr.mod.Blocks.createDefaultBlockSettings(false, state -> 8).strength(2.0f).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_LCD_PIDS_POLE1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_lcd_pids_pole1"),
                () -> new Block(new BlockDCMetroLCDPIDSPole1(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_LCD_PIDS_POLE2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_lcd_pids_pole2"),
                () -> new Block(new BlockDCMetroLCDPIDSPole2(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );
        
        DC_METRO_LCD_PIDS_POLE3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_lcd_pids_pole3"),
                () -> new Block(new BlockDCMetroLCDPIDSPole3(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FARE_GATE_1_ENTRANCE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fare_gate_1_entrance"),
                () -> new Block(new BlockDCMetroFareGate(
                                true
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FARE_GATE_1_EXIT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fare_gate_1_exit"),
                () -> new Block(new BlockDCMetroFareGate(
                                false
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FARE_GATE_2_ENTRANCE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fare_gate_2_entrance"),
                () -> new Block(new BlockDCMetroFareGate(
                                true
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_FARE_GATE_2_EXIT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_fare_gate_2_exit"),
                () -> new Block(new BlockDCMetroFareGate(
                                false
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_SYSTEM_MAP_WALL = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_system_map_wall"),
                () -> new Block(new BlockDCMetroSystemMap(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_SYSTEM_MAP_FLOOR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_system_map_floor"),
                () -> new Block(new BlockDCMetroSystemMap(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_SYSTEM_MAP_FLOOR_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_system_map_floor_2"),
                () -> new Block(new BlockDCMetroSystemMap2(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METRO_PSD_DOOR = registry.registerBlock(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_psd_door"),
                () -> new Block(new BlockDCMetroPSDDoor())
        );

        DC_METRO_PSD_GLASS = registry.registerBlock(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_psd_glass"),
                () -> new Block(new BlockDCMetroPSDGlass())
        );

        DC_METROBUS_SIGN = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_sign"),
                () -> new Block(new BlockDCMetrobusSign(
                                createDefaultBlockSettings(false).nonOpaque()
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_SIGN_POLE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_sign_pole"),
                () -> new Block(new BlockDCMetrobusSignPole(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_BENCH_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_bench_1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_bench_1.obj", 0, new double[][]{{0, 0, 4, 16, 9, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_BENCH_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_bench_2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_bench_2.obj", 0, new double[][]{{0, 0, 4, 16, 9, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_BENCH_3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_bench_3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_bench_3.obj", 0, new double[][]{{0, 0, 4, 16, 9, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_WALL_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_wall_1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_wall_1.obj", 0, new double[][]{{0, 0, 7.5, 16, 16, 8.5}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_WALL_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_wall_2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_wall_2.obj", 0, new double[][]{{0, 0, 7.5, 8, 16, 8.5}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_WALL_3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_wall_3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_wall_3.obj", 0, new double[][]{{7.5, 0, 7.5, 16, 16, 8.5}, {7.5, 0, 0, 8.5, 16, 7.5}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_WALL_1B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_wall_1b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_wall_1b.obj", 0, new double[][]{{0, 0, 7.5, 16, 16, 8.5}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_WALL_2B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_wall_2b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_wall_2b.obj", 0, new double[][]{{0, 0, 7.5, 8, 16, 8.5}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_WALL_3B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_wall_3b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_wall_3b.obj", 0, new double[][]{{7.5, 0, 7.5, 16, 16, 8.5}, {7.5, 0, 0, 8.5, 16, 7.5}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_WALL_1M = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_wall_1m"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_wall_1m.obj", 0, new double[][]{{0, 0, 7.5, 16, 16, 8.5}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_1"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_1.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_2"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_2.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_3"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_3.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_4"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_4.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_1E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_1e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_1e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_2E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_2e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_2e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_3E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_3e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_3e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_4E = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_4e"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_4e.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_1F = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_1f"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_1f.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_2F = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_2f"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_2f.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_3F = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_3f"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_3f.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_4F = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_4f"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_4f.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_ROOF_4L = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_roof_4l"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/dc_metrobus_roof_4l.obj", 15, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_STATION_NAME = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_station_name"),
                () -> new Block(new BlockDCMetrobusStationName(createDefaultBlockSettings(false).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        DC_METROBUS_PIDS = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_pids"),
                () -> new Block(new BlockDCMetrobusPIDS(org.mtr.mod.Blocks.createDefaultBlockSettings(false, state -> 8).strength(2.0f).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PILLAR_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_pillar_1"),
                () -> new Block(new BlockNYCSubwayPillar(createDefaultBlockSettings(false).nonOpaque(), false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PILLAR_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_pillar_2"),
                () -> new Block(new BlockNYCSubwayPillar(createDefaultBlockSettings(false).nonOpaque(), false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PILLAR_3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_pillar_3"),
                () -> new Block(new BlockNYCSubwayPillar(createDefaultBlockSettings(false).nonOpaque(), false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PILLAR_4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_pillar_4"),
                () -> new Block(new BlockNYCSubwayPillar(createDefaultBlockSettings(false).nonOpaque(), false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PILLAR_5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_pillar_5"),
                () -> new Block(new BlockNYCSubwayPillar(createDefaultBlockSettings(false).nonOpaque(), false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PILLAR_6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_pillar_6"),
                () -> new Block(new BlockNYCSubwayPillar(createDefaultBlockSettings(false).nonOpaque(), true)),
                ItemBlockEnchanted::new,
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_WALL_TILE_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_wall_tile_1"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_WALL_TILE_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_wall_tile_2"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_WALL_TILE_3 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_wall_tile_3"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_WALL_TILE_4 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_wall_tile_4"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_WALL_TILE_5 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_wall_tile_5"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_WALL_TILE_6 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_wall_tile_6"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_WALL_TILE_7 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_wall_tile_7"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_TRACKBED = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_trackbed"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FLOOR_TILE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_floor_tile"),
                () -> new Block(new net.minecraft.world.level.block.Block(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FLOOR_TILE_SLAB = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_floor_tile_slab"),
                () -> new Block(new net.minecraft.world.level.block.SlabBlock(createDefaultBlockSettings(false).data)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_STATION_NAME_PILLAR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_station_name_pillar"),
                () -> new Block(new BlockNYCSubwayStationNamePillar(createDefaultBlockSettings(false).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_STATION_NAME_WALL = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_station_name_wall"),
                () -> new Block(new BlockNYCSubwayStationNameWall(createDefaultBlockSettings(false).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_STATION_NAME_TILE_1 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_station_name_tile_1"),
                () -> new Block(new BlockNYCSubwayStationNameTile1(createDefaultBlockSettings(false).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_STATION_NAME_TILE_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_station_name_tile_2"),
                () -> new Block(new BlockNYCSubwayStationNameTile2(createDefaultBlockSettings(false).nonOpaque())),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_CEILING_SUPPORT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_ceiling_support"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_ceiling_support.obj", 0, new double[][]{{7, 8, 8, 9, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_SYSTEM_MAP_WALL = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_system_map_wall"),
                () -> new Block(new BlockDCMetroSystemMap(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_SYSTEM_MAP_FLOOR = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_system_map_floor"),
                () -> new Block(new BlockDCMetroSystemMap(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_SYSTEM_MAP_FLOOR_2 = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_system_map_floor_2"),
                () -> new Block(new BlockDCMetroSystemMap2(
                                createDefaultBlockSettings(false).nonOpaque().data
                        )),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_1A = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_1a"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_1a.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_1B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_1b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_1b.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_1C = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_1c"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_1c.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_2A = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_2a"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_2a.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_2B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_2b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_2b.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_2C = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_2c"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_2c.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_3A = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_3a"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_3a.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_3B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_3b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_3b.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_3C = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_3c"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_3c.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_4A = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_4a"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_4a.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_4B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_4b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_4b.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_PLATFORM_BARRIER_4C = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_platform_barrier_4c"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_platform_barrier_4c.obj", 0, new double[][]{{0, 0, 15, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_1A = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_1a"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_1a.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_1B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_1b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_1b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_1C = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_1c"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_1c.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_2A = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_2a"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_2a.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_2B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_2b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_2b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_2C = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_2c"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_2c.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_3A = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_3a"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_3a.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_3B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_3b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_3b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_3C = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_3c"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_3c.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_4A = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_4a"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_4a.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_4B = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_4b"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_4b.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_BENCH_4C = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_bench_4c"),
                () -> new Block(new OBJBlock(createDefaultBlockSettings(false).nonOpaque(), "mtrus:obj/nyc_subway_bench_4c.obj", 0, new double[][]{{0, 0, 0, 16, 16, 16}})),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_1_ENTRANCE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_1_entrance"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_1_entrance_closed.obj", "mtrus:obj/nyc_subway_fare_gate_1_entrance_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, true)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_1_EXIT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_1_exit"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_1_exit_closed.obj", "mtrus:obj/nyc_subway_fare_gate_1_exit_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_2_ENTRANCE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_2_entrance"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_2_entrance_closed.obj", "mtrus:obj/nyc_subway_fare_gate_2_entrance_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, true)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_2_EXIT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_2_exit"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_2_exit_closed.obj", "mtrus:obj/nyc_subway_fare_gate_2_exit_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_3_ENTRANCE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_3_entrance"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_3_entrance_closed.obj", "mtrus:obj/nyc_subway_fare_gate_3_entrance_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, true)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_3_EXIT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_3_exit"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_3_exit_closed.obj", "mtrus:obj/nyc_subway_fare_gate_3_exit_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_4_ENTRANCE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_4_entrance"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_4_entrance_closed.obj", "mtrus:obj/nyc_subway_fare_gate_4_entrance_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, true)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_4_EXIT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_4_exit"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_4_exit_closed.obj", "mtrus:obj/nyc_subway_fare_gate_4_exit_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, false)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_5_ENTRANCE = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_5_entrance"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_5_entrance_closed.obj", "mtrus:obj/nyc_subway_fare_gate_5_entrance_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, true)),
                ModCreativeModeTabs.MAIN
        );

        NYC_SUBWAY_FARE_GATE_5_EXIT = registry.registerBlockWithBlockItem(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_fare_gate_5_exit"),
                () -> new Block(new OBJFareGate("mtrus:obj/nyc_subway_fare_gate_5_exit_closed.obj", "mtrus:obj/nyc_subway_fare_gate_5_exit_open.obj", new double[][]{{0, 0, 0, 4, 16, 16}, {12, 0, 0, 16, 16, 16}}, false)),
                ModCreativeModeTabs.MAIN
        );
    }

    public static void init() {
        // Force class initialization.
    }

    private ModBlocks() {
    }
}