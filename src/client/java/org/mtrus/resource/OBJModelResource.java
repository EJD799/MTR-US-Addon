package org.mtrus.resource;

import org.mtr.libraries.it.unimi.dsi.fastutil.objects.Object2ObjectAVLTreeMap;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.mapper.OptimizedModel;
import org.mtr.mapping.mapper.OptimizedRenderer;
import org.mtr.mod.resource.OptimizedModelWrapper;
import org.mtr.mod.client.CustomResourceLoader;
import org.mtrus.MTRUSAddon;

import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.resources.ResourceLocation;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public final class OBJModelResource {

    private static final Map<String, OptimizedModelWrapper> MODELS = new HashMap<>();


    public static OptimizedModelWrapper getModel(String modelPath) {

        return MODELS.computeIfAbsent(
                modelPath,
                OBJModelResource::loadModel
        );
    }


    private static OptimizedModelWrapper loadModel(String modelPath) {

        MTRUSAddon.LOGGER.info("[MTRUS] Loading OBJ: " + modelPath);

        CustomResourceLoader.OPTIMIZED_RENDERER_WRAPPER.beginReload();

        if (!OptimizedRenderer.hasOptimizedRendering()) {
            MTRUSAddon.LOGGER.info("[MTRUS] Optimized rendering unavailable");
            return null;
        }

        Identifier identifier = Identifier.tryParse(modelPath);

        if (identifier == null) {
            MTRUSAddon.LOGGER.error("[MTRUS] Invalid OBJ identifier: " + modelPath);
            return null;
        }

        String objContent = readResource(identifier);

        String directory = identifier.getPath().substring(
                0,
                identifier.getPath().lastIndexOf('/') + 1
        );

        Object2ObjectAVLTreeMap<String, OptimizedModel.ObjModel> rawModels =
                new Object2ObjectAVLTreeMap<>(
                        OptimizedModel.ObjModel.loadModel(
                                objContent,

                                mtl -> readResource(
                                        new Identifier(
                                                identifier.getNamespace(),
                                                directory + mtl
                                        )
                                ),

                                texture -> {
                                    String texturePath = directory + texture;

                                    MTRUSAddon.LOGGER.info("[MTRUS] OBJ texture reference: '" + texture + "'");
                                    MTRUSAddon.LOGGER.info("[MTRUS] Resolved texture: "
                                            + identifier.getNamespace() + ":" + texturePath);

                                    return new Identifier(
                                            identifier.getNamespace(),
                                            texturePath
                                    );
                                },

                                null,
                                true,
                                true
                        )
                );

        MTRUSAddon.LOGGER.info("[MTRUS] Raw model keys: " + rawModels.keySet());

        ObjectArrayList<OptimizedModelWrapper.ObjModelWrapper> models =
                new ObjectArrayList<>();

        rawModels.values().forEach(model -> {

            OptimizedModelWrapper.ObjModelWrapper wrapper =
                    new OptimizedModelWrapper.ObjModelWrapper(model);

            wrapper.addTransformation(
                    OptimizedModel.ShaderType.CUTOUT,
                    0,
                    0,
                    0,
                    false
            );

            models.add(wrapper);
        });

        MTRUSAddon.LOGGER.info("[MTRUS] Loaded OBJ parts: " + rawModels.size());

        OptimizedModelWrapper wrapper =
                OptimizedModelWrapper.fromObjModels(models);

        MTRUSAddon.LOGGER.info("[MTRUS] Wrapper: " + wrapper);

        CustomResourceLoader.OPTIMIZED_RENDERER_WRAPPER.finishReload();
        
        return wrapper;
    }


    private static String readResource(Identifier identifier) {

        try {

            ResourceLocation location =
                    new ResourceLocation(
                            identifier.getNamespace(),
                            identifier.getPath()
                    );


            Optional<Resource> resource =
                    Minecraft.getInstance()
                            .getResourceManager()
                            .getResource(location);


            if (resource.isPresent()) {

                try (InputStream stream =
                             resource.get().open()) {

                    return new String(
                            stream.readAllBytes(),
                            StandardCharsets.UTF_8
                    );
                }
            }

            MTRUSAddon.LOGGER.error(
                    "[MTRUS] Missing resource: " + identifier
            );

        } catch (Exception e) {

            e.printStackTrace();

        }


        return "";
    }


    private OBJModelResource() {
    }
}