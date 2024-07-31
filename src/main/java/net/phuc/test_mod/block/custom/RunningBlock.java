package net.phuc.test_mod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.phuc.test_mod.item.ModItems;

public class RunningBlock extends Block {
    public RunningBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            if (stack.getItem() == Items.DIAMOND_SWORD || stack.getItem() == Items.IRON_SWORD ||
                    stack.getItem() == Items.GOLDEN_SWORD || stack.getItem() == Items.STONE_SWORD ||
                    stack.getItem() == Items.WOODEN_SWORD) {

                player.sendMessage(Text.literal("Bạn đã bị giết bởi Tuấn mai ráp!\nDám thách thức tuấn à"), false);
                player.kill();
                return ItemActionResult.SUCCESS;
            }
            if (stack.getItem() == ModItems.Tuan) {
                player.sendMessage(Text.literal("Vào đây solo minecraft"), false);
                player.sendMessage(Text.literal("Bạn cho cái totem này"), false);

                ItemStack totem = new ItemStack(Items.TOTEM_OF_UNDYING);
                ItemStack sword = new ItemStack(Items.DIAMOND_SWORD);
                if (!player.getInventory().insertStack(totem)) {
                    player.dropItem(totem, false);
                }
                if (!player.getInventory().insertStack(sword)) {
                    player.dropItem(sword, false);
                }
                stack.decrement(1);

                return ItemActionResult.SUCCESS;
            }
        }
        return ItemActionResult.FAIL; // If you want to signify failure
    }
}