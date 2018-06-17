package us.sunset.gui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;

public class InventoryHandler implements Listener
{
	
	@EventHandler
	public void onClick(InventoryClickEvent e)
	{
		Player p = (Player) e.getWhoClicked();
		
		if (e.getClickedInventory()==null || e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR)
		{
			return;
		}
		
		if (!GUI.isOpen(p))
		{
			return;
		}
		
		GUI invGUI = GUI.getGUI(p);
		Inventory inv = invGUI.getInventory();
		
		if (e.getClickedInventory()==p.getInventory())
		{
			return;
		}
		
		if (!e.getClickedInventory().equals(inv))
		{
			GUI.remove(p);
			return;
		}
		
		e.setCancelled(true);
		
		invGUI.getItem(e.getSlot()).click();
	}
	
	@EventHandler
	public void onClose(InventoryCloseEvent e)
	{
		Player p = (Player) e.getPlayer();
		
		if (!GUI.isOpen(p))
		{
			return;
		}
		
		GUI.remove(p);
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e)
	{
		Player p = (Player) e.getPlayer();
		
		if (!GUI.isOpen(p))
		{
			return;
		}
		
		GUI.remove(p);
	}

}
