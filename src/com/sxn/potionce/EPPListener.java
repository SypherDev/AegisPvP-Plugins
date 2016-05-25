package com.sxn.potionce;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

/**
 * Listener for the EnchantmentPack
 */
public class EPPListener implements Listener {

    /**
     * Plugin reference
     */
    Plugin plugin;

    /**
     * Constructor
     *
     * @param plugin plugin reference
     */
    public EPPListener(Plugin plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    /**
     * Apply passive abilities when players join
     *
     * @param event event details
     */
    @EventHandler
    public void onConnect(PlayerJoinEvent event) {
        EnchantPotionPack.instance.fullbright.initializePlayer(event.getPlayer());
        EnchantPotionPack.instance.jump.initializePlayer(event.getPlayer());
        EnchantPotionPack.instance.energized.initializePlayer(event.getPlayer());
        EnchantPotionPack.instance.adrenaline.initializePlayer(event.getPlayer());
        EnchantPotionPack.instance.nethershield.initializePlayer(event.getPlayer());
        EnchantPotionPack.instance.revive.initializePlayer(event.getPlayer());
        EnchantPotionPack.instance.saturation.initializePlayer(event.getPlayer());
        EnchantPotionPack.instance.gills.initializePlayer(event.getPlayer());
    }

    /**
     * Remove passive abilities when players leave
     *
     * @param event event details
     */
    @EventHandler
    public void onDisconnect(PlayerQuitEvent event) {
        EnchantPotionPack.instance.fullbright.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.jump.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.energized.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.adrenaline.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.nethershield.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.revive.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.saturation.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.gills.clearPlayer(event.getPlayer().getName());
    }

    /**
     * Remove passive abilities when players are kicked
     *
     * @param event event details
     */
    @EventHandler
    public void onDisconnect(PlayerKickEvent event) {
        EnchantPotionPack.instance.fullbright.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.jump.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.energized.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.adrenaline.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.nethershield.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.revive.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.saturation.clearPlayer(event.getPlayer().getName());
        EnchantPotionPack.instance.gills.clearPlayer(event.getPlayer().getName());
    }
}