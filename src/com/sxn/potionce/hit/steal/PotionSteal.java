package com.sxn.potionce.hit.steal;

import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.PotionEnchantment;
import com.sxn.potionce.data.ConflictGroup;
import com.sxn.potionce.data.EnchantDefaults;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;

public abstract class PotionSteal extends ConfigurableEnchantment implements PotionEnchantment {

    /**
     * Constructor
     *
     * @param plugin plugin reference
     * @param type   enchantment type
     * @param items  natural items
     */
    public PotionSteal(Plugin plugin, EnchantDefaults type, Material[] items) {
        super(plugin, type, items, ConflictGroup.PDA);
    }

    /**
     * Applies potion effect on hit
     *
     * @param user   player with the enchantment
     * @param target enemy that was hit
     * @param level  enchantment level
     * @param event  event details
     */
    @Override
    public void applyEffect(LivingEntity user, LivingEntity target, int level, EntityDamageByEntityEvent event) {
        if (roll(level) && works(target, user))
            user.addPotionEffect(new PotionEffect(type(), duration(level), tier(level)), true);
    }
}