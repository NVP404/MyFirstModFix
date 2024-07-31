package net.phuc.test_mod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.phuc.test_mod.entity.EntityRenderer;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRenderer.register(TestMod.CustomThrowableEntityType, FlyingItemEntityRenderer::new);
    }
}
