package com.sxn.potionce.enchants;


import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.ConflictGroup;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;

/**
 * Name suggested by TheCentralGamer.
 */
public class TPAYourNutsOff extends ConfigurableEnchantment {

    public TPAYourNutsOff(Plugin plugin) {
        super(plugin, EnchantDefaults.TPAYNO, ItemSets.SWORDS.getItems(), 1, ConflictGroup.FORCE);
        description = "Teleports you around the target, while still facing them. Think of yourself as an enderman.";
        suffixGroups.add(SuffixGroups.FORCE.getKey());
    }
    
    @Override
    public void applyEffect(LivingEntity user, LivingEntity target, int level, EntityDamageByEntityEvent event) {
        if (roll(level)) {
        	Location targetLoc = target.getLocation();
        	Location userLoc = user.getLocation();
        	double distance = userLoc.distance(targetLoc);
        	double theta = 2 * Math.PI * Math.random();
        	Location newLoc = targetLoc.add(new Vector(distance * Math.cos(theta), distance * Math.sin(theta), 0));
        	newLoc.setYaw((float) (2*Math.PI - theta));
        	user.teleport(newLoc);
        }
    }
    
}
