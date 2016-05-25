package com.sxn.potionce.hit.steal;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Gains movement speed on attack
 */
public class Fervor extends PotionSteal {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Fervor(Plugin plugin) {
        super(plugin, EnchantDefaults.FERVOR, ItemSets.SWORDS.getItems());
        description = "Grants bonus speed on hit";
        suffixGroups.add(SuffixGroups.SPEED.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.FAST_DIGGING;
    }
}