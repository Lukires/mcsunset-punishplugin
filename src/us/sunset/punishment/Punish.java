package us.sunset.punishment;

import org.bukkit.entity.Player;

public class Punish 
{
	
	private Player p;
	
	public Punish(Player p)
	{
		this.p=p;
	}

	public void apply(Punishment pun)
	{
		
	}

	public boolean isBanned()
	{
		return false;
	}

	public boolean isMuted() {
		return false;
	}

	public Punishment[] getPunishments()
	{
		return null;
	}

	public Punishment[] getBans()
	{
		return null;
	}

	public Punishment[] getMutes()
	{
		return null;
	}

	public Punishment getLatestBan()
	{
		return null;
	}

}
