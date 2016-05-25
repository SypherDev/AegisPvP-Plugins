package com.sxn.potionce.damaged.absorb;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

/**
 * Grants invisibility when struck
 */
public class Juggernaut extends PotionAbsorb {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Juggernaut(Plugin plugin) {
        super (plugin, EnchantDefaults.JUGGERNAUT, ItemSets.BOOTS.getItems());
        description = "Grants resistance when hit";
        suffixGroups.add(SuffixGroups.INVISIBILITY.getKey());
    }

    /**
     * @return type of potion applied by this enchantment
     */
    public PotionEffectType type() {
        return PotionEffectType.DAMAGE_RESISTANCE;
    }
}