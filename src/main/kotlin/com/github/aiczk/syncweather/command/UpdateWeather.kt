package com.github.aiczk.syncweather.command

import com.github.aiczk.syncweather.SyncWeather
import com.github.aiczk.syncweather.command.json.WeatherData
import com.github.aiczk.syncweather.util.Http
import com.github.aiczk.syncweather.util.then
import kotlinx.coroutines.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object UpdateWeather : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        var isStorm = false
        var isThundering = false
        SyncWeather.instance?.let { it ->
            GlobalScope.launch {
                val locale = it.config.getString("SyncWeather-Locale")!!
                val rain = it.config.getDouble("SyncWeather-RainingThreshold")
                val thunder = it.config.getDouble("SyncWeather-ThunderingThreshold")
                withContext(Dispatchers.Default) {
                    val rawData = Http.get("https://jjwd.info/api/v2/stations/search?stn_name_en=$locale")
                    val weatherJson: Result<WeatherData> = runCatching { Json.decodeFromString(rawData) }
                    weatherJson.getOrNull()
                }?.let {
                    val precip = it.stations?.getOrNull(0)?.preall?.precip1hDailyMax!!
                    sender.sendMessage((precip > 0.0) then "The amount of rainfall in $locale is ${precip}mm now." ?: "It is not raining in $locale now.")
                    isStorm = precip >= rain
                    isThundering = precip >= thunder
                } ?: sender.sendMessage("""Observatory $locale does not exist.
                                           |Please select the correct station name from the URL below.
                                           |https://www.jma.go.jp/jma/kishou/know/amedas/ame_master.pdf""".trimMargin())

                Bukkit.getScheduler().runTask(it, Runnable {
                    it.server.worlds[0].setStorm(isStorm)
                    it.server.worlds[0].isThundering = isThundering
                })
            }
        }
        return true
    }
}