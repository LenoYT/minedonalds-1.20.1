package pl.supercraft.minedonalds.mixin;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pl.supercraft.minedonalds.item.ModItems;

@Mixin(ItemColors.class)
public class ModItemsColorMixin {
    @Inject(method = "create", at = @At("RETURN"))
    private static void addSnifferTuftColor(BlockColors blockColors, CallbackInfoReturnable<ItemColors> cir) {
        ItemColors itemColors = cir.getReturnValue();
        // Rejestracja koloru dla SNIFFER_TUFT
        itemColors.register((stack, tintIndex) -> {
            return tintIndex == 0 ? 0xFF00FF : -1;
        }, ModItems.SNIFFER_TUFT);
    }
}
