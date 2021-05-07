package scoreboard.customscoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.*;


public class ScoreBoard implements Listener {

    @EventHandler
    public void createBoard(Player player) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();
            Objective obj = board.registerNewObjective("Stats", "1#", ChatColor.GREEN + "<< Your stats >>");
            obj.setDisplaySlot(DisplaySlot.SIDEBAR);

            Score score = obj.getScore(ChatColor.WHITE + "Count kills: " + ChatColor.AQUA + player.getStatistic(Statistic.MOB_KILLS));
            score.setScore(1);

            Score score1 = obj.getScore(ChatColor.WHITE + "Exp: " + ChatColor.GOLD + player.getTotalExperience());
            score1.setScore(2);

            player.setScoreboard(board);

    }
}
