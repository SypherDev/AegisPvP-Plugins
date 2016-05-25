package com.sxn.potionce.damaged.absorb;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Grants invisibility when struck
 */
public class Phantom extends PotionAbsorb {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Phantom(Plugin plugin) {
        super (plugin, EnchantDefaults.PHANTOM, ItemSets.ARMOR.getItems());
        description = "Grants temporary invisibility when hit";
        suffixGroups.add(SuffixGroups.INVISIBILITY.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.INVISIBILITY;
    }
}