package com.clyropvp.core.commands;

import com.clyropvp.core.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("Only players can use this command!");
        }

        Player p = (Player) commandSender;

        if(commandSender.hasPermission("core.staff.gamemode")) {
            if (strings.length != 1) {
                commandSender.sendMessage(ChatColor.RED + "/gamemode <type>");
            }
            if (strings[0].equalsIgnoreCase("1") || strings[0].equalsIgnoreCase("c") || strings[0].equalsIgnoreCase("creative")) {
                p.setGameMode(GameMode.CREATIVE);
                commandSender.sendMessage(ChatColor.AQUA + "Your gamemode has been changed to creative.");
                for (Player ps : Bukkit.getServer().getOnlinePlayers()) {
                    if (ps.hasPermission("core.staff.info") && ps.getName() != commandSender.getName()) {
                        ps.sendMessage(Main.info_prefix + " " + commandSender.getName() + " changed his gamemode to creative.");
                    }
                }
            } else if (strings[0].equalsIgnoreCase("0") || strings[0].equalsIgnoreCase("s") || strings[0].equalsIgnoreCase("survival")) {
                p.setGameMode(GameMode.SURVIVAL);
                commandSender.sendMessage(ChatColor.AQUA + "Your gamemode has been changed to survival.");
                for (Player ps : Bukkit.getServer().getOnlinePlayers()) {
                    if (ps.hasPermission("core.staff.info") && ps.getName() != commandSender.getName()) {
                        ps.sendMessage(Main.info_prefix + " " + commandSender.getName() + " changed his gamemode to survival.");
                    }
                }
            } else if (strings[0].equalsIgnoreCase("2") || strings[0].equalsIgnoreCase("a") || strings[0].equalsIgnoreCase("adventure")) {
                p.setGameMode(GameMode.ADVENTURE);
                commandSender.sendMessage(ChatColor.AQUA + "Your gamemode has been changed to adventure.");
                for (Player ps : Bukkit.getServer().getOnlinePlayers()) {
                    if (ps.hasPermission("core.staff.info") && ps.getName() != commandSender.getName()) {
                        ps.sendMessage(Main.info_prefix + " " + commandSender.getName() + " changed his gamemode to adventure.");
                    }
                }
            }
            else{
                commandSender.sendMessage(ChatColor.RED + "Not a valid gamemode!");
            }
        }
            else
            {
             commandSender.sendMessage(ChatColor.RED + "No permission.");
            }

        return false;
    }
}
