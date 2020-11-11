package com.edouardcourty.edouardsbasics.events.inventories;

import com.edouardcourty.edouardsbasics.effects.EffectsManager;
import com.edouardcourty.edouardsbasics.inventories.InventoryManager;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EffectChoiceInventoryClickHandler implements Listener {
    @EventHandler
    public static void handle(InventoryClickEvent event) {
        if (event.getInventory() == InventoryManager.effectsInventory) {
            Player player = (Player) event.getWhoClicked();
            Server server = player.getServer();

            switch (event.getCurrentItem().getType()) {
                case ARROW:
                    player.openInventory(InventoryManager.eventStickInventory);
                    break;
                case CARROT: // Feed everyone
                    for (Player p : player.getServer().getOnlinePlayers()) {
                        EffectsManager.saturation.apply(p);
                    }
                    break;
                case GLOWSTONE_DUST: // Make everyone glow
                    for (Player p : player.getServer().getOnlinePlayers()) {
                        EffectsManager.glowing.apply(p);
                    }
                    break;
                case GLISTERING_MELON_SLICE: // Heal everyone
                    for (Player p : player.getServer().getOnlinePlayers()) {
                        EffectsManager.healing.apply(p);
                    }
            }

            event.setCancelled(true);
        }
    }
}
