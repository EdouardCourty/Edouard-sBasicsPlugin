package com.edouardcourty.edouardsbasics.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

public class RepairCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            ItemStack itemToBeRepaired = player.getInventory().getItemInMainHand();

            if (itemToBeRepaired.getType().equals(Material.AIR)) {
                player.sendMessage("You are not holding an item.");
                return true;
            }

            Damageable itemToBeRepairedMeta = (Damageable) itemToBeRepaired.getItemMeta();

            if (!itemToBeRepairedMeta.hasDamage()) {
                player.sendMessage("Your item is not broken.");
                return true;
            }

            itemToBeRepairedMeta.setDamage(0);
            itemToBeRepaired.setItemMeta((ItemMeta) itemToBeRepairedMeta);

            player.getInventory().setItemInMainHand(itemToBeRepaired);

            String itemName = "";

            if (((ItemMeta) itemToBeRepairedMeta).hasDisplayName()) {
                itemName = itemToBeRepaired.getItemMeta().getDisplayName();
            } else {
                itemName = itemToBeRepaired.getType().name().toLowerCase().replace("_", " ");
                itemName = itemName.substring(0, 1).toUpperCase() + itemName.substring(1);
            }

            player.getServer().getConsoleSender().sendMessage(String.format("Player %s used the repair command !", player.getName()));
            player.sendMessage(String.format("You repaired your %s!", itemName));
        }
        return true;
    }
}
