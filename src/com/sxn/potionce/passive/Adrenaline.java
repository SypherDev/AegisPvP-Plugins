package com.sxn.potionce.passive;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Passively grants extra damage
 */
public class Adrenaline extends PotionPassive {
    public Adrenaline(Plugin plugin) {
        super(plugin, EnchantDefaults.ADRENALINE, ItemSets.BOOTS.getItems());
        description = "Passively grants extra damage";
        suffixGroups.add(SuffixGroups.STRENGTH.getKey());
    }
    public PotionEffectType type() {
        return PotionEffectType.INCREASE_DAMAGE;
    }
}