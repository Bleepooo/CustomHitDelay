package dev.bleepo.customhitdelay.events;

import dev.bleepo.customhitdelay.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class OnJoin implements Listener {
    private final Main plugin;

    public OnJoin(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e) {
        Player player = (Player) e.getEntity();
        if (e.getEntity() instanceof Player) {
            player.setMaximumNoDamageTicks(plugin.getConfig().getInt("maxticks"));
        } else {
            player.setMaximumNoDamageTicks(plugin.getConfig().getInt("defaultticks"));
        }
    }


}

