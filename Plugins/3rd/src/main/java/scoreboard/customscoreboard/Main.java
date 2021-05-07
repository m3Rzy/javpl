package scoreboard.customscoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("==== 3rd plugin is working succesfully! ====");
        getServer().getPluginManager().registerEvents(new ScoreBoard(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
