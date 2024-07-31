package net.phuc.test_mod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponent {
    public static final FoodComponent cooked_tuan = new FoodComponent.Builder()
            .nutrition(3)
            .alwaysEdible()
            .snack()
            // The duration is in ticks, 20 ticks = 1 second
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 200), 200f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 200f)
            .build();

}
