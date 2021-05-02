package commands4admin.commandsforadmins;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import sun.jvm.hotspot.ui.ObjectHistogramPanel;

public class StartCommand implements Listener {
    @EventHandler
    public void startServerCommand(PlayerJoinEvent e) {
        e.setJoinMessage(e.getPlayer().getName() + "§a зашел плебей!");
        if (e.getPlayer().isOp() || e.getPlayer().hasPermission("plugin.admin")) { // проверка игрока на OP или право                                                                               // "plugin.admin", где plugin -
            // название плагина
            for (Player pp : Bukkit.getOnlinePlayers()) {
                pp.playSound(pp.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 100.0F, 100.0F);
            }

            /*
             * проигрывание звука
             *
             * .getLocation - локация игрока,
             *
             * Sound.UI_TOAST_CHALLENGE_COMPLETE - звук выполненного испытания,
             *
             * 100.0F и 100.0F я честно не помню что значат, вроде тональность и дальность
             * звука.
             *
             * Попробуйте поменять эти два значения.
             */

            e.setJoinMessage("§cАдминистратор §e" + e.getPlayer().getName() + "§c зашел на сервер!");
        }
    }
}
