package com.github.aiczk.syncweather.command

import com.github.aiczk.syncweather.command.json.WeatherInfo
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLClassLoader


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

        val url = URL("https://jjwd.info/api/v2/stations/search?address=${args[0]}")
        val loader = URLClassLoader(arrayOf(url))
        val connection = loader.urLs[0].openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        connection.connect()

        val bufferedReader = BufferedReader(InputStreamReader(connection.inputStream))
        val stringBuilder = StringBuilder()
        bufferedReader.forEachLine { stringBuilder.append(it) }

        bufferedReader.close()
        connection.disconnect()

        return stringBuilder.toString()
    }

    private fun rawWeatherDataToJson(rawData: String): WeatherInfo? {
        return Json.decodeFromString<WeatherInfo>(rawData)
    }
}