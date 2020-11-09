package com.edouardcourty.edouardsbasics;

import com.edouardcourty.edouardsbasics.commands.RepairCommand;
import com.edouardcourty.edouardsbasics.commands.StartCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class EdouardsBasics extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Edouard's Basics loaded !");

        this.getCommand("startkit").setExecutor(new StartCommand());
        this.getCommand("repair").setExecutor(new RepairCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Edouard's Basics got disabled.");
    }
}
