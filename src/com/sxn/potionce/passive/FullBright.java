package com.sxn.potionce.passive;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Passively grants night vision
 *
 * Original Author: JefferiesTube
 * Re-written by: Eniripsa96
 */
public class FullBright extends PotionPassive {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public FullBright(Plugin plugin) {
        super(plugin, EnchantDefaults.FULLBRIGHT, ItemSets.HELMETS.getItems());
        description = "Passively grants night vision";
        suffixGroups.add(SuffixGroups.NIGHT_VISION.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.NIGHT_VISION;
    }
}