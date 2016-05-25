package com.sxn.potionce.passive;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Passively grants water breathing jump height
 */
public class Gills extends PotionPassive {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Gills(Plugin plugin) {
        super(plugin, EnchantDefaults.GILLS, ItemSets.HELMETS.getItems());
        description = "Passively grants water breathing bonus";
        suffixGroups.add(SuffixGroups.BREATHING.getKey());
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.WATER_BREATHING;
    }
}