package com.sxn.potionce.data;

import java.util.Arrays;
import java.util.Hashtable;

import com.sxn.potionce.EnchantPotionPack;

/**
 * Default data for enchantments
 *
 * EnchantName, Attributes<name, value>
 */
public enum EnchantDefaults {
/**
 * Passive Potion Enchantments
 */
    ADRENALINE ("Adrenaline", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.TIER_BASE.getKey(), 1);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
    }}),

    ENERGIZED ("Energized", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 2);
        put(ConfigValues.TIER_BASE.getKey(), 1);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
    }}),

    FULLBRIGHT ("Night Vision", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 2);
        put(ConfigValues.TIER_BASE.getKey(), 1);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
    }}),
    
    GILLS ("Gills", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.TIER_BASE.getKey(), 1);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
    }}),
    
    REVIVE ("Revive", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.TIER_BASE.getKey(), 1);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
    }}),

    SATURATION ("Saturation", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.TIER_BASE.getKey(), 1);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
    }}),

    JUMP ("Jump", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.TIER_BASE.getKey(), 1);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
    }}),
/**
 * On-Hit Potion Enchantments
 */

    BERSERKING ("Berserking", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 1);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    BLINDING ("Blinding", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    CURSED ("Cursed", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),
    DISTORTION ("Distortion", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    FERVOR ("Fervor", new Hashtable<String, Object>() {{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    FROST ("Frost", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    HEALTHBOOST ("HealthBoost", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),
    
    JUGGERNAUT ("Juggernaut", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    MAGMA ("Magma", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),
    
    NETHERSHIELD ("NetherShield", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    PHANTOM ("Phantom", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    POISONED ("Poisoned", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    ROOT ("Root", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    TOXIC ("Toxic", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    WITHER ("Wither", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 1);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),

    CONFUSION ("Confusion", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 100);
        put(ConfigValues.CHANCE_BONUS.getKey(), 0);
        put(ConfigValues.TIER_BASE.getKey(), 2);
        put(ConfigValues.TIER_BONUS.getKey(), 0);
        put(ConfigValues.DUR_BASE.getKey(), 2);
        put(ConfigValues.DUR_BONUS.getKey(), 0.5);
    }}),
/*
 * Other Passive Enchantments	
 */
    
/*
 * Other Non-Passive Enchantments
 */
    TPAYNO ("TPAYourNutsOff", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.CHANCE_BASE.getKey(), 10);
        put(ConfigValues.CHANCE_BONUS.getKey(), 10);
    }}),
    
    LAUNCH ("Launch", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),
    
    LIGHTNING ("Lightning", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),
    
    SHOCKWAVE ("Shockwave", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),
    
    SHADOWSHIFT ("ShadowShift", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),
    
    LIFE ("Life", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),
    
    LIFESTEAL ("Lifesteal", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),
    
    REFLECT ("Reflect", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),
    
    SNIPER ("Sniper", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),
	
    BLACKHOLE ("BlackHole", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 4);
        put(ConfigValues.CHANCE_BASE.getKey(), 5);
        put(ConfigValues.CHANCE_BONUS.getKey(), 2.5);
        put(ConfigValues.SPD_BASE.getKey(), 0.8);
        put(ConfigValues.SPD_BONUS.getKey(), 0);
    }}),

    RAGE ("Rage", new Hashtable<String, Object>(){{
        put(ConfigValues.MAX.getKey(), 5);
        put(ConfigValues.DMG_BASE.getKey(), 1);
        put(ConfigValues.DMG_BONUS.getKey(), 1);
        put(ConfigValues.STACKS_BASE.getKey(), 1);
        put(ConfigValues.STACKS_BONUS.getKey(), 1);
    }});

    /**
     * Enchantment name
     */
    private final String name;

    /**
     * Enchantment attributes
     */
    private final Hashtable<String, Object> values;

    /**
     * Constructor
     *
     * @param name   enchantment name
     * @param values enchantment attributes
     */
    private EnchantDefaults(String name, Hashtable<String, Object> values) {
        this.name = name;
        this.values = values;

        // Make sure the config has at least the default values
        EnchantPotionPack.put(getPath() + ConfigValues.PVP.getKey(), true);
        EnchantPotionPack.put(getPath() + ConfigValues.PVE.getKey(), true);
        String[] names = values.keySet().toArray(new String[values.size()]);
        Arrays.sort(names);
        for (String key : names) {
            EnchantPotionPack.put(getPath() + key, values.get(key));
        }
    }

    /**
     * @return enchantment name
     */
    public String getName() {
        return name;
    }

    /**
     * @return enchantment config path
     */
    public String getPath() {
        return name.replace(" ", "") + ".";
    }

    /**
     * @return enchantment attributes
     */
    public Hashtable<String, Object> getValues() {
        return values;
    }
}