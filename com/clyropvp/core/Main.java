package com.clyropvp.core;

import com.clyropvp.core.commands.*;
import com.clyropvp.core.events.LoginEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    public static String prefix = ChatColor.AQUA + "[ClyroCore]";
    public static String info_prefix = ChatColor.DARK_AQUA + "" + ChatColor.BOLD  + "(!)" + ChatColor.RESET;
    
    public void onEnable(){
        initCommands();
        initEvents();


        //last message
        getServer().getConsoleSender().sendMessage(prefix + " Sucessfully loaded!");
    }

    public void onDisable(){

    }

    private void initCommands(){
        getServer().getConsoleSender().sendMessage(prefix + " Loading commands...");

        this.getCommand("namemc").setExecutor((CommandExecutor)new NameMCCommand());
        this.getCommand("store").setExecutor((CommandExecutor)new StoreCommand());
        this.getCommand("forums").setExecutor((CommandExecutor)new ForumsCommand());
        this.getCommand("gamemode").setExecutor((CommandExecutor)new GamemodeCommand());
        this.getCommand("teleport").setExecutor((CommandExecutor)new TeleportCommand());
    }

    private void initEvents(){
        getServer().getConsoleSender().sendMessage(prefix + " Loading events...");

        getServer().getPluginManager().registerEvents(new LoginEvent(), this);
    }
}
