package us.sunset.gui.items;


import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import us.sunset.gui.GUIItem;
import us.sunset.gui.guis.FocusedPunishmentGui;
import us.sunset.punishment.PunishmentType;
import us.sunset.punishment.Punishments;

public class PunishmentsItem extends GUIItem
{

    private Punishments punishment;
    private OfflinePlayer target;

    public PunishmentsItem(Punishments punishment, OfflinePlayer target)
    {
        this.target=target;
        this.punishment=punishment;

        switch(punishment.getSev2().getPunishmentType())
        {
            case WARNING:
                is=new ItemStack(Material.PAPER, 1);
            case MUTE:
                is=new ItemStack(Material.BOOK, 1);
                break;
            case BAN:
                is=new ItemStack(Material.IRON_SWORD, 1);
                break;
        }



        im=is.getItemMeta();

        //The name() function returns word in all uppercase. We change it so only the first word is uppercase, for the sake of it being
        //Visually appealing.
        im.setDisplayName(punishment.name().charAt(0) + punishment.name().substring(1).toLowerCase());

        is.setItemMeta(im);
    }

    public ItemStack getItemStack()
    {
        return is;
    }

    @Override
    public void click(Player p, ClickType click) {
        if (target==null)
        {
            return;
        }
        new FocusedPunishmentGui(p, this.punishment, this.target);
    }
}
