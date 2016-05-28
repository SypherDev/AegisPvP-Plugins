package com.sxn.potionce;

import com.rit.sucy.Version;
import com.rit.sucy.EnchantPlugin;
import com.rit.sucy.EnchantmentAPI;
import com.sxn.potionce.damaged.absorb.*;
import com.sxn.potionce.damaged.reflect.*;
import com.sxn.potionce.hit.steal.*;
import com.sxn.potionce.hit.inflict.*;
import com.sxn.potionce.passive.*;
import com.sxn.potionce.enchants.*;
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
     * NetherShield enchantment reference for updating player data
     */
    NetherShield nethershield;
    /**
     * Gills enchantment reference for updating player data
     */
    Gills gills;
    /**
     * Saturation enchantment reference for updating player data
     */
    Saturation saturation;
    /**
     * Revive enchantment reference for updating player data
     */
    Revive revive;

    PotionPassive[] passiveEffects;
    
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
    	for (PotionPassive passive: EnchantPotionPack.instance.passiveEffects) {
    		passive.clearPlayers();
    	}

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
        adrenaline = new Adrenaline(this);
        nethershield = new NetherShield(this);
        saturation = new Saturation(this);
        revive = new Revive(this);
        gills = new Gills(this);
        passiveEffects = new PotionPassive[] {
        		jump, energized, fullbright, adrenaline, nethershield, gills, saturation, revive
        };

        EnchantmentAPI.registerCustomEnchantments(
        		/*
        		 * Potion Effect Enchantments
        		 */
        		new Berserking(this),
        		new Blinding(this),
        		new Cursed(this),
        		new Confusion(this),
        		new Fervor(this),
        		new Frost(this),
        		new Magma(this),
        		new HealthBoost(this),
        		new Phantom(this),
        		new Poisoned(this),
        		new Root(this),
        		new Toxic(this),
        		new Wither(this),
        		/*
        		 * Other Enchantments
        		 */
        		new BlackHole(this),
           		new Launch(this),
           		new Life(this),
           		new Lifesteal(this),           		
           		new Lightning(this),
           		new Reflect(this),
           		new ShadowShift(this),
           		new Shockwave(this),
           		new Sniper(this),
           		new TPAYourNutsOff(this),
        		/*
        		 * Passive Potion Enchantments
        		 */
                jump,fullbright,energized,adrenaline,nethershield,saturation, revive
                /*
                 * Other Passive Enchantments
                 */
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