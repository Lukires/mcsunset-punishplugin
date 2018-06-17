package us.sunset.gui.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import us.sunset.gui.Item;

public class HelloWorldItem extends Item
{
	
	public HelloWorldItem()
	{
		super(new ItemStack(Material.STONE, 1));
	}
	
	@Override
	public void click()
	{
		Bukkit.broadcastMessage("Hello World - Stone Item");
	}

}
