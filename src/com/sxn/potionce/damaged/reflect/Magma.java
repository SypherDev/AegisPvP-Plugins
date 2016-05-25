package com.sxn.potionce.damaged.reflect;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.ConflictGroup;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.Plugin;

/**
 * Sets enemies on fire when they hit you
 */
public class Magma extends ConfigurableEnchantment {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Magma(Plugin plugin) {
        super(plugin, EnchantDefaults.MAGMA, ItemSets.ARMOR.getItems(), 2, ConflictGroup.POD);
        description = "Burns enemies when hit";
        suffixGroups.add(SuffixGroups.FIRE.getKey());
    }

    /**
     * Sets attackers on fire
     *
     * @param user   player with the enchantment
     * @param target enemy that hit the player
     * @param level  enchantment level
     * @param event  event details
     */
    @Override
    public void applyDefenseEffect(LivingEntity user, LivingEntity target, int level, EntityDamageEvent event) {
        if (roll(level) && works(target, user))
            target.setFireTicks(duration(level));
    }
}
