package us.sunset.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


public abstract class GUIItem
{

	/*

	The GUI calls the getItemStack function, it is therefor important that the ItemStack, is, has been set.

	 */

	protected ItemStack is;
	protected ItemMeta im;
	protected ArrayList<String> lore = new ArrayList<String>();

	public abstract void click(Player p, ClickType click);

	public ItemStack getItemStack()
	{
		return this.is;
	}

	public ItemMeta getItemMeta()
	{
		return this.im;
	}

	public GUI gui;
	
	

}
