package net.phuc.test_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;         //Cai nay quan trong
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.phuc.test_mod.TestMod;
import net.phuc.test_mod.block.ModBlocks;

public class ModItemsGroup {
    public static final ItemGroup TEST_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "test"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.ruby")) //Cho cais ten thoi
                    .icon(() -> new ItemStack(Items.PAPER)) //Icon :vvv
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Ruby);
                        entries.add(ModItems.Tuan);
                        entries.add(ModItems.Cooked_Tuan);
                        entries.add(ModItems.THINH_TRIDENT);
                        entries.add(ModItems.RUBY_PICKAXE);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.TUAN_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_SLAB);
                    })
                    .build()
    );

    public static void registerItemGroup() {

    }
}

