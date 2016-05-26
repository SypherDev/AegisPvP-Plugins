package com.sxn.potionce.enchants;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.Plugin;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.ConflictGroup;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;

/**
 * Pulls in all nearby enemies on hit
 */
public class Shockwave extends ConfigurableEnchantment {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Shockwave(Plugin plugin) {
        super(plugin, EnchantDefaults.SHOCKWAVE, ItemSets.ARMOR.getItems(), 1, ConflictGroup.FORCE);
        description = "Damages and pulls in enemies on attack";
        suffixGroups.add(SuffixGroups.FORCE.getKey());
    }

    /**
     * Pulls in nearby enemies on hit
     *
     * @param user   player with the enchantment
     * @param target enemy that was hit
     * @param level  enchantment level
     * @param event  event details
     */
    @Override
    public void applyDefenseEffect(LivingEntity user, LivingEntity target, int level, EntityDamageEvent event) {
        if (roll(level)) {
            int range = range(level);
            for (Entity entity : user.getNearbyEntities(range, range, range)) {
                if (works(entity, user)) {
                    ((LivingEntity) entity).damage(damage(level));
                    entity.setVelocity(user.getLocation().add(entity.getLocation()).toVector().multiply(speed(level)));
                }
            }
        }
    }
}