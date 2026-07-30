package org.mtrus;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.SoundEventRegistryObject;

public final class ModSoundEvents {
   public static final SoundEventRegistryObject DC_METRO_FARE_GATE;
   public static final SoundEventRegistryObject NYC_SUBWAY_TURNSTILE_ENTRANCE;
   public static final SoundEventRegistryObject NYC_SUBWAY_TURNSTILE_EXIT;
   public static final SoundEventRegistryObject NYC_SUBWAY_FARE_GATE;

   public ModSoundEvents() {
   }

   public static void init() {
      MTRUSAddon.LOGGER.info("Registering MTR US Addon sound events");
   }

   static {
      DC_METRO_FARE_GATE = MTRUSAddon.registry.registerSoundEvent(new Identifier("mtrus", "dc_metro_fare_gate"));
      NYC_SUBWAY_TURNSTILE_ENTRANCE = MTRUSAddon.registry.registerSoundEvent(new Identifier("mtrus", "nyc_subway_turnstile_entrance"));
      NYC_SUBWAY_TURNSTILE_EXIT = MTRUSAddon.registry.registerSoundEvent(new Identifier("mtrus", "nyc_subway_turnstile_exit"));
      NYC_SUBWAY_FARE_GATE = MTRUSAddon.registry.registerSoundEvent(new Identifier("mtrus", "nyc_subway_fare_gate"));
   }
}
