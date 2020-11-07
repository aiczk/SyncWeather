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

        val isKanji = args[0].matches("^[\\u44E0-\\u9FA0]+$".toRegex())
        if(isKanji) sender.sendMessage("jp") else sender.sendMessage("en")

        SyncWeather.instance?.let {
            it.config.set("SyncWeather-Locale", args[0])
            it.config.set("SyncWeather-isKanji", isKanji)
            it.saveConfig()
        }

        return true
    }
}