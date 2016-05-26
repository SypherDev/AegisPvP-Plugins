package com.sxn.potionce.enchants;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.ConflictGroup;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;

/**
 * Has a chance to knock enemies up into the air on hit
 */
public class Launch extends ConfigurableEnchantment {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Launch(Plugin plugin) {
        super(plugin, EnchantDefaults.LAUNCH, ItemSets.SWORDS.getItems(), 10, ConflictGroup.FORCE);
        description = "Has a chance to knock the target into the air";
        suffixGroups.add(SuffixGroups.FORCE.getKey());
    }

    /**
     * Knocks enemies up on hit
     *
     * @param user   player with the enchantment
     * @param target enemy that was hit
     * @param level  enchantment level
     * @param event  event details
     */
    @Override
    public void applyEffect(LivingEntity user, LivingEntity target, int level, EntityDamageByEntityEvent event) {
        if (roll(level) && works(target, user))
            // Need to knock them up later to get past Minecraft's knockback on taking damage
            new LaunchTask(target, (float)speed(level)).runTaskLater(plugin, 1);
    }
}