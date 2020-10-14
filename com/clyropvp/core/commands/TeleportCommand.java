package com.clyropvp.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            if (args.length == 0) {
                if (player.hasPermission("core.staff.teleport") || player.isOp()) {
                    player.sendMessage(ChatColor.YELLOW + "Usage: " + ChatColor.DARK_AQUA + "/teleport" + ChatColor.WHITE + " <player>");
                }
                else {
                    player.sendMessage(ChatColor.RED + "No permission.");
                }
            }
            else {
                Player target = Bukkit.getPlayerExact(args[0]);
                if (target instanceof Player) {
                    if (player.hasPermission("core.teleport") || player.isOp()) {
                        player.sendMessage(ChatColor.YELLOW + "You've teleported to " + ChatColor.DARK_AQUA + args[0] + ChatColor.YELLOW + ".");
                       // Bukkit.getServer().broadcast("§7§o[" + player.getName() + "§7§o: §eteleported to " + target.getName() + "§7§o]", "veriscore.op");
                        player.teleport((Entity)target);
                    }
                    else {
                        player.sendMessage(ChatColor.RED + "No permission.");
                    }
                }
                else {
                    player.sendMessage(ChatColor.YELLOW + "No player matching " + ChatColor.DARK_AQUA + args[0] + ChatColor.YELLOW + " found.");
                }
            }
            return false;
        }
        return false;
    }
}
