package us.sunset.data.confighandling.configs;

import us.sunset.data.confighandling.ConfigManager;

/*
I actually don't imagine this will be of any use, as I'm thinking about storing the player punishments on themselves.
 */

public class PunishmentsConfig extends ConfigManager {
    public PunishmentsConfig(String key)
    {
        super("punishments", key);
    }
}
