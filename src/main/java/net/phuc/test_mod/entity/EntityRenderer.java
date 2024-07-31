package net.phuc.test_mod.entity;

import net.minecraft.entity.Entity;
import net.phuc.test_mod.entity.custom.CustomThrowableEntity;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.entity.EntityType;

public class EntityRenderer {
    public static <CustomThrowableEntity extends Entity> void register(EntityType<CustomThrowableEntity> entityType, EntityRendererFactory<CustomThrowableEntity> factory) {
        EntityRendererRegistry.register(entityType, factory);
    }
}
