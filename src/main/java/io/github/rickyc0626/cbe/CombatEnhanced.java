package io.github.rickyc0626.cbe;

import io.github.rickyc0626.cbe.command.CommandHandler;
import io.github.rickyc0626.cbe.command.cbe.CombatEnhancedCmd;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CombatEnhanced extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        // Plugin startup logic
        registerCommands();
    }

    private void registerCommands()
    {
        CommandHandler cmdhandler = new CommandHandler();
        cmdhandler.register("cbe", new CombatEnhancedCmd());

        Objects.requireNonNull(getCommand("cbe")).setExecutor(cmdhandler);
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
