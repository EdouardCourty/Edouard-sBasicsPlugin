package com.edouardcourty.edouardsbasics.events;

import com.edouardcourty.edouardsbasics.inventories.InventoryManager;
import com.edouardcourty.edouardsbasics.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class RightClickWithEventStickHandler implements Listener {
    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (Objects.equals(event.getItem().getItemMeta(), ItemManager.eventStick.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.openInventory(InventoryManager.eventStickInventory);
                }
            }
        }
    }
}
