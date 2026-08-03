package org.mtrus.render;

import net.minecraft.resources.ResourceLocation;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.mapper.EntityRenderer;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtrus.entity.SeatEntity;

public class RenderSeatEntity extends EntityRenderer<SeatEntity> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation("minecraft", "textures/misc/white.png");

    private static final Identifier TEXTURE_MTR =
            new Identifier("minecraft", "textures/misc/white.png");

    @SuppressWarnings("deprecation")
    public RenderSeatEntity(Argument argument) {
        super(argument);
    }

    @Override
    public void render(
            SeatEntity entity,
            float yaw,
            float tickDelta,
            GraphicsHolder graphicsHolder,
            int light
    ) {
        // Invisible entity
    }

    @Override
    public ResourceLocation getTextureLocation(SeatEntity entity) {
        return TEXTURE;
    }

    @Override
    public Identifier getTexture2(SeatEntity entity) {
        return TEXTURE_MTR;
    }
}