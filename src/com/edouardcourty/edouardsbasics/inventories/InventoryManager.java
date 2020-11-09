package com.edouardcourty.edouardsbasics.inventories;

import com.edouardcourty.edouardsbasics.items.EnchantedItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryManager {

    public static Inventory eventStickInventory;
    public static Inventory weatherChoiceInventory;
    public static Inventory effectsInventory;
    public static Inventory lastInventory;

    public static void init() {
        createEventStickInventory();
        createWeatherChoiceInventory();
        createEffectsInventory();
    }

    private static void createEventStickInventory() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Event stick menu");

        // Air (Blank) Item
        ItemStack air = new ItemStack(Material.AIR);
        // Menu Items
        ItemStack dayNightSwitch = EnchantedItem.fromMaterial(Material.CLOCK, "Manage Weather");
        ItemStack effectSwitch = EnchantedItem.fromMaterial(Material.POTION, "Manage effects");
        ItemStack tpSwitch = EnchantedItem.fromMaterial(Material.ENDER_PEARL, "TP Players");

        inventory.addItem(air, air ,air, dayNightSwitch, effectSwitch, tpSwitch, air, air, air);
        eventStickInventory = inventory;
    }

    private static void createWeatherChoiceInventory() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Change the weather");

        // Air (Blank) Item
        ItemStack air = new ItemStack(Material.AIR);
        // Menu items
        ItemStack goBackItem = EnchantedItem.fromMaterial(Material.ARROW, "Go Back");
        ItemStack thunderItem = EnchantedItem.fromMaterial(Material.TRIDENT, "Thunder");
        ItemStack rainItem = EnchantedItem.fromMaterial(Material.WATER_BUCKET, "Rain");
        ItemStack clearItem = EnchantedItem.fromMaterial(Material.SUNFLOWER, "Sun");

        inventory.setItem(0, goBackItem);
        inventory.setItem(3, thunderItem);
        inventory.setItem(4, rainItem);
        inventory.setItem(5, clearItem);
        weatherChoiceInventory = inventory;
    }

    private static void createEffectsInventory() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Apply effects");

        // Air (Blank) Item
        ItemStack air = new ItemStack(Material.AIR);
        // Menu items
        ItemStack goBackItem = EnchantedItem.fromMaterial(Material.ARROW, "Go Back");
        ItemStack feedItem = EnchantedItem.fromMaterial(Material.CARROT, "Feed everyone");
        ItemStack glowItem = EnchantedItem.fromMaterial(Material.GLOWSTONE_DUST, "Make everyone glows");

        inventory.addItem(goBackItem, air, air, air, feedItem, glowItem, air, air, air);
        effectsInventory = inventory;
    }
}
