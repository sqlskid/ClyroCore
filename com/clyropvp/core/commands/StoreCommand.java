package com.clyropvp.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StoreCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandSender.sendMessage(ChatColor.GRAY + "-----------------------");
        commandSender.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Our store: store.clyropvp.com");
        commandSender.sendMessage(ChatColor.GRAY + "-----------------------");
        return false;
    }
}
