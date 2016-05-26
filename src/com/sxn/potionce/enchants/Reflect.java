package com.sxn.potionce.enchants;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.ConflictGroup;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.Plugin;

/**
 * Reflects damage back at attackers
 */
public class Reflect extends ConfigurableEnchantment {

    private static boolean applying = false;

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public Reflect(Plugin plugin) {
        super(plugin, EnchantDefaults.REFLECT, ItemSets.ARMOR.getItems(), ConflictGroup.POD);
        description = "Reflects damage back at attackers";
        suffixGroups.add(SuffixGroups.STRENGTH.getKey());
    }

    /**
     * Reflects damage when hit
     *
     * @param user   player with the enchantment
     * @param target enemy that hit the player
     * @param level  enchantment level
     * @param event  event details
     */
    @Override
    public void applyDefenseEffect(LivingEntity user, LivingEntity target, int level, EntityDamageEvent event) {
        if (!applying && roll(level) && works(target, user))
        {
            applying = true;
            target.damage((int) (event.getDamage() * percent(level)), user);
            applying = false;
        }
    }
}