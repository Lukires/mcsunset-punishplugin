package us.sunset.gui.guis;

import org.bukkit.Bukkit;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import us.sunset.gui.GUI;
import us.sunset.gui.items.PunishmentsItem;
import us.sunset.punishment.Punishments;

public class PunishmentGUI extends GUI
{

	private OfflinePlayer target;
	public PunishmentGUI(Player punisher, OfflinePlayer target) {
		super(punisher, Bukkit.createInventory(null, 54, "Punish "+target.getName()));
		this.target=target;
}

	@Override
	protected void build()
	{

		for (int i = 0; i < Punishments.values().length; i++)
		{
			setItem(new PunishmentsItem(Punishments.values()[i]){
				@Override
				public void click(Player p, ClickType click) {
					new FocusedPunishmentGui(p, getPunishments(), target).open();
				}
			}, i+27);
		}
	}
	
	

}
