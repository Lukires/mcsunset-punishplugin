package us.sunset.gui;

import org.bukkit.inventory.ItemStack;


public abstract class Item 
{
	
	private ItemStack is;
	
	public Item(ItemStack is)
	{
		this.is=is;
	}
	
	public ItemStack getItemStack()
	{
		return is;
	}
	
	public abstract void click();
	
	

}
