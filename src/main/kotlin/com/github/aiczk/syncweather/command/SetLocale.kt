package com.github.aiczk.syncweather.command

import com.github.aiczk.syncweather.SyncWeather
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

//todo: What to do when alphabets and hiragana or kanji are in the same character string.
object SetLocale : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if(args.size < 0 || args.size > 1)
            return false

        val locale = args[0]
        if(!locale.matches("^[a-zA-Z]+\$".toRegex())){
            sender.sendMessage("Error: Only half-width alphabets can be specified for observation stations.")
            return false
        }

        SyncWeather.instance?.let {
            it.config.set("SyncWeather-Locale", args[0])
            it.saveConfig()
            it.server.dispatchCommand(sender, "updateweather")
        }

        sender.sendMessage("Success: Successfully configured. The current observation point is $locale.")
        return true
    }
}