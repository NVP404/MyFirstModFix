package net.phuc.test_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.phuc.test_mod.TestMod;
import net.phuc.test_mod.block.custom.RunningBlock;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).sounds(BlockSoundGroup.COPPER).requiresTool()));

    public static final Block TUAN_BLOCK = registerBlock("tuan_block",
            new RunningBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool()));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)
                            .strength(2f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            )
    );
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                            .strength(4f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            )
    );
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_SLAB)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .strength(4f)
                    .requiresTool()));

    public static void registerModBlocks() {

    }
}
