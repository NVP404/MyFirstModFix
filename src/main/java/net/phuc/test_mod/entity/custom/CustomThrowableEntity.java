package net.phuc.test_mod.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class CustomThrowableEntity extends ThrownItemEntity {
    public CustomThrowableEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public CustomThrowableEntity(World world, LivingEntity owner) {
        super(null, owner, world); // null will be changed later
    }

    public CustomThrowableEntity(World world, double x, double y, double z) {
        super(null, x, y, z, world); // null will be changed later
    }

    @Override
    protected Item getDefaultItem() {
        return null; // We will configure this later, once we have created the ProjectileItem.
    }
}
