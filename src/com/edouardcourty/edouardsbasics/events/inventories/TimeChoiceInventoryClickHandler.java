package com.edouardcourty.edouardsbasics.events.inventories;

import com.edouardcourty.edouardsbasics.inventories.InventoryManager;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class TimeChoiceInventoryClickHandler implements Listener {
    @EventHandler
    public static void handle(InventoryClickEvent event) {
        if (event.getInventory() == InventoryManager.timeInventory) {
            Player player = (Player) event.getWhoClicked();
            World world = player.getWorld();

            switch (event.getCurrentItem().getType()) {
                case ARROW:
                    player.openInventory(InventoryManager.eventStickInventory);
                    break;
                case ORANGE_CONCRETE:
                    world.setTime(23500);
                    break;
                case YELLOW_CONCRETE:
                    world.setTime(6000);
                    break;
                case RED_CONCRETE:
                    world.setTime(11700);
                    break;
                case BLUE_CONCRETE:
                    world.setTime(12575);
                    break;
                case BLACK_CONCRETE:
                    world.setTime(14000);
                    break;
            }

            event.setCancelled(true);
        }
    }
}
