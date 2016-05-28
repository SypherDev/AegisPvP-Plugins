package com.sxn.potionce;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

import com.sxn.potionce.passive.PotionPassive;

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
    	System.out.printf("[EPP] instance=%s, passiveeffects=%s\n", EnchantPotionPack.instance, EnchantPotionPack.instance.passiveEffects);
    	for (PotionPassive passive: EnchantPotionPack.instance.passiveEffects) {
        	System.out.printf("[EPP] instance=%s, passiveeffects=%s\n, passive=%s, event=%s, event.getPlayer()=%s", 
        			EnchantPotionPack.instance, EnchantPotionPack.instance.passiveEffects, passive, event, event.getPlayer());
            passive.initializePlayer(event.getPlayer());
    	}
    }

    /**
     * Remove passive abilities when players leave
     *
     * @param event event details
     */
    @EventHandler
    public void onDisconnect(PlayerQuitEvent event) {
    	for (PotionPassive passive: EnchantPotionPack.instance.passiveEffects) {
            passive.clearPlayer(event.getPlayer().getName());
    	}
    }

    /**
     * Remove passive abilities when players are kicked
     *
     * @param event event details
     */
    @EventHandler
    public void onDisconnect(PlayerKickEvent event) {
    	for (PotionPassive passive: EnchantPotionPack.instance.passiveEffects) {
            passive.clearPlayer(event.getPlayer().getName());
    	}
    }
}