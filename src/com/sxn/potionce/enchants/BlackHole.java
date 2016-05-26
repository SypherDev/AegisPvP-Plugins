package com.sxn.potionce.enchants;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.ConflictGroup;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;

/**
 * Pulls in all nearby enemies on hit
 */
public class BlackHole extends ConfigurableEnchantment {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public BlackHole(Plugin plugin) {
        super(plugin, EnchantDefaults.BLACKHOLE, ItemSets.SBOWS.getItems(), 1, ConflictGroup.FORCE);
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
    public void applyEffect(LivingEntity user, LivingEntity target, int level, EntityDamageByEntityEvent event) {
        if (roll(level)) {
            int range = range(level);
            for (Entity entity : user.getNearbyEntities(range, range, range)) {
                if (works(entity, user)) {
                    ((LivingEntity) entity).damage(damage(level));
                    entity.setVelocity(user.getLocation().subtract(entity.getLocation()).toVector().multiply(speed(level)));
                }
            }
        }
    }
}