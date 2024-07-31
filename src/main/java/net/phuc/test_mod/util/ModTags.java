package net.phuc.test_mod.util;

import net.phuc.test_mod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MOD_TAG = TagKey.of(RegistryKeys.BLOCK, TestMod.id("example"));
        public static final TagKey<Block> INCORRECT_FOR_EXAMPLE_TOOL =
                TagKey.of(RegistryKeys.BLOCK, TestMod.id("incorrect_for_example_tool"));
    }
}
