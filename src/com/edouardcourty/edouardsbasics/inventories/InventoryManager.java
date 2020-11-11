package com.edouardcourty.edouardsbasics.inventories;

import com.edouardcourty.edouardsbasics.items.EnchantedItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryManager {

    public static Inventory eventStickInventory;
    public static Inventory timeInventory;
    public static Inventory weatherChoiceInventory;
    public static Inventory effectsInventory;
    public static Inventory tpInventory;

    private static final ItemStack goBackItem = EnchantedItem.fromMaterial(Material.ARROW, "Go Back");

    public static void init() {
        createEventStickInventory();
        createWeatherChoiceInventory();
        createEffectsInventory();
        createTimeInventory();
        createTpInventory();
    }

    private static void createEventStickInventory() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Event stick menu");

        // Menu Items
        ItemStack weatherSwitch = EnchantedItem.fromMaterial(Material.WATER_BUCKET, "Manage Weather");
        ItemStack effectSwitch = EnchantedItem.fromMaterial(Material.POTION, "Manage effects");
        ItemStack tpSwitch = EnchantedItem.fromMaterial(Material.ENDER_PEARL, "TP Players");
        ItemStack timeSwitch = EnchantedItem.fromMaterial(Material.CLOCK, "Manage time");
        ItemStack scoreBoardItem = EnchantedItem.fromMaterial(Material.OAK_SIGN, "Manage Scoreboards");

        inventory.setItem(2, weatherSwitch);
        inventory.setItem(3, effectSwitch);
        inventory.setItem(4, timeSwitch);
        inventory.setItem(5, tpSwitch);
        inventory.setItem(6, scoreBoardItem);

        eventStickInventory = inventory;
    }

    private static void createWeatherChoiceInventory() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Change the weather");

        // Menu items
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

        // Menu items
        ItemStack feedItem = EnchantedItem.fromMaterial(Material.CARROT, "Feed everyone");
        ItemStack healingItem = EnchantedItem.fromMaterial(Material.GLISTERING_MELON_SLICE, "Heal everyone");
        ItemStack glowItem = EnchantedItem.fromMaterial(Material.GLOWSTONE_DUST, "Make everyone glows");

        inventory.setItem(0, goBackItem);
        inventory.setItem(4, feedItem);
        inventory.setItem(5, healingItem);
        inventory.setItem(6, glowItem);

        effectsInventory = inventory;
    }

    private static void createTimeInventory() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Change the time");

        // Menu items
        ItemStack morningItem = EnchantedItem.fromMaterial(Material.ORANGE_CONCRETE, "Morning");
        ItemStack noonItem = EnchantedItem.fromMaterial(Material.YELLOW_CONCRETE, "Noon");
        ItemStack eveningItem = EnchantedItem.fromMaterial(Material.RED_CONCRETE, "Evening");
        ItemStack startOfTheNightItem = EnchantedItem.fromMaterial(Material.BLUE_CONCRETE, "Beggining of the night");
        ItemStack endOfTheNightItem = EnchantedItem.fromMaterial(Material.BLACK_CONCRETE, "End of the night");

        inventory.setItem(0, goBackItem);
        inventory.setItem(2, morningItem);
        inventory.setItem(3, noonItem);
        inventory.setItem(4, eveningItem);
        inventory.setItem(5, startOfTheNightItem);
        inventory.setItem(6, endOfTheNightItem);

        timeInventory = inventory;
    }

    public static void createTpInventory() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Teleportation");

        // Menu items
        ItemStack tpEveryoneToMeItem = EnchantedItem.fromMaterial(Material.PLAYER_HEAD, "Teleport everyone to me");
        ItemStack tpEveryoneToWorldSpawnItem = EnchantedItem.fromMaterial(Material.SKELETON_SKULL, "Teleport everyone to the spawn");

        inventory.setItem(0, goBackItem);
        inventory.setItem(4, tpEveryoneToMeItem);
        inventory.setItem(5, tpEveryoneToWorldSpawnItem);

        tpInventory = inventory;
    }
}
