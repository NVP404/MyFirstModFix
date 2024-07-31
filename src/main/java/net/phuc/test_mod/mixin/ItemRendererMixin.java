package net.phuc.test_mod.mixin;

import net.phuc.test_mod.TestMod;
import net.phuc.test_mod.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    private ItemStack modifyItemStack(ItemStack stack) {
        // Add your modification logic here
        if (stack.getItem() == ModItems.THINH_TRIDENT) {
            // Example modification: set a custom model
            stack = new ItemStack(ModItems.THINH_TRIDENT);
        }
        return stack;
    }
}
