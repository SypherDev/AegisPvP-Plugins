package com.sxn.potionce.damaged.absorb;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Grants extra health when struck
 */
public class HealthBoost extends PotionAbsorb {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public HealthBoost(Plugin plugin) {
        super (plugin, EnchantDefaults.HEALTHBOOST, ItemSets.HELMETS.getItems());
        description = "Grants extra health when struck";
        suffixGroups.add(SuffixGroups.HEALTH.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.HEALTH_BOOST;
    }
}