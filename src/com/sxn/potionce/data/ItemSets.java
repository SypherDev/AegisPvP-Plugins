package com.sxn.potionce.data;

import javax.rmi.CORBA.Util;

import org.bukkit.Material;

/**
 * Various sets of items for using as enchantments' natural items
 */
public enum ItemSets {

    SWORDS (new Material[] {
            Material.WOOD_SWORD,
            Material.STONE_SWORD,
            Material.IRON_SWORD,
            Material.GOLD_SWORD,
            Material.DIAMOND_SWORD }),

    BOWS (new Material[] {
            Material.BOW }),

    AXES (new Material[] {
            Material.WOOD_AXE,
            Material.STONE_AXE,
            Material.IRON_AXE,
            Material.GOLD_AXE,
            Material.DIAMOND_AXE }),
    
    MELEE ((Material[]) combine(SWORDS.getItems(), AXES.getItems())),

    SBOWS ((Material[]) combine(SWORDS.getItems(), BOWS.getItems())),

    BOXES ((Material[]) combine(BOWS.getItems(), AXES.getItems())),

    WEAPONS ((Material[]) combine(SWORDS.getItems(), BOWS.getItems(), AXES.getItems())), 
    
    HELMETS (new Material[] {
            Material.LEATHER_HELMET,
            Material.CHAINMAIL_HELMET,
            Material.IRON_HELMET,
            Material.GOLD_HELMET,
            Material.DIAMOND_HELMET }),

    BOOTS (new Material[] {
            Material.LEATHER_BOOTS,
            Material.CHAINMAIL_BOOTS,
            Material.IRON_BOOTS,
            Material.GOLD_BOOTS,
            Material.DIAMOND_BOOTS }),

    CHESTPLATES (new Material[] {
            Material.LEATHER_CHESTPLATE,
            Material.CHAINMAIL_CHESTPLATE,
            Material.IRON_CHESTPLATE,
            Material.GOLD_CHESTPLATE,
            Material.DIAMOND_CHESTPLATE }),

    LEGGINGS (new Material[] {
            Material.LEATHER_LEGGINGS,
            Material.CHAINMAIL_LEGGINGS,
            Material.IRON_LEGGINGS,
            Material.GOLD_LEGGINGS,
            Material.DIAMOND_LEGGINGS}),
	
	ARMOR ((Material[]) combine(HELMETS.getItems(), CHESTPLATES.getItems(), LEGGINGS.getItems(), BOOTS.getItems()));

    /**
     * Item list
     */
    private Material[] items;

    /**
     * Constructor
     *
     * @param items item list
     */
    ItemSets(Material[] items) {
        this.items = items;
    }

    /**
     * @return item list
     */
    public Material[] getItems() {
        return items;
    }
    
    public static Material[] combine(Material[]... groups) {
    	int arraySize = 0;
    	for (Material[] group: groups) {
    		arraySize += group.length;
    	}
    	Material[] newGroup = new Material[arraySize];
    	int i = 0;
    	for (Material[] group: groups) {
    		for (Material material: group) {
    			newGroup[i++] = material;
    		}
    	}
    	return newGroup;
    }

}