package com.sxn.potionce.passive;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Passively grants saturation height
 */
public class Saturation extends PotionPassive {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Saturation(Plugin plugin) {
        super(plugin, EnchantDefaults.SATURATION, ItemSets.HELMETS.getItems());
        description = "Passively grants saturation bonus";
        suffixGroups.add(SuffixGroups.SPEED.getKey());
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.SATURATION;
    }
}