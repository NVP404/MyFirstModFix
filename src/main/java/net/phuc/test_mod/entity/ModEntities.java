package net.phuc.test_mod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.phuc.test_mod.TestMod;
import net.phuc.test_mod.entity.custom.CustomThrowableEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<CustomThrowableEntity> TRIDENT_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TestMod.MOD_ID, "trident_projectile"),
            FabricEntityTypeBuilder.<CustomThrowableEntity>create(SpawnGroup.MISC, CustomThrowableEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

}