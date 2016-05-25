package com.sxn.potionce.hit.inflict;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Applies poison on hit
 */
public class Poisoned extends PotionInflict {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Poisoned(Plugin plugin) {
        super(plugin, EnchantDefaults.POISONED,  ItemSets.SWORDS.getItems());
        description = "Poisons enemies on hit";
        suffixGroups.add(SuffixGroups.POISON.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.POISON;
    }
}