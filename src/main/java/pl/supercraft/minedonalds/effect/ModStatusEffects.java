package pl.supercraft.minedonalds.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import pl.supercraft.minedonalds.MineDonalds;
import pl.supercraft.minedonalds.effect.harmful.GreasyStatusEffect;

public class ModStatusEffects {
    public static final StatusEffect GREASY = register(
            "greasy",
            new GreasyStatusEffect()
    );

    private static StatusEffect register(String id, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MineDonalds.MOD_ID, id), effect);
    }
}