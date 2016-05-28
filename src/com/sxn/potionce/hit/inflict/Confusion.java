package com.sxn.potionce.hit.inflict;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;

public class Confusion extends PotionInflict {

	public Confusion(Plugin plugin) {
        super(plugin, EnchantDefaults.CONFUSION,  ItemSets.BOXES.getItems());
        description = "Warps its victims' vision";
        suffixGroups.add(SuffixGroups.BLIND.getKey()); // there's no SuffixGroups.CONFUSION, rip
	}

	@Override
	public PotionEffectType type() {
		return PotionEffectType.CONFUSION;
	}
}
