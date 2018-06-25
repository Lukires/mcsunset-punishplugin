package us.sunset.gui.guis;

import org.bukkit.Bukkit;

import org.bukkit.entity.Player;
import us.sunset.gui.GUI;
import us.sunset.gui.items.HelloWorldItem;
import us.sunset.punishment.Punishment;

public class PunishGUI extends GUI
{

	private Punishment punishment;

	public PunishGUI(Player p, Punishment punishment)
	{
		super(p, Bukkit.createInventory(null, 54, "Punish"));

		this.punishment=punishment;

	}

	@Override
	protected void build()
	{
		addItem(new HelloWorldItem(), 1);

	}

}
