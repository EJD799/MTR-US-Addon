package org.mtrus;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockEntityTypeRegistryObject;
import org.mtrus.block.BlockPlatformLightEntity;
import org.mtrus.block.OBJBlockEntity;
import org.mtrus.block.BlockDCMetroStationNameWallEntity;
import org.mtrus.block.BlockDCMetroLCDPIDSEntity;
import org.mtrus.block.BlockDCMetroLEDPIDSEntity;
import org.mtrus.block.BlockDCMetroNewLEDPIDSEntity;
import org.mtrus.block.BlockDCMetroPSDDoorEntity;
import org.mtrus.block.BlockDCMetroPSDGlassEntity;
import org.mtrus.block.BlockDCMetroPlatformPoleEntity;
import org.mtrus.block.BlockDCMetroStationNamePoleEntity;
import org.mtrus.block.BlockDCMetroStationPoleEntity;
import org.mtrus.block.BlockDCMetrobusSignEntity;
import org.mtrus.block.BlockDCMetrobusStationNameEntity;
import org.mtrus.block.BlockDCMetrobusPIDSEntity;
import org.mtrus.block.BlockNYCSubwayStationNamePillarEntity;
import org.mtrus.block.BlockNYCSubwayStationNameWallEntity;
import org.mtrus.block.BlockNYCSubwayStationNameTile1Entity;
import org.mtrus.block.BlockNYCSubwayStationNameTile2Entity;

@SuppressWarnings({"unchecked"})
public final class ModBlockEntityTypes {

    public static BlockEntityTypeRegistryObject<BlockPlatformLightEntity> PLATFORM_LIGHT = null;
    public static BlockEntityTypeRegistryObject<OBJBlockEntity> OBJ_BLOCK = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroStationNameWallEntity> DC_METRO_STATION_NAME_WALL = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroStationNamePoleEntity> DC_METRO_STATION_NAME_POLE = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroStationPoleEntity> DC_METRO_STATION_POLE = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroPlatformPoleEntity> DC_METRO_PLATFORM_POLE = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroLEDPIDSEntity> DC_METRO_LED_PIDS = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroNewLEDPIDSEntity> DC_METRO_NEW_LED_PIDS = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroLCDPIDSEntity> DC_METRO_LCD_PIDS = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroPSDDoorEntity> DC_METRO_PSD_DOOR = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetroPSDGlassEntity> DC_METRO_PSD_GLASS = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetrobusSignEntity> DC_METROBUS_SIGN = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetrobusStationNameEntity> DC_METROBUS_STATION_NAME = null;
    public static BlockEntityTypeRegistryObject<BlockDCMetrobusPIDSEntity> DC_METROBUS_PIDS = null;
    public static BlockEntityTypeRegistryObject<BlockNYCSubwayStationNamePillarEntity> NYC_SUBWAY_STATION_NAME_PILLAR = null;
    public static BlockEntityTypeRegistryObject<BlockNYCSubwayStationNameWallEntity> NYC_SUBWAY_STATION_NAME_WALL = null;
    public static BlockEntityTypeRegistryObject<BlockNYCSubwayStationNameTile1Entity> NYC_SUBWAY_STATION_NAME_TILE_1 = null;
    public static BlockEntityTypeRegistryObject<BlockNYCSubwayStationNameTile2Entity> NYC_SUBWAY_STATION_NAME_TILE_2 = null;

    public static void registerBlockEntityTypes() {
        PLATFORM_LIGHT = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "platform_light"),
                BlockPlatformLightEntity::new,
                ModBlocks.PLATFORM_DC_LIGHT1::get,
                ModBlocks.PLATFORM_DC_LIGHT1_INDENTED::get,
                ModBlocks.PLATFORM_DC_LIGHT2::get,
                ModBlocks.PLATFORM_DC_LIGHT2_INDENTED::get,
                ModBlocks.PLATFORM_DC_LIGHT1_SLAB::get,
                ModBlocks.PLATFORM_DC_LIGHT2_SLAB::get
        );

        OBJ_BLOCK = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "obj_block"),
                OBJBlockEntity::new,
                ModBlocks.DC_METRO_ARCH_A1::get,
                ModBlocks.DC_METRO_ARCH_A2::get,
                ModBlocks.DC_METRO_ARCH_A3::get,
                ModBlocks.DC_METRO_ARCH_A4::get,
                ModBlocks.DC_METRO_ARCH_A5::get,
                ModBlocks.DC_METRO_ARCH_A6::get,
                ModBlocks.DC_METRO_ARCH_A7::get,
                ModBlocks.DC_METRO_ARCH_A8::get,
                ModBlocks.DC_METRO_ARCH_A9::get,
                ModBlocks.DC_METRO_ARCH_A10::get,
                ModBlocks.DC_METRO_ARCH_A11::get,
                ModBlocks.DC_METRO_ARCH_A12::get,
                ModBlocks.DC_METRO_ARCH_A13::get,
                ModBlocks.DC_METRO_ARCH_B1::get,
                ModBlocks.DC_METRO_ARCH_B2::get,
                ModBlocks.DC_METRO_ARCH_B3::get,
                ModBlocks.DC_METRO_ARCH_B4::get,
                ModBlocks.DC_METRO_ARCH_B5::get,
                ModBlocks.DC_METRO_ARCH_B6::get,
                ModBlocks.DC_METRO_ARCH_B7::get,
                ModBlocks.DC_METRO_ARCH_B8::get,
                ModBlocks.DC_METRO_ARCH_B9::get,
                ModBlocks.DC_METRO_ARCH_B10::get,
                ModBlocks.DC_METRO_ARCH_B11::get,
                ModBlocks.DC_METRO_ARCH_B12::get,
                ModBlocks.DC_METRO_ARCH_B13::get,
                ModBlocks.DC_METRO_ARCH_B14::get,
                ModBlocks.DC_METRO_ARCH_C1::get,
                ModBlocks.DC_METRO_ARCH_C2::get,
                ModBlocks.DC_METRO_ARCH_C3::get,
                ModBlocks.DC_METRO_ARCH_C4::get,
                ModBlocks.DC_METRO_ARCH_C5::get,
                ModBlocks.DC_METRO_ARCH_C6::get,
                ModBlocks.DC_METRO_ARCH_C7::get,
                ModBlocks.DC_METRO_ARCH_C8::get,
                ModBlocks.DC_METRO_ARCH_C9::get,
                ModBlocks.DC_METRO_ARCH_C10::get,
                ModBlocks.DC_METRO_ARCH_C11::get,
                ModBlocks.DC_METRO_ARCH_C12::get,
                ModBlocks.DC_METRO_ARCH_C13::get,
                ModBlocks.DC_METRO_ARCH_C14::get,
                ModBlocks.DC_METRO_ROOF_D1::get,
                ModBlocks.DC_METRO_ROOF_D1P::get,
                ModBlocks.DC_METRO_ROOF_D1S::get,
                ModBlocks.DC_METRO_ROOF_D1L::get,
                ModBlocks.DC_METRO_ROOF_D2::get,
                ModBlocks.DC_METRO_ROOF_D2L::get,
                ModBlocks.DC_METRO_ROOF_D3::get,
                ModBlocks.DC_METRO_ROOF_D4::get,
                ModBlocks.DC_METRO_ROOF_D5::get,
                ModBlocks.DC_METRO_ROOF_D6::get,
                ModBlocks.DC_METRO_ROOF_D7::get,
                ModBlocks.DC_METRO_ROOF_E1::get,
                ModBlocks.DC_METRO_ROOF_E2::get,
                ModBlocks.DC_METRO_ROOF_E3::get,
                ModBlocks.DC_METRO_ROOF_E4::get,
                ModBlocks.DC_METRO_ROOF_E5::get,
                ModBlocks.DC_METRO_ROOF_E6::get,
                ModBlocks.DC_METRO_ROOF_E7::get,
                ModBlocks.DC_METRO_ROOF_E1B::get,
                ModBlocks.DC_METRO_ROOF_E2B::get,
                ModBlocks.DC_METRO_ROOF_E3B::get,
                ModBlocks.DC_METRO_ROOF_E4B::get,
                ModBlocks.DC_METRO_ROOF_E5B::get,
                ModBlocks.DC_METRO_ROOF_E6B::get,
                ModBlocks.DC_METRO_ROOF_E7B::get,
                ModBlocks.DC_METRO_ROOF_E_PILLAR_LIGHT::get,
                ModBlocks.DC_METRO_ROOF_F1::get,
                ModBlocks.DC_METRO_ROOF_F1E::get,
                ModBlocks.DC_METRO_ROOF_F2::get,
                ModBlocks.DC_METRO_ROOF_F2E::get,
                ModBlocks.DC_METRO_ROOF_F3::get,
                ModBlocks.DC_METRO_ROOF_F3L::get,
                ModBlocks.DC_METRO_ROOF_F4::get,
                ModBlocks.DC_METRO_ROOF_F5::get,
                ModBlocks.DC_METRO_ROOF_F6::get,
                ModBlocks.DC_METRO_ROOF_F7::get,
                ModBlocks.DC_METRO_ROOF_G1::get,
                ModBlocks.DC_METRO_ROOF_G2::get,
                ModBlocks.DC_METRO_ROOF_G3::get,
                ModBlocks.DC_METRO_ROOF_G4::get,
                ModBlocks.DC_METRO_ROOF_G5::get,
                ModBlocks.DC_METRO_ROOF_G6::get,
                ModBlocks.DC_METRO_ROOF_G7::get,
                ModBlocks.DC_METRO_ROOF_G3L::get,
                ModBlocks.DC_METRO_ROOF_G1E::get,
                ModBlocks.DC_METRO_ROOF_G2E::get,
                ModBlocks.DC_METRO_ROOF_G2F::get,
                ModBlocks.DC_METRO_ROOF_G1B::get,
                ModBlocks.DC_METRO_ROOF_G2B::get,
                ModBlocks.DC_METRO_ROOF_G3B::get,
                ModBlocks.DC_METRO_ROOF_H1::get,
                ModBlocks.DC_METRO_ROOF_H2::get,
                ModBlocks.DC_METRO_ROOF_I1::get,
                ModBlocks.DC_METRO_ROOF_I2::get,
                ModBlocks.DC_METRO_ROOF_I3::get,
                ModBlocks.DC_METRO_ROOF_I4::get,
                ModBlocks.DC_METRO_ROOF_I5::get,
                ModBlocks.DC_METRO_ROOF_I6::get,
                ModBlocks.DC_METRO_ROOF_I7::get,
                ModBlocks.DC_METRO_ROOF_I1B::get,
                ModBlocks.DC_METRO_ROOF_I2B::get,
                ModBlocks.DC_METRO_ROOF_I3B::get,
                ModBlocks.DC_METRO_ROOF_I4B::get,
                ModBlocks.DC_METRO_ROOF_I5B::get,
                ModBlocks.DC_METRO_ROOF_I6B::get,
                ModBlocks.DC_METRO_ROOF_I7B::get,
                ModBlocks.DC_METRO_ROOF_I1S::get,
                ModBlocks.DC_METRO_ROOF_I2S::get,
                ModBlocks.DC_METRO_ROOF_I3L::get,
                ModBlocks.DC_METRO_ROOF_I3E::get,
                ModBlocks.DC_METRO_ROOF_J3::get,
                ModBlocks.DC_METRO_ROOF_J3L::get,
                ModBlocks.DC_METRO_ROOF_J4::get,
                ModBlocks.DC_METRO_ROOF_J5::get,
                ModBlocks.DC_METRO_ROOF_J6::get,
                ModBlocks.DC_METRO_ROOF_J7::get,
                ModBlocks.DC_METRO_ROOF_J8::get,
                ModBlocks.DC_METRO_ROOF_J9::get,
                ModBlocks.DC_METRO_ROOF_J10::get,
                ModBlocks.DC_METRO_ROOF_J4B::get,
                ModBlocks.DC_METRO_ROOF_J5B::get,
                ModBlocks.DC_METRO_ROOF_J6B::get,
                ModBlocks.DC_METRO_ROOF_J7B::get,
                ModBlocks.DC_METRO_ROOF_J8B::get,
                ModBlocks.DC_METRO_ROOF_J9B::get,
                ModBlocks.DC_METRO_ROOF_J10B::get,
                ModBlocks.DC_METRO_ROOF_J12::get,
                ModBlocks.DC_METRO_ROOF_J13::get,
                ModBlocks.DC_METRO_ROOF_J14::get,
                ModBlocks.DC_METRO_ROOF_J_LIGHT_POLE_2::get,
                ModBlocks.DC_METRO_ROOF_K1::get,
                ModBlocks.DC_METRO_ROOF_K1L::get,
                ModBlocks.DC_METRO_ROOF_K2::get,
                ModBlocks.DC_METRO_ROOF_K3::get,
                ModBlocks.DC_METRO_ROOF_K4::get,
                ModBlocks.DC_METRO_ROOF_K5::get,
                ModBlocks.DC_METRO_ROOF_L1::get,
                ModBlocks.DC_METRO_ROOF_L2::get,
                ModBlocks.DC_METRO_ROOF_L3::get,
                ModBlocks.DC_METRO_ROOF_L1B::get,
                ModBlocks.DC_METRO_ROOF_L2B::get,
                ModBlocks.DC_METRO_ROOF_L3B::get,
                ModBlocks.DC_METRO_ROOF_L1L::get,
                ModBlocks.DC_METRO_ROOF_L_PILLAR::get,
                ModBlocks.DC_METRO_ROOF_M1::get,
                ModBlocks.DC_METRO_ROOF_M2::get,
                ModBlocks.DC_METRO_ROOF_M2L::get,
                ModBlocks.DC_METRO_ROOF_N1::get,
                ModBlocks.DC_METRO_ROOF_N2::get,
                ModBlocks.DC_METRO_ROOF_N3::get,
                ModBlocks.DC_METRO_ROOF_N4::get,
                ModBlocks.DC_METRO_ROOF_O1::get,
                ModBlocks.DC_METRO_ROOF_O2::get,
                ModBlocks.DC_METRO_ROOF_O3::get,
                ModBlocks.DC_METRO_ROOF_O3L::get,
                ModBlocks.DC_METRO_ROOF_O4::get,
                ModBlocks.DC_METRO_ROOF_O5::get,
                ModBlocks.DC_METRO_ROOF_O6::get,
                ModBlocks.DC_METRO_ROOF_O7::get,
                ModBlocks.DC_METRO_ROOF_O8::get,
                ModBlocks.DC_METRO_ROOF_O9::get,
                ModBlocks.DC_METRO_ROOF_O10::get,
                ModBlocks.DC_METRO_ROOF_O11::get,
                ModBlocks.DC_METRO_ROOF_O12::get,
                ModBlocks.DC_METRO_ROOF_O13::get,
                ModBlocks.DC_METRO_ROOF_O14::get,
                ModBlocks.DC_METRO_ROOF_O15::get,
                ModBlocks.DC_METRO_ROOF_O_PILLAR::get,
                ModBlocks.DC_METRO_ROOF_O_PILLAR_2::get,
                ModBlocks.DC_METRO_FENCE_000::get,
                ModBlocks.DC_METRO_FENCE_001::get,
                ModBlocks.DC_METRO_FENCE_002::get,
                ModBlocks.DC_METRO_FENCE_003::get,
                ModBlocks.DC_METRO_FENCE_010::get,
                ModBlocks.DC_METRO_FENCE_011::get,
                ModBlocks.DC_METRO_FENCE_012::get,
                ModBlocks.DC_METRO_FENCE_013::get,
                ModBlocks.DC_METRO_FENCE_100::get,
                ModBlocks.DC_METRO_FENCE_110::get,
                ModBlocks.DC_METRO_FENCE_200::get,
                ModBlocks.DC_METRO_FENCE_210::get,
                ModBlocks.DC_METRO_TRASH_CAN::get,
                ModBlocks.DC_METRO_BENCH_1::get,
                ModBlocks.DC_METRO_BENCH_2::get,
                ModBlocks.DC_METRO_PLATFORM_POLE_LIGHT_2::get,
                ModBlocks.DC_METRO_PLATFORM_POLE_LIGHT_2_D::get,
                ModBlocks.DC_METROBUS_BENCH_1::get,
                ModBlocks.DC_METROBUS_BENCH_2::get,
                ModBlocks.DC_METROBUS_BENCH_3::get,
                ModBlocks.DC_METROBUS_WALL_1::get,
                ModBlocks.DC_METROBUS_WALL_2::get,
                ModBlocks.DC_METROBUS_WALL_3::get,
                ModBlocks.DC_METROBUS_WALL_1B::get,
                ModBlocks.DC_METROBUS_WALL_2B::get,
                ModBlocks.DC_METROBUS_WALL_3B::get,
                ModBlocks.DC_METROBUS_WALL_1M::get,
                ModBlocks.DC_METROBUS_ROOF_1::get,
                ModBlocks.DC_METROBUS_ROOF_2::get,
                ModBlocks.DC_METROBUS_ROOF_3::get,
                ModBlocks.DC_METROBUS_ROOF_4::get,
                ModBlocks.DC_METROBUS_ROOF_1E::get,
                ModBlocks.DC_METROBUS_ROOF_2E::get,
                ModBlocks.DC_METROBUS_ROOF_3E::get,
                ModBlocks.DC_METROBUS_ROOF_4E::get,
                ModBlocks.DC_METROBUS_ROOF_1F::get,
                ModBlocks.DC_METROBUS_ROOF_2F::get,
                ModBlocks.DC_METROBUS_ROOF_3F::get,
                ModBlocks.DC_METROBUS_ROOF_4F::get,
                ModBlocks.DC_METROBUS_ROOF_4L::get
        );

        DC_METRO_STATION_NAME_WALL = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_name_wall"),
                BlockDCMetroStationNameWallEntity::new,
                ModBlocks.DC_METRO_STATION_NAME_WALL::get
        );

        DC_METRO_STATION_NAME_POLE = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_name_pole"),
                BlockDCMetroStationNamePoleEntity::new,
                ModBlocks.DC_METRO_STATION_NAME_POLE::get
        );

        DC_METRO_STATION_POLE = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_station_pole"),
                BlockDCMetroStationPoleEntity::new,
                ModBlocks.DC_METRO_STATION_POLE_2::get,
                ModBlocks.DC_METRO_STATION_POLE_2_D::get
        );

        DC_METRO_PLATFORM_POLE = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_platform_pole"),
                BlockDCMetroPlatformPoleEntity::new,
                ModBlocks.DC_METRO_PLATFORM_POLE_2::get,
                ModBlocks.DC_METRO_PLATFORM_POLE_2_D::get,
                ModBlocks.DC_METRO_PLATFORM_POLE_3::get,
                ModBlocks.DC_METRO_PLATFORM_POLE_3_D::get
        );

        DC_METRO_LED_PIDS = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_led_pids"),
                BlockDCMetroLEDPIDSEntity::new,
                ModBlocks.DC_METRO_LED_PIDS::get
        );

        DC_METRO_NEW_LED_PIDS = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_new_led_pids"),
                BlockDCMetroNewLEDPIDSEntity::new,
                ModBlocks.DC_METRO_NEW_LED_PIDS::get
        );

        DC_METRO_LCD_PIDS = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_lcd_pids"),
                BlockDCMetroLCDPIDSEntity::new,
                ModBlocks.DC_METRO_LCD_PIDS::get
        );

        DC_METRO_PSD_DOOR = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_psd_door"),
                BlockDCMetroPSDDoorEntity::new,
                ModBlocks.DC_METRO_PSD_DOOR::get
        );

        DC_METRO_PSD_GLASS = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metro_psd_glass"),
                BlockDCMetroPSDGlassEntity::new,
                ModBlocks.DC_METRO_PSD_GLASS::get
        );

        DC_METROBUS_SIGN = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_sign"),
                BlockDCMetrobusSignEntity::new,
                ModBlocks.DC_METROBUS_SIGN::get
        );

        DC_METROBUS_STATION_NAME = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_station_name"),
                BlockDCMetrobusStationNameEntity::new,
                ModBlocks.DC_METROBUS_STATION_NAME::get
        );

        DC_METROBUS_PIDS = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "dc_metrobus_pids"),
                BlockDCMetrobusPIDSEntity::new,
                ModBlocks.DC_METROBUS_PIDS::get
        );

        NYC_SUBWAY_STATION_NAME_PILLAR = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_station_name_pillar"),
                BlockNYCSubwayStationNamePillarEntity::new,
                ModBlocks.NYC_SUBWAY_STATION_NAME_PILLAR::get
        );

        NYC_SUBWAY_STATION_NAME_WALL = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_station_name_wall"),
                BlockNYCSubwayStationNameWallEntity::new,
                ModBlocks.NYC_SUBWAY_STATION_NAME_WALL::get
        );

        NYC_SUBWAY_STATION_NAME_TILE_1 = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_station_name_tile_1"),
                BlockNYCSubwayStationNameTile1Entity::new,
                ModBlocks.NYC_SUBWAY_STATION_NAME_TILE_1::get
        );

        NYC_SUBWAY_STATION_NAME_TILE_2 = MTRUSAddon.registry.registerBlockEntityType(
                new Identifier(MTRUSAddon.MOD_ID, "nyc_subway_station_name_tile_2"),
                BlockNYCSubwayStationNameTile2Entity::new,
                ModBlocks.NYC_SUBWAY_STATION_NAME_TILE_2::get
        );
    }

    private ModBlockEntityTypes() {}
}