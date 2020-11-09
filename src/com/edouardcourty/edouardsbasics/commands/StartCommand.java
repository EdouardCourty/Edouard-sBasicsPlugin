package com.edouardcourty.edouardsbasics.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class StartCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            ItemStack ironHelmet = new ItemStack(Material.IRON_HELMET);
            ItemStack ironBoots = new ItemStack(Material.IRON_BOOTS);
            ItemStack ironChestplate = new ItemStack(Material.IRON_CHESTPLATE);
            ItemStack ironLeggings = new ItemStack(Material.IRON_LEGGINGS);

            ItemStack ironSword = new ItemStack(Material.IRON_SWORD);
            ItemStack ironPickaxe = new ItemStack(Material.IRON_PICKAXE);

            ItemStack cookedPorkchops = new ItemStack(Material.COOKED_PORKCHOP, 20);

            player.getInventory().addItem(
                    ironSword,
                    ironPickaxe,
                    ironHelmet,
                    ironChestplate,
                    ironLeggings,
                    ironBoots,
                    cookedPorkchops
            );

            player.getServer().getConsoleSender().sendMessage(String.format("Player %s received the starter kit !", player.getName()));
            player.sendMessage("You received the starter kit !");
        }
        return true;
    }
}
