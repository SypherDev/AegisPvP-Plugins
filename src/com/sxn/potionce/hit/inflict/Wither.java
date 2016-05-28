package com.sxn.potionce.hit.inflict;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
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
        super(plugin, EnchantDefaults.WITHER, ItemSets.MELEE.getItems());
        description = "Applies wither on hit";
        suffixGroups.add(SuffixGroups.WITHER.getKey());
    }

	@Override
	public PotionEffectType type() {
		return PotionEffectType.WITHER;
	}
}