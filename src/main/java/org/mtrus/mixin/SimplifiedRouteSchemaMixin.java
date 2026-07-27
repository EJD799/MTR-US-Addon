package org.mtrus.mixin;

import org.mtr.core.generated.data.SimplifiedRouteSchema;
import org.mtr.core.serializer.ReaderBase;
import org.mtr.core.serializer.WriterBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import org.mtrus.api.SimplifiedRouteSchemaExtension;

@Mixin(SimplifiedRouteSchema.class)
public abstract class SimplifiedRouteSchemaMixin implements SimplifiedRouteSchemaExtension {

    @Unique
    private String mtrus$routeNumber = "";

    @Override
    public String mtrus$getRouteNumber() {
        return mtrus$routeNumber;
    }

    @Override
    public void mtrus$setRouteNumber(String routeNumber) {
        mtrus$routeNumber = routeNumber;
    }

    @Inject(method = "<init>(Lorg/mtr/core/serializer/ReaderBase;)V", at = @At("RETURN"))
    private void mtrus$readRouteNumber(ReaderBase readerBase, CallbackInfo ci) {
        mtrus$routeNumber = readerBase.getString("routeNumber", "");
    }

    @Inject(method = "serializeData", at = @At("TAIL"))
    private void mtrus$writeRouteNumber(WriterBase writerBase, CallbackInfo ci) {
        writerBase.writeString("routeNumber", mtrus$routeNumber);
    }
}