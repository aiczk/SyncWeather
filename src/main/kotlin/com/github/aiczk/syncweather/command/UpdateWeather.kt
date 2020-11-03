package com.github.aiczk.syncweather.command

import com.github.aiczk.syncweather.SyncWeather
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

object UpdateWeather : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        getWeatherJson(args)?.let {
            sender.sendMessage(it)

            sender.sendMessage(args[0])
            sender.sendMessage(args[1])
        } ?: sender.sendMessage("Missing arguments.")

        return true;
    }

    //todo: async
    private fun getWeatherJson(args: Array<out String>): String? {

        if(args.size < 2 || args.size > 2)
            return null

        val url = URL("https://jjwd.info/api/v2/stations/search?pref_ja=${args[0]}&address=${args[1]}")
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "GET"

        connection.connect()
        val inputStream = connection.inputStream
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val stringBuilder = StringBuilder()
        bufferedReader.forEachLine { stringBuilder.append(it) }

        bufferedReader.close()
        connection.disconnect()

        return stringBuilder.toString();
    }
}