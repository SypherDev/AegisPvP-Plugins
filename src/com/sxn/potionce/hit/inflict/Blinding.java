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
 * Blinds enemies on hit
 */
public class Blinding extends PotionInflict {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Blinding(Plugin plugin) {
        super(plugin, EnchantDefaults.BLINDING, ItemSets.SBOWS.getItems());
        description = "Blinds enemies on hit";
        suffixGroups.add(SuffixGroups.BLIND.getKey());
    }

    /**
     * @return potion type applied by this enchantment
     */
	@Override
	public PotionEffectType type() {
		return PotionEffectType.BLINDNESS;
	}
}