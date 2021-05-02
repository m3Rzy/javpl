package me.hoiboui.ddrops;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Добро пожаловать! Плагин успешно запущен.");
        getServer().getPluginManager().registerEvents(new BreakBlock(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
