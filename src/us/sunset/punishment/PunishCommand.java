package us.sunset.punishment;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import us.sunset.gui.guis.PunishGUI;

public class PunishCommand implements CommandExecutor 
{

	//punish <Player> <Offence:Severity> <Reason>
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		
		if (!sender.hasPermission("sunset.punish"))
		{
			return false;
		}
		
		if (args.length <= 0)
		{
			sender.sendMessage("something something too not enough arguments");
			return false;
		}
		
		String reason = null;
		OfflinePlayer target = Bukkit.getOfflinePlayer(args[0]);
		
		if (target.equals(null))
		{
			sender.sendMessage("player doesn't exist or something like that");
			return false;
		}
		
		if (args.length > 2)
		{
			StringBuilder sb = new StringBuilder();
			for (int i = 2; i < args.length; i++)
			{
				sb.append(args[i]+" ");
			}
			
			reason = sb.toString();
		}
		
		Punishments punishment = Punishments.valueOf(args[0].toUpperCase());
		
		
		
		try
		{
			Punishments.valueOf(args[0].toUpperCase());
		}
		catch(Exception e)
		{
			
		}
		
		
		String os = args[0];
		
		if (args[0].contains(":"))
		{
			String[] osl = args[0].split(":");
			os = osl[0];
		}
		
		try
		{
			Punishments.valueOf(os.toUpperCase());
		}
		catch(Exception e)
		{
			sender.sendMessage("Punishment doesn't exist something something");
		}
		
		
		
		new PunishGUI().open((Player)sender);
		
		
		return false;
	}
	

}
