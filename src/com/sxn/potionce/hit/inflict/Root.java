package com.sxn.potionce.hit.inflict;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Slows enemies on hit
 */
public class Root extends PotionInflict {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Root(Plugin plugin) {
        super(plugin, EnchantDefaults.ROOT, ItemSets.SWORDS.getItems());
        description = "Slows enemies on hit";
        suffixGroups.add(SuffixGroups.SLOWING.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.SLOW;
    }
}