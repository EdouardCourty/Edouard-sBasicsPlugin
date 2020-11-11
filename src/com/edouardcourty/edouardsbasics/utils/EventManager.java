package com.edouardcourty.edouardsbasics.utils;

import com.edouardcourty.edouardsbasics.events.RightClickWithEventStickHandler;
import com.edouardcourty.edouardsbasics.events.inventories.*;
import org.bukkit.plugin.java.JavaPlugin;

public class EventManager {
    public static void registerAllEvents(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(new RightClickWithEventStickHandler(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new WeatherChoiceInventoryClickHandler(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new EventStickInventoryClickHandler(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new TimeChoiceInventoryClickHandler(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new EffectChoiceInventoryClickHandler(), plugin);
    }
}
