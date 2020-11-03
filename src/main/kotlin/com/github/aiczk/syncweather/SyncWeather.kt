package com.github.aiczk.syncweather

import org.bukkit.plugin.java.JavaPlugin
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

class SyncWeather : JavaPlugin()
{
    override fun onEnable() {
        logger.info("Enabled");
    }

    override fun onDisable() {
        logger.info("Disabled");
    }
}