package us.sunset.gui.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import us.sunset.gui.GUIItem;
import us.sunset.punishment.Punishment;

public class PunishmentItem extends GUIItem{
    public PunishmentItem (Punishment punishment)
    {

    }

    @Override
    public void click(Player p, ClickType click) {

    }

    @Override
    public ItemStack getItemStack() {
        return new ItemStack(Material.COBBLESTONE, 1);
    }
}
