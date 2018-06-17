package us.sunset.punishment;

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
		
	
		
		new PunishGUI().open((Player)sender);
		
		
		return false;
	}
	

}
