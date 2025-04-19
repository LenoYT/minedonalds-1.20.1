package pl.supercraft.minedonalds.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import pl.supercraft.minedonalds.effect.ModStatusEffects;


public class ModFoodComponents {
    public static final FoodComponent QUARTERED_POTATOES = new FoodComponent.Builder()
            .hunger(3)
            .saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400), 1.0f)
            .build();

    public static final FoodComponent FRIES = new FoodComponent.Builder()
            .hunger(9)
            .saturationModifier(0.7f)
            .build();

    public static final FoodComponent FRIED_QUARTERED_POTATOES = new FoodComponent.Builder()
            .hunger(7)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(ModStatusEffects.GREASY, 400), 1.0F)
            .build();

}
