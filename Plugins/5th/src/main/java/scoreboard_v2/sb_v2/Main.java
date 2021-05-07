package scoreboard_v2.sb_v2;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public final class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        public static Plugin plugin {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        final Scoreboard board = manager.getNewScoreboard();
        final Objective objective = board.registerNewObjective("Belowname", "dummy");
        @EventHandler }
    }
        public void PlayerJoin(PlayerJoinEvent e) {
            final Player p = e.getPlayer();
            Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
                public void run() {
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    final Scoreboard board = manager.getNewScoreboard();
                    final Objective  objective = board.registerNewObjective("Belowname", "dummy");
                    objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
                    objective.setDisplayName(ChatColor.RED + "YourBelowName");
                }
            },0, 20 * 10);

        }




    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
