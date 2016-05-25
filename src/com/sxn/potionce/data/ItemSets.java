package com.sxn.potionce.data;

import org.bukkit.Material;

import com.sxn.util.Util;

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
    
    MELEE ((Material[]) Util.combine(SWORDS.getItems(), AXES.getItems())),

    SBOWS ((Material[]) Util.combine(SWORDS.getItems(), BOWS.getItems())),

    SAXOPHONES ((Material[]) Util.combine(SWORDS.getItems(), AXES.getItems())),

    WEAPONS ((Material[]) Util.combine(SWORDS.getItems(), BOWS.getItems(), AXES.getItems())), 
    
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
	
	ARMOR ((Material[]) Util.combine(HELMETS.getItems(), CHESTPLATES.getItems(), LEGGINGS.getItems(), BOOTS.getItems()));

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
    
}