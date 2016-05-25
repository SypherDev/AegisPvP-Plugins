package com.sxn.potionce.damaged.reflect;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Poisons enemies when they hit you
 */
public class Toxic extends PotionReflect {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Toxic(Plugin plugin) {
        super(plugin, EnchantDefaults.TOXIC, ItemSets.HELMETS.getItems());
        description = "Poisons enemies when hit";
        suffixGroups.add(SuffixGroups.POISON.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.POISON;
    }
}