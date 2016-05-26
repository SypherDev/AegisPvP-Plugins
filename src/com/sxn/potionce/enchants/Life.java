package com.sxn.potionce.enchants;

import com.rit.sucy.service.SuffixGroups;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Life extends ConfigurableEnchantment {

    public Life(Plugin plugin) {
        super(plugin, EnchantDefaults.LIFE, ItemSets.CHESTPLATES.getItems(), 2);
        description = "Grants bonus health when equipped";
        suffixGroups.add(SuffixGroups.HEALTH.getKey());
    }

    @Override
    public void applyEquipEffect(Player player, int level) {
        player.setMaxHealth(20 + health(level));
        double health = player.getHealth() + health(level);
        if (health > player.getMaxHealth()) health = player.getMaxHealth();
        player.setHealth(health);
    }

    @Override
    public void applyUnequipEffect(Player player, int level) {
        player.setMaxHealth(20);
    }
}