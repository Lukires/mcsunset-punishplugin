package us.sunset.data.confighandling.configs;


import org.bukkit.OfflinePlayer;
import us.sunset.data.confighandling.ConfigManager;
import us.sunset.punishment.Punishment;

import java.util.UUID;

public class PlayerConfig extends ConfigManager {


    public PlayerConfig(OfflinePlayer p) {
        this(p.getUniqueId());
    }

    public PlayerConfig(UUID uuid) {
        super("players", uuid.toString());
    }



}
