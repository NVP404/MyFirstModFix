package net.phuc.test_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier; // Correct import
import net.phuc.test_mod.block.ModBlocks;
import net.phuc.test_mod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public static final List<ItemConvertible> RUBY_SMELTABLE = List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.Tuan);

    public ModRecipeProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> lookupFuture) {
        super(dataOutput, lookupFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RUBY_SMELTABLE, RecipeCategory.MISC, ModItems.Ruby,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLE, RecipeCategory.MISC, ModItems.Ruby,
                0.7f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Ruby, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Tuan, RecipeCategory.DECORATIONS, ModBlocks.TUAN_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_SLAB, ModBlocks.RUBY_BLOCK, 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_SLAB, 6)
                .pattern("###")
                .input('#', ModItems.Ruby)
                .criterion("has_item", conditionsFromItem(ModItems.Ruby))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.RUBY_SLAB)));
    }

}
