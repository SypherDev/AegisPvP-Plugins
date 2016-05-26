package com.sxn.potionce.enchants;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.EnchantDefaults;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.Plugin;

public class Sniper extends ConfigurableEnchantment {

    public Sniper(Plugin plugin) {
        super(plugin, EnchantDefaults.SNIPER, new Material[] { Material.BOW }, 10);
        description = "Fire faster projectiles";
        suffixGroups.add(SuffixGroups.PROJECTILE.getKey());
    }

    @Override
    public void applyProjectileEffect(LivingEntity user, int level, ProjectileLaunchEvent event) {
        event.getEntity().setVelocity(event.getEntity().getVelocity().multiply(speed(level)));
    }
}