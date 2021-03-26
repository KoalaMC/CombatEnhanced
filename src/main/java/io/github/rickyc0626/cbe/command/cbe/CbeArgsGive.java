package io.github.rickyc0626.cbe.command.cbe;

import io.github.rickyc0626.cbe.command.CommandInterface;
import io.github.rickyc0626.cbe.util.Format;
import io.github.rickyc0626.cbe.util.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CbeArgsGive implements CommandInterface
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(sender.hasPermission("cbe.give") || sender.isOp())
        {
            if(args.length == 3)
            {
                Player p = Bukkit.getPlayerExact(args[1]);
                if(p != null) return giveItem(p, args[2]);
                else sender.sendMessage("That player is not online or does not exist");
                return false;
            }
            sender.sendMessage("Usage: /cbe give <player> <item>");
        }
        return false;
    }

    private boolean giveItem(Player player, String itemName)
    {
        if(itemName.equalsIgnoreCase("arrow:explode"))
        {
            ItemBuilder builder = new ItemBuilder(Material.ARROW);
            ItemStack item = builder
                    .addLoreLine(Format.toColor("&cExplode I"))
                    .addGlow()
                    .build();

            player.getInventory().addItem(item);
            return true;
        }
        return false;
    }
}
