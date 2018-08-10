package us.sunset.punishment;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import us.sunset.data.confighandling.configs.PlayerConfig;


/**
 * Created by Lukas on 8/8/2018.
 */
public class PreventPlayerJoinListener implements Listener{


    @EventHandler
    public void onJoin(PlayerJoinEvent e)
    {
        Player p = e.getPlayer();

        PlayerConfig config = new PlayerConfig(p);
        config.set("name", p.getName());
        config.save();


    }
}
