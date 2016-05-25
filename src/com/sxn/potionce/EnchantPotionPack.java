package com.sxn.potionce;

import com.rit.sucy.Version;
import com.rit.sucy.EnchantPlugin;
import com.rit.sucy.EnchantmentAPI;
import com.sxn.potionce.damaged.absorb.*;
import com.sxn.potionce.damaged.reflect.*;
import com.sxn.potionce.hit.steal.*;
import com.sxn.potionce.hit.inflict.*;
import com.sxn.potionce.passive.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 * A collection of enchantments for the EnchantmentAPI based on potion effects
 */
public class EnchantPotionPack extends EnchantPlugin implements CommandExecutor {

    /**
     * Plugin singleton instance
     */
    static EnchantPotionPack instance;

    /**
     * Jump enchantment reference for updating player data
     */
    Jump jump;
    
    /**
     * Energized enchantment reference for updating player data
     */
    Energized energized;

    /**
     * FullBright enchantment reference for updating player data
     */
    FullBright fullbright;
    
    /**
     * Adrenaline enchantment reference for updating player data
     */
    Adrenaline adrenaline;

    /**
     * Constructor
     */
    public EnchantPotionPack() {
        instance = this;
    }

    /**
     * onEnable
     */
    @Override
    public void onEnable() {

        // Listeners
        new EPPListener(this);

        // Apply equip effects for the passive enchantments
        for (Player player : Version.getOnlinePlayers()) {
            fullbright.initializePlayer(player);
            jump.initializePlayer(player);
            energized.initializePlayer(player);
            adrenaline.initializePlayer(player);
        }
    }

    /**
     * onDisable
     */
    @Override
    public void onDisable() {

        // Clear effects and data for passive enchantments
        fullbright.clearPlayers();
        jump.clearPlayers();
        energized.clearPlayers();
        adrenaline.clearPlayers();

        // Remove listeners
        HandlerList.unregisterAll(this);
    }

    /**
     * If the config is missing a value, put it there
     *
     * @param path  path to check
     * @param value default value
     */
    public static void put(String path, Object value) {
        if (instance.getConfig().contains(path))
            return;

        instance.getConfig().set(path, value);
    }

    /**
     * Registers all of the custom enchantments
     */
    @Override
    public void registerEnchantments() {
        fullbright = new FullBright(this);
        jump = new Jump(this);
        energized = new Energized(this);

        EnchantmentAPI.registerCustomEnchantments(
        		new Berserking(this),
        		new Blinding(this),
        		new Cursed(this),
        		new Fervor(this),
        		new Frost(this),
        		new Magma(this),
        		new Phantom(this),
        		new Poisoned(this),
        		new Root(this),
        		new Toxic(this),
        		new Wither(this),
                jump, fullbright, energized, adrenaline
        );

        // Update the config (because EnchantDefaults will have put any missing data)
        saveConfig();
    }

    /**
     * Does nothing when run as .jar
     *
     * @param args not used
     */
    public static void main(String[] args){}
}