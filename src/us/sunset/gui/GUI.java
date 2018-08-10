package us.sunset.gui;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public abstract class GUI 
{
	
	
	private static HashMap<Player, GUI> inventoryList = new HashMap<Player, GUI>();
	private HashMap<Integer, GUIItem> items = new HashMap<Integer, GUIItem>();
	private Inventory inv;
	private Player p;
	
	public GUI(Player p, Inventory inv)
	{	
		this.p=p;
		this.inv=inv;
	}
	
	protected abstract void build();
	
	protected void setItem(GUIItem item, int slot)
	{
		
		items.put(slot, item);
		inv.setItem(slot, item.getItemStack());
		
	}
	
	public void open()
	{
		build();
		p.openInventory(inv);
		inventoryList.put(p, this);
	}
	
	public GUIItem getItem(int slot)
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

	public Player getPlayer(){ return p; }
	

}
