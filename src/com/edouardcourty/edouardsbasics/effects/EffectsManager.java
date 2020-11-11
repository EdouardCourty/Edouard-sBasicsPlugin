package com.edouardcourty.edouardsbasics.effects;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectsManager {

    public static PotionEffect saturation;
    public static PotionEffect healing;
    public static PotionEffect glowing;

    public static void init() {
        createSaturationEffect();
        createHealingEffect();
        createGlowingEffect();
    }

    private static void createSaturationEffect() {
        saturation = new PotionEffect(PotionEffectType.SATURATION,
                1000,
                2,
                false,
                false
        );
    }

    private static void createHealingEffect() {
        healing = new PotionEffect(PotionEffectType.HEAL,
                1000,
                2,
                false,
                false
        );
    }

    private static void createGlowingEffect() {
        glowing = new PotionEffect(PotionEffectType.GLOWING,
                1000,
                0,
                false,
                false
        );
    }
}
