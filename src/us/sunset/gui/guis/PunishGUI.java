package us.sunset.gui.guis;

import org.bukkit.Bukkit;

import us.sunset.gui.GUI;
import us.sunset.gui.items.HelloWorldItem;

public class PunishGUI extends GUI 
{
	
	public PunishGUI()
	{
		super(Bukkit.createInventory(null, 54, "Punish"));
	}

	@Override
	protected void build() 
	{
		addItem(new HelloWorldItem(), 1);
		
	}

}
