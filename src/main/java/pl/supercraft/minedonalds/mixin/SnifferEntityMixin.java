package pl.supercraft.minedonalds.mixin;

import net.minecraft.entity.passive.SnifferEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pl.supercraft.minedonalds.item.ModItems;

@Mixin(SnifferEntity.class)
public abstract class SnifferEntityMixin {

	@Inject(method = "interactMob", at = @At("HEAD"), cancellable = true)
	private void onBrushUsed(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
		ItemStack itemStack = player.getStackInHand(hand);

		if (itemStack.isOf(Items.BRUSH)) {
			World world = player.getWorld();

			if (!world.isClient) {
				SnifferEntity sniffer = (SnifferEntity)(Object)this;

				world.playSound(
						null,
						player.getX(), player.getY(), player.getZ(),
						SoundEvents.ITEM_BRUSH_BRUSHING_GENERIC,
						SoundCategory.PLAYERS,
						1.0F,
						1.0F
				);

				sniffer.dropStack(new ItemStack(ModItems.SNIFFER_TUFT), 0.5F);
			}

			itemStack.damage(8, player, p -> p.sendToolBreakStatus(hand));
			cir.setReturnValue(ActionResult.SUCCESS);
		}
	}
}
