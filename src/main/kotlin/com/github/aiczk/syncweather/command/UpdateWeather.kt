package com.github.aiczk.syncweather.command

import com.github.aiczk.syncweather.SyncWeather
import com.github.aiczk.syncweather.command.json.WeatherData
import com.github.aiczk.syncweather.util.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object UpdateWeather : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        SyncWeather.instance?.let { it ->
            Bukkit.getScheduler().runTaskAsynchronously(it, Runnable
            {
                val locale = it.config.getString("SyncWeather-Locale")!!
                val isKanji = it.config.getBoolean("SyncWeather-isKanji")

                val queryString = isKanji then "?stn_name_ja=$locale" ?: "?stn_name_en=$locale";
                val rawData = Http.get("https://jjwd.info/api/v2/stations/search$queryString")
                val weatherData: WeatherData? = Json.decodeFromString<WeatherData>(rawData)

                weatherData?.let {
                    val precip = it.stations?.get(0)?.preall?.precip1h
                    sender.sendMessage("$precip")
                    SyncWeather.instance?.server?.worlds?.get(0)?.setStorm(true)
                } ?: sender.sendMessage("""Error: Observatory $locale does not exist.
                                           |Please select the correct station name from the URL below.
                                           |https://www.jma.go.jp/jma/kishou/know/amedas/ame_master.pdf""".trimMargin())
            })
        }

        return true
    }
}