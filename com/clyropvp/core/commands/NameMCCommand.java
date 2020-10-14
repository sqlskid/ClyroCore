package com.clyropvp.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class NameMCCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            sender.sendMessage(ChatColor.GRAY + "-----------------------");
            sender.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Our NameMC: namemc.com/server/clyropvp.com");
            sender.sendMessage(ChatColor.GRAY + "-----------------------");
        return false;
    }
}
