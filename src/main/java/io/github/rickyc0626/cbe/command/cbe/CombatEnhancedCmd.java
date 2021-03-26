package io.github.rickyc0626.cbe.command.cbe;

import io.github.rickyc0626.cbe.command.CommandInterface;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CombatEnhancedCmd implements CommandInterface
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(sender.hasPermission("cbe.main") || sender.isOp())
        {
            sender.sendMessage("Combat Enhanced");
            return true;
        }
        return false;
    }
}
