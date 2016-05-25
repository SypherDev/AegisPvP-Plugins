package com.sxn.potionce.damaged.reflect;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Slows enemies attacks on hit
 */
public class Frost extends PotionReflect {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Frost(Plugin plugin) {
        super(plugin, EnchantDefaults.FROST, ItemSets.LEGGINGS.getItems());
        description = "Gives enemies mining fatigue when hit";
        suffixGroups.add(SuffixGroups.SLOWING.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.SLOW_DIGGING;
    }
}