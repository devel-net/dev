package helper.jsoncmd;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class MyListenner implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

    }
    @EventHandler
    public void helloworld(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        Location coords = player.getPlayer().getLocation();
        coords.setZ(256);
    }
}
