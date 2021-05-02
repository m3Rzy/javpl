package healthbar.hpbar;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public final class Main extends JavaPlugin implements Listener {

    private Scoreboard s;

    @Override
    public void onEnable() {
        // Plugin startup logic
        s = Bukkit.getScoreboardManager().getMainScoreboard();
        registerHealthBar();
        registerNameTag();
        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        s.getTeam("blue").addPlayer(e.getPlayer());
    }

    public void registerHealthBar() {
        if ( s.getObjective("health") != null) {
            s.getObjective("health").unregister();
        }
        Objective o = s.registerNewObjective("health", "health");
        o.setDisplayName(ChatColor.GOLD + "❤");
        o.setDisplaySlot(DisplaySlot.BELOW_NAME);
    }

    public void registerNameTag(){
        if (s.getTeam("blue") != null) {
            s.getTeam("blue").unregister();
        }
        Team t = s.registerNewTeam("blue");
        t.setPrefix(ChatColor.BLUE + "");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
