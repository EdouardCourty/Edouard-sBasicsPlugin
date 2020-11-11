package com.edouardcourty.edouardsbasics;

import com.edouardcourty.edouardsbasics.commands.EventStickWandCommand;
import com.edouardcourty.edouardsbasics.commands.RepairCommand;
import com.edouardcourty.edouardsbasics.commands.StartCommand;
import com.edouardcourty.edouardsbasics.effects.EffectsManager;
import com.edouardcourty.edouardsbasics.utils.EventManager;
import com.edouardcourty.edouardsbasics.inventories.InventoryManager;
import com.edouardcourty.edouardsbasics.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class EdouardsBasics extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Edouard's Basics loaded !");
        // Initialisation
        ItemManager.init();
        InventoryManager.init();
        EffectsManager.init();
        EventManager.registerAllEvents(this);
        // Registering the command handlers
        this.getCommand("startkit").setExecutor(new StartCommand());
        this.getCommand("repair").setExecutor(new RepairCommand());
        this.getCommand("eventstick").setExecutor(new EventStickWandCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Edouard's Basics got disabled.");
    }
}
