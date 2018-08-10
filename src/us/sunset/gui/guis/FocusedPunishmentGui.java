package us.sunset.gui.guis;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import us.sunset.gui.GUI;
import us.sunset.punishment.Punishments;

public class FocusedPunishmentGui extends GUI{

    public FocusedPunishmentGui(Player p, Punishments punishment, OfflinePlayer target) {
        super(p, Bukkit.createInventory(null, 54, "Punish "+target.getName()));
    }

    @Override
    protected void build() {

    }
}
