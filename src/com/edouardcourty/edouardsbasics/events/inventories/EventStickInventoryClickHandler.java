package com.edouardcourty.edouardsbasics.events.inventories;

import com.edouardcourty.edouardsbasics.inventories.InventoryManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventStickInventoryClickHandler implements Listener {
    @EventHandler
    public static void handle(InventoryClickEvent event) {
        if (event.getInventory() == InventoryManager.eventStickInventory) {
            Player player = (Player) event.getWhoClicked();

            switch (event.getCurrentItem().getType()) {
                case WATER_BUCKET: // Weather management item
                    player.openInventory(InventoryManager.weatherChoiceInventory);
                    break;
                case POTION: // Effect manager item
                    player.openInventory(InventoryManager.effectsInventory);
                    break;
                case ENDER_PEARL: // Teleport item
                    player.openInventory(InventoryManager.tpInventory);
                    break;
                case CLOCK: // Time manager item
                    player.openInventory(InventoryManager.timeInventory);
                    break;
            }

            event.setCancelled(true);
        }
    }
}
