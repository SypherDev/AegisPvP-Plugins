package com.sxn.potionce.hit.steal;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

public class Berserking extends PotionSteal {

    public Berserking(Plugin plugin) {
        super(plugin, EnchantDefaults.BERSERKING, ItemSets.MELEE.getItems());
        description = "Grants bonus damage on attack";
        suffixGroups.add(SuffixGroups.STRENGTH.getKey());
    }

    public PotionEffectType type() {
        return PotionEffectType.INCREASE_DAMAGE;
    }
}