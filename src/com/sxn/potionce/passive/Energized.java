package com.sxn.potionce.passive;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Passively grants bonus jump height
 */
public class Energized extends PotionPassive {
    public Energized(Plugin plugin) {
        super(plugin, EnchantDefaults.ENERGIZED, ItemSets.BOOTS.getItems());
        description = "Passively grants movement speed bonus";
        suffixGroups.add(SuffixGroups.SPEED.getKey());
    }
    public PotionEffectType type() {
        return PotionEffectType.SPEED;
    }
}