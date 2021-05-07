package newscoreboard.newscoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;


public class Scoreboard implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard board = manager.getNewScoreboard();
        Objective obj = board.registerNewObjective("Stats", "dummy", ChatColor.GOLD + "STATISTICS");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score score = obj.getScore(ChatColor.WHITE + "Count kills: " + ChatColor.GREEN + player.getStatistic(Statistic.MOB_KILLS));
        score.setScore(0);

        player.setScoreboard(board);
    }

}
