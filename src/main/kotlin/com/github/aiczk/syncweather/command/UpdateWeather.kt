package com.github.aiczk.syncweather.command

import com.github.aiczk.syncweather.command.json.WeatherInfo
import com.github.aiczk.syncweather.util.HttpAccess
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object UpdateWeather : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        getRawWeatherData(args)?.let {
            rawWeatherDataToJson(it)
        } ?.let {
            val precip1h = it.stations[0].preall.precip_1h
            sender.sendMessage(precip1h.toString())
        } ?: sender.sendMessage("Missing Arguments.")

        return true;
    }

    //todo: async
    private fun getRawWeatherData(args: Array<out String>): String? {

        if(args.size < 0 || args.size > 1)
            return null

        return HttpAccess().getText("https://jjwd.info/api/v2/stations/search?address=${args[0]}")
    }

    private fun rawWeatherDataToJson(rawData: String): WeatherInfo? {
        return Json.decodeFromString<WeatherInfo>(rawData)
    }
}