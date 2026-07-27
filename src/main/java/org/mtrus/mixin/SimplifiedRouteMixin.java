package org.mtrus.mixin;

import org.mtr.core.data.Route;
import org.mtr.core.data.SimplifiedRoute;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import org.mtrus.api.SimplifiedRouteSchemaExtension;

@Mixin(SimplifiedRoute.class)
public abstract class SimplifiedRouteMixin {

    @Inject(method = "<init>(Lorg/mtr/core/data/Route;)V", at = @At("RETURN"))
    private void mtrus$init(Route route, CallbackInfo ci) {
        ((SimplifiedRouteSchemaExtension) (Object) this)
                .mtrus$setRouteNumber(route.getRouteNumber());
    }
}