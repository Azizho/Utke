package me.untra.test;

import me.untra.test.Events.Events;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    private static Test instance;

    public static Test getInstance() { return instance; }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new Events(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
