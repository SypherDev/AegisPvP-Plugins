package com.sxn.potionce.enchants;


import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
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
        description = "Teleports you around the target, while still facing them. Not for use in enclosed areas.";
        suffixGroups.add(SuffixGroups.FORCE.getKey());
    }
    
    @Override
    public void applyEffect(LivingEntity user, LivingEntity target, int level, EntityDamageByEntityEvent event) {
        if (roll(level)) {
        	Location targetLoc = target.getLocation();
        	Location userLoc = user.getLocation();
        	for (int i=0; i < 5; i++) {
        		user.getWorld().playEffect(userLoc, Effect.FLYING_GLYPH, 0);
        	}
        	user.getWorld().playSound(userLoc, Sound.ENDERMAN_TELEPORT, 1f, (float) (1 + 0.5*Math.random()));
        	double distance = userLoc.distance(targetLoc);
        	double theta = 2 * Math.PI * Math.random();
        	Location newLoc = targetLoc.add(new Vector(distance * Math.cos(theta), 0.25, distance * Math.sin(theta)));
        	newLoc.setYaw((float) Math.toDegrees(theta) + 90);
        	for (int i=0; i < 10; i++) {
        		user.getWorld().playEffect(newLoc, Effect.PORTAL, 0);
        	}
        	user.teleport(newLoc);
        }
    }
    
}
