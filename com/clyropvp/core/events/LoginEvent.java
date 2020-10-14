package com.clyropvp.core.events;

import com.clyropvp.core.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class LoginEvent implements Listener {

    public static Main main;

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
            e.setJoinMessage(null);
    }
    @EventHandler
    public void onLeave(PlayerQuitEvent e){
            e.setQuitMessage(null);
    }
}
