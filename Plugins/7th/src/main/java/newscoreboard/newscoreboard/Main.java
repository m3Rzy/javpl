package newscoreboard.newscoreboard;

import org.bukkit.plugin.java.JavaPlugin;


public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Scoreboard(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
