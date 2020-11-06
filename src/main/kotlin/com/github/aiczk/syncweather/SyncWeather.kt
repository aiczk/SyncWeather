package com.github.aiczk.syncweather

import com.github.aiczk.syncweather.command.UpdateWeather
import org.bukkit.plugin.java.JavaPlugin
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

class SyncWeather : JavaPlugin() {
    companion object {
        var instance: SyncWeather? = null
            private set;
    }

    override fun onEnable() {
        getCommand("updateWeather")?.setExecutor(UpdateWeather)

        instance = this;
        logger.info("SyncWeather Enabled.");
    }

    override fun onDisable() {
        logger.info("Disabled");
    }
}