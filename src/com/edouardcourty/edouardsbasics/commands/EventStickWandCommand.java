package com.edouardcourty.edouardsbasics.commands;

import com.edouardcourty.edouardsbasics.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EventStickWandCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            player.getInventory().addItem(ItemManager.eventStick);
            player.sendMessage("You received the event stick !");
        } else {
            commandSender.sendMessage("Only a player can execute this command.");
        }
        return true;
    }
}
