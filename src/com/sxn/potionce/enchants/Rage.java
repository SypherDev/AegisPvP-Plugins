package com.sxn.potionce.enchants;

import java.util.Hashtable;
import java.util.Map;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import com.rit.sucy.CustomEnchantment;
import com.rit.sucy.EnchantmentAPI;
import com.sxn.potionce.ConfigurableEnchantment;
import com.sxn.potionce.data.ConflictGroup;
import com.sxn.potionce.data.EnchantDefaults;
import com.sxn.potionce.data.ItemSets;
import com.sxn.util.Util;

public class Rage extends ConfigurableEnchantment {

    public static final String RAGE_METADATA = "AegisPVP:Enchantment_Rage";
    
    private Hashtable<String, RageRunnable> tasks;
    
	public Rage(Plugin plugin) {
		super(plugin, EnchantDefaults.RAGE, ItemSets.MELEE.getItems(), ConflictGroup.DEFAULT);
		tasks = new Hashtable<>();
	}
	
    /**
     * Begins the effect when the enchantment is equipped
     *
     * @param player player with the enchantment
     * @param level  enchantment level
     */
    @Override
    public void applyEquipEffect(Player player, int level) {
    	RageMetadataValue mdv = new RageMetadataValue(maxStacks(level));
        player.setMetadata(RAGE_METADATA, Util.objectAsValue(plugin, mdv));
        RageRunnable runnable = new RageRunnable(mdv);
        tasks.put(player.getName(), runnable);
        runnable.runTaskTimer(plugin, 0, 10);
    }

    /**
     * Remove the potion when the enchantment is unequipped
     *
     * @param player       player with the enchantment
     * @param enchantLevel enchantment level
     */
    @Override
    public void applyUnequipEffect(Player player, int enchantLevel) {
    	tasks.get(player.getName()).cancel();
    	tasks.remove(player.getName());
    	player.setMetadata(RAGE_METADATA, null);
    }

    /**
     * Checks to see if the player has this enchantment equipped
     *
     * @param player player to check
     */
    public void initializePlayer(Player player) {
        for (ItemStack item : player.getEquipment().getArmorContents()) {
            for (Map.Entry<CustomEnchantment, Integer> entry : EnchantmentAPI.getEnchantments(item).entrySet()) {
                if (entry.getKey().name().equals(name())) {
                    entry.getKey().applyEquipEffect(player, entry.getValue());
                }
            }
        }
    }	
	
    @Override
	public void applyEffect(LivingEntity user, LivingEntity target, int level, EntityDamageByEntityEvent event) {
    	double bonus = 0;
    	Entity entity = event.getEntity();
	    if (entity instanceof Player) {
	    	Player player = (Player) entity;
	    	if (player.hasMetadata(RAGE_METADATA)) {
	    		Object object = player.getMetadata(RAGE_METADATA).get(0).value();
	    		if (object instanceof RageMetadataValue) {
	    			bonus = ((RageMetadataValue) object).stacks * damage(level);
	    		}
	    	}
	    }
		event.setDamage(event.getDamage());
	}
	
    /**
     * When player is damaged, set stacks to 0
     */
    @EventHandler
    public void onHeathChange(EntityDamageEvent event) {
    	Entity entity = event.getEntity();
	    if (entity instanceof Player) {
	    	Player player = (Player) entity;
	    	if (player.hasMetadata(RAGE_METADATA)) {
	    		Object object = player.getMetadata(RAGE_METADATA).get(0).value();
	    		if (object instanceof RageMetadataValue) {
	    			((RageMetadataValue) object).stacks = 0;
	    		}
	    	}
	    }
    }
    
    class RageMetadataValue {
    	
    	private int max, stacks;

    	RageMetadataValue(int max) {
    		this.max = max;
    	}    	

    }
    
    /**
     * Every t seconds, add a stack unless the max has been reached
     */
    class RageRunnable extends BukkitRunnable {
    	
    	RageMetadataValue mdv;
    	
    	RageRunnable(RageMetadataValue mdv) {
    		this.mdv = mdv;
    	}

		@Override
		public void run() {
			if (mdv.stacks < mdv.max) {
				mdv.stacks++;
			}
		}    	

    }
    
}
