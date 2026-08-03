package org.mtrus.entity;

import org.mtr.mapping.holder.EntityType;
import org.mtr.mapping.holder.World;
import org.mtr.mapping.mapper.EntityExtension;

public class SeatEntity extends EntityExtension {

    public SeatEntity(EntityType<?> type, World world) {
        super(type, world);
    }

    private int lifetime = 0;

    @Override
    public void tick2() {
        super.tick2();

        if (getPassengers().isEmpty()) {
            lifetime++;
            if (lifetime > 20) { // 1 second
                discard();
            }
        } else {
            lifetime = 0;
        }
    }

    @Override
    public void initDataTracker2() {
        // No tracked data needed
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }
}