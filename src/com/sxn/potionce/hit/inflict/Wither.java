package com.sxn.potionce.hit.inflict;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Applies wither on hit
 */
public class Wither extends PotionInflict {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Wither(Plugin plugin) {
        super(plugin, EnchantDefaults.WITHER, ItemSets.SWORDS.getItems());
        description = "Applies wither on hit";
        suffixGroups.add(SuffixGroups.WITHER.getKey());
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.WITHER;
    }
}