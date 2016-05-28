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
 * Slows enemies on hit
 */
public class Root extends PotionInflict {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Root(Plugin plugin) {
        super(plugin, EnchantDefaults.ROOT, ItemSets.SBOWS.getItems());
        description = "Slows enemies on hit";
        suffixGroups.add(SuffixGroups.SLOWING.getKey());
    }

	@Override
	public PotionEffectType type() {
		return PotionEffectType.SLOW;
	}
}