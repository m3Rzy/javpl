package commandspawnentitymobs.commandspawnentitymobs;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(command.getName().equals("skeleton")) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.STRIKETHROUGH + "U GONNA DIE");
            player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 100.0F, 100.0F);
            for (int i=0; i<5; i++) {
                Entity entity = player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON);
                entity.setCustomName("SKELETON FROM NETHER");
                entity.setCustomNameVisible(true);
                entity.setGlowing(true);
            }
                //player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 100.0F, 100.0F);
        }
        /*Entity entity = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 100, 150, -370 ), EntityType.BAT);
            entity.setGlowing(true);
            entity.setCustomName("DIE");
            entity.setCustomNameVisible(true);*/
        return true;
    }


}
