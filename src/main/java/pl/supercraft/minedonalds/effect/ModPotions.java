package pl.supercraft.minedonalds.effect;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pl.supercraft.minedonalds.MineDonalds;

public class ModPotions {
    public static final Potion GREASY_POTION = register(
            "greasy_potion",
            new Potion(new StatusEffectInstance(ModStatusEffects.GREASY, 3600)) // 3 minuty
    );

    private static Potion register(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(MineDonalds.MOD_ID, name), potion);
    }
}