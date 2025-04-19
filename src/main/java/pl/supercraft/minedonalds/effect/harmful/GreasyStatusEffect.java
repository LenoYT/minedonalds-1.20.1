package pl.supercraft.minedonalds.effect.harmful;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class GreasyStatusEffect extends StatusEffect {
    public GreasyStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 0x111111); // kolor efektu
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

        entity.addStatusEffect(new StatusEffectInstance(
                StatusEffects.SLOWNESS,
                2,
                amplifier,
                false, // ambient
                false, // showParticles
                false  // showIcon
        ));
    }
}
