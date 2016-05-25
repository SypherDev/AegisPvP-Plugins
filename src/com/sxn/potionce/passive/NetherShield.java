package com.sxn.potionce.passive;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Passively grants bonus jump height
 */
public class NetherShield extends PotionPassive {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public NetherShield(Plugin plugin) {
        super(plugin, EnchantDefaults.NETHERSHIELD, ItemSets.BOOTS.getItems());
        description = "Passively grants jump bonus";
        suffixGroups.add(SuffixGroups.FIRE.getKey());
    }

    /**
     * @return potion type applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.FIRE_RESISTANCE;
    }
}