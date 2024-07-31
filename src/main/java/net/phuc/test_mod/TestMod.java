package net.phuc.test_mod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.phuc.test_mod.block.ModBlocks;
import net.phuc.test_mod.entity.custom.CustomThrowableEntity;
import net.phuc.test_mod.item.ModItems;
import net.phuc.test_mod.item.ModItemsGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.util.Identifier;
import net. minecraft. util. TypeFilter;
import  net. minecraft. resource. featuretoggle. ToggleableFeature;
import  net. fabricmc. fabric. api. object. builder. v1.entity. FabricEntityType;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "test_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.Tuan, 200);
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
	public static final EntityType<CustomThrowableEntity> CustomThrowableEntityType = Registry.register(
			Registry.ABSENT_RAW_ID,
			Identifier.of(MOD_ID, "trident_projectile"),
			EntityType.Builder.create(CustomThrowableEntity::n, SpawnGroup.MISC)
					.dimensions(EntityDimensions.fixed(0.25F, 0.25F))
					.trackRangeBlocks(4).trackedUpdateRate(10)
					.build()
	);
}