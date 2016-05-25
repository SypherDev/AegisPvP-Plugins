package com.sxn.potionce.passive;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Passively grants regeneration height
 */
public class Revive extends PotionPassive {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Revive(Plugin plugin) {
        super(plugin, EnchantDefaults.REVIVE, ItemSets.CHESTPLATES.getItems());
        description = "Passively grants regeneration bonus";
        suffixGroups.add(SuffixGroups.HEALTH.getKey());
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.REGENERATION;
    }
}