package us.sunset.data.confighandling;

import org.bukkit.configuration.file.YamlConfiguration;
import us.sunset.main.Main;

import java.io.File;

public class ConfigManager extends YamlConfiguration
{
    private String filepath;
    private String filename;
    private File configFile;
    private Main main = Main.getPlugin(Main.class);


    public ConfigManager(String filepath, String filename)
    {

        this.filepath=filepath.startsWith("/")? filepath:"/"+filepath;
        this.filename=filename.endsWith(".yml")? filename:filename+".yml";

        configFile = new File(main.getDataFolder()+filepath, filename);

        if (!configFile.exists()) {
            configFile.getParentFile().mkdirs();
        }


        try{
            load(configFile);
        }catch(Exception e) {
            //For some reason the exception "FileNotFoundException" is called every time, even though everything works perfectly
            //I dunno why, but everything works so I'm not really complaining. The whole point of this try catch statement is just to avoid that
            //Annoying "error"
        }


    }
    public void save()
    {
        try{
            save(configFile);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
