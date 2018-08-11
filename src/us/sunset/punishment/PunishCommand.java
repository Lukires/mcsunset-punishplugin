package us.sunset.punishment;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import us.sunset.gui.guis.PunishmentGUI;

public class PunishCommand implements CommandExecutor 
{


	/*The command will be like this:
	/punish <Player> <Offence:Severity> <Reason>
	example: /punish Lukire spam:5 Smells really bad

	<Player> is of the OfflinePlayer object.
	<Offence:Severity> is an enum from Punishments. Severity is the correlating punishment object of the punishments enum.
	<Reason> is just a string

	If no player is given, can't continue.
	If player doesn't exist, can't continue.
	If only a player and nothing else is specified, open PunishmentGui

	If an offence is given, but no severity, open FocusedPunishmentGui
	If an offence and a severity is given, apply the punishment at the spot.

	If no reason is given, don't worry about that. It defaults to the name of the offence.


	I'm not quite sure what to do if no offence is given, but a player and a reason is specified. Could either require reason to be surrounded by
	something like "". Could also just check if the offence is invalid, assume that it's part of the reason.
	Not sure what to do. We could also do two separate commands. It'll be up to you, what do you think is the best to do?

	*/


	/**
	 *
	 * @param sender is the one that executed the command. Can be a player and the console.
	 * @param cmd is the command object.
	 * @param label is the command string. So if the player types /punish <something>, then it'll return "punish"
	 * @param args is the strings following the command. If someone types /punish something something, then it'll return "something something"
	 */
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{



		//Open GUI
		//new PunishmentGUI(punisher, target).open();

		//If applying a punishment directly (like below), don't forget to set the source (.setSource(String)) on the punishment object first.
		//The source is a string, but it should either be a UUID of a player or CONSOLE

		//Punish Player
		//new Punish(player).apply(Punishment);

		return false;
	}
	

}
