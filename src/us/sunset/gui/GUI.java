package us.sunset.gui;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public abstract class GUI 
{
	
	
	private static HashMap<Player, GUI> inventoryList = new HashMap<Player, GUI>();
	private HashMap<Integer, Item> items = new HashMap<Integer, Item>();
	private Inventory inv;
	
	
	public GUI(Inventory inv)
	{	
		this.inv=inv;
	}
	
	protected abstract void build();
	
	protected void addItem(Item item, int slot)
	{
		
		items.put(slot, item);
		inv.setItem(slot, item.getItemStack());
		
	}
	
	public void open(Player p)
	{
		build();
		p.openInventory(inv);
		inventoryList.put(p, this);
	}
	
	public Item getItem(int slot)
	{
		return items.get(slot);
	}
	
	public static void remove(Player p)
	{
		inventoryList.remove(p);
	}
	
	public static boolean isOpen(Player p)
	{
		return inventoryList.containsKey(p);
	}
	
	public static GUI getGUI(Player p)
	{
		return inventoryList.get(p);
	}
	
	public Inventory getInventory()
	{
		return inv;
	}
	

}
