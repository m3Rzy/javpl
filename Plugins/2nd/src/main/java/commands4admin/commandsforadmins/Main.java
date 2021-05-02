package commands4admin.commandsforadmins;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents((Listener) new StartCommand(), this);
        System.out.println("Commands working!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
