package com.edouardcourty.edouardsbasics.events.inventories;

import com.edouardcourty.edouardsbasics.inventories.InventoryManager;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class WeatherChoiceInventoryClickHandler implements Listener {
    @EventHandler
    public static void handle(InventoryClickEvent event) {
        if (event.getInventory() == InventoryManager.weatherChoiceInventory) {
            Player player = (Player) event.getWhoClicked();
            World world = player.getWorld();
            InventoryManager.lastInventory = event.getInventory();

            switch (event.getCurrentItem().getType()) {
                case ARROW:
                    player.openInventory(InventoryManager.eventStickInventory);
                    break;
                case TRIDENT:
                    world.setThundering(true);
                    break;
                case WATER_BUCKET:
                    world.setStorm(true);
                    break;
                case SUNFLOWER:
                    world.setThundering(false);
                    world.setStorm(false);
            }

            event.setCancelled(true);
        }
    }
}
