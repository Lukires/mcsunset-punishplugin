package us.sunset.gui.guis;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import us.sunset.gui.GUI;
import us.sunset.gui.items.PunishmentItem;
import us.sunset.punishment.Punishments;

public class FocusedPunishmentGui extends GUI{

    private Punishments punishment;

    public FocusedPunishmentGui(Player p, Punishments punishment, OfflinePlayer target) {
        super(p, Bukkit.createInventory(null, 54, "Punish "+target.getName()));
        this.punishment=punishment;
    }

    @Override
    protected void build() {

        setItem(new PunishmentItem(punishment.getSev1()){

            @Override
            public void click(Player p, ClickType click) {
                Bukkit.broadcastMessage("Pretty cool stuff actually!");
            }
        }, 0);
    }
}
