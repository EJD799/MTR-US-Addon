package org.mtrus;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.EntityTypeRegistryObject;
import org.mtr.mapping.registry.Registry;
import org.mtrus.entity.SeatEntity;

public final class ModEntityTypes {

    public static EntityTypeRegistryObject<SeatEntity> SEAT = null;

    public static void registerEntityTypes(Registry registry) {
        SEAT = registry.registerEntityType(
                new Identifier("mtrus", "seat"),
                SeatEntity::new,
                0.01F,
                0.01F
        );
    }

    private ModEntityTypes() {}
}