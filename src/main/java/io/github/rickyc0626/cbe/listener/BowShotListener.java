package io.github.rickyc0626.cbe.listener;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;

public class BowShotListener implements Listener
{
    @EventHandler
    public void onBowShoot(EntityShootBowEvent event)
    {
        if(event.getEntity() instanceof Player)
        {
            Player p = (Player) event.getEntity();
            Arrow arrow = (Arrow) event.getProjectile();

            arrow.setColor(Color.RED);
        }
    }

    @EventHandler
    public void onArrowImpact(ProjectileHitEvent event)
    {
        if(event.getEntity() instanceof Arrow)
        {
            if(event.getHitEntity() != null || event.getHitBlock() == null) return;
            Arrow arrow = (Arrow) event.getEntity();
            Block block = event.getHitBlock();

            block.getWorld().createExplosion(block.getLocation(), 2, true, true, arrow);
        }
    }
}
