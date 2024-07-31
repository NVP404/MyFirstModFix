package net.phuc.test_mod.mixin;

import net.phuc.test_mod.TestMod;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    protected abstract void addModel(ModelIdentifier modelId);

    public void addCustomModel(BlockColors blockColors, Profiler profiler, Map<Identifier, JsonUnbakedModel> jsonUnbakedModels, CallbackInfo ci) {
        // Add the custom model to the model loader
        this.addModel(new ModelIdentifier(Identifier.of(TestMod.MOD_ID, "custom_model"), "inventory"));
    }
}

