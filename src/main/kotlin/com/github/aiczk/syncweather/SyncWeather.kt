package com.github.aiczk.syncweather

import com.github.aiczk.syncweather.command.*
import org.bukkit.plugin.java.JavaPlugin

class SyncWeather : JavaPlugin() {
    companion object {
        var instance: SyncWeather? = null
            private set
    }

    override fun onEnable() {
        getCommand("UpdateWeather")?.setExecutor(UpdateWeather)
        getCommand("SetLocale")?.setExecutor(SetLocale)
        getCommand("SetInterval")?.setExecutor(SetInterval)

        instance = this;
        logger.info("SyncWeather Enabled.");
    }
}