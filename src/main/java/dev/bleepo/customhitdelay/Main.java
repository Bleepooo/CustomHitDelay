package dev.bleepo.customhitdelay;

import dev.bleepo.customhitdelay.events.OnJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new OnJoin(this), this);
        getLogger().info("CustomHitDelay by Bleepo is loaded");
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("bai");
    }
}
