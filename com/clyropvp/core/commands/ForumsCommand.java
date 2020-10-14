package com.clyropvp.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ForumsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatColor.GRAY + "-----------------------");
        sender.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Our forums: clyropvpnetwork.enjin.com");
        sender.sendMessage(ChatColor.GRAY + "-----------------------");
        return false;
    }
}
