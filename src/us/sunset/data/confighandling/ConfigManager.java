package us.sunset.data.confighandling;


import org.bukkit.configuration.file.FileConfiguration;
import us.sunset.main.Main;

import java.io.File;


public abstract class ConfigManager
{
    private String filepath;
    private String filename;
    private File configFile;
    private Main main = Main.getPlugin(Main.class);

    public ConfigManager(String filepath, String filename)
    {
        this.filepath=filepath;
        this.filename=filename;

        configFile = new File(main.getDataFolder()+filepath, "custom.yml");

        if (!configFile.exists())
        {

        }
    }
}
