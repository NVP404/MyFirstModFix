package net.phuc.test_mod.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.phuc.test_mod.TestMod;
import net.minecraft.util.Identifier;
import net.phuc.test_mod.item.custom.CustomThrowableItem;
import net.phuc.test_mod.item.custom.Tuan;

public class ModItems {

    public static final Item Ruby = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item Tuan = registerItem("tuan", new Item(new Item.Settings()));
    public static final Item Cooked_Tuan = registerItem("cooked_tuan", new Tuan(new Item.Settings().food(ModFoodComponent.cooked_tuan)));

    public static final Item THINH_TRIDENT = registerItem("thinh_trident",
            new CustomThrowableItem(new Item.Settings().maxCount(1)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY_TOOLS, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY_TOOLS, 1, -2.8F))));

//    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
//        entries.add(Ruby);
//        entries.add(Tuan);
//    } //add vao ingredients

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name), item);
    } // dong nay nhu kieu dang ky ten cho no ay

    public static void registerModItems() {
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        // Dòng này để add nó vào Ingredient tab
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(THINH_TRIDENT));
    }
}

