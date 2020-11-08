package com.github.aiczk.syncweather.command

import com.github.aiczk.syncweather.SyncWeather
import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object SyncInterval : CommandExecutor {

    private var taskId = -1

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if(args.size < 0)
            return false

        val minute = args[0].toIntOrNull() ?: return false
        val rainingThreshold = args[1].toDoubleOrNull() ?: 1.0
        val thunderingThreshold = args[2].toDoubleOrNull() ?: 5.0

        sender.sendMessage("Minute: $minute Rain: $rainingThreshold Thunder: $thunderingThreshold")

        if(taskId == -1)
            Bukkit.getScheduler().cancelTask(taskId)

        //call
        SyncWeather.instance?.let {
            taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(it, { it.server.dispatchCommand(sender, "updateweather") }, 0, 1200L * minute)
            it.config.set("SyncWeather-RainingThreshold", rainingThreshold)
            it.config.set("SyncWeather-ThunderingThreshold", thunderingThreshold)
            it.saveConfig()
        }

        return true
    }
}