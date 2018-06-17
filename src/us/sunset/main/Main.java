package us.sunset.main;

import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import us.sunset.gui.InventoryHandler;
import us.sunset.punishment.PunishCommand;

public class Main extends JavaPlugin
{
	public void onEnable()
	{
		Server server = getServer();
		PluginManager pm = server.getPluginManager();
		pm.registerEvents(new InventoryHandler(), this);
		server.getPluginCommand("punish").setExecutor(new PunishCommand());
	}
	
	public void onDisable()
	{
		
	}
}
