package com.edouardcourty.edouardsbasics.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack eventStick;

    public static void init() {
        createWand();
    }

    private static void createWand() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Event stick");
        List<String> lore = new ArrayList<>();
        lore.add("§7This powerful artifact gives magical powers to his holder !");
        lore.add("§7Right click to open the GUI menu.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        eventStick = item;
    }
}