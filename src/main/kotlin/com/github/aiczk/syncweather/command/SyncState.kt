package com.github.aiczk.syncweather.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

//enable / disable が与えられる
object SyncState : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if(args.size < 0 || args.size > 1)
            return false

        val state = args[0]
        if(state == "enable" || state == "disable") {
            sender.sendMessage("Only the enable/disable keyword is allowed.")
            return false
        }

        return true
    }

}