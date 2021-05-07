package mobarena.mobarena;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.w3c.dom.Entity;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

      /* if (command.getName().equals("mfp")){
            Player player = (Player) sender;
            player.sendMessage("\n" + ChatColor.GOLD + "The server has remembered your " + ChatColor.GREEN + ChatColor.ITALIC + "first " + ChatColor.GOLD + "point.");
            player.sendMessage(ChatColor.GOLD + "Choose your second point with " + ChatColor.GREEN + ChatColor.ITALIC + "/msp" + ChatColor.GOLD + ".\n");
            /*if (command.getName().equals("msp")){
                //Player player = (Player) sender;
                player.sendMessage(ChatColor.GOLD + "The server has remembered your " + ChatColor.GREEN + ChatColor.ITALIC + "second " + ChatColor.GOLD + "point.\n");
                player.playSound(player.getLocation(), Sound.ENTITY_FISHING_BOBBER_SPLASH, 100.0F, 100.0F);
                player.sendMessage(ChatColor.RED + "You can start fight with " + ChatColor.GREEN + ChatColor.ITALIC + "/mstart" + ChatColor.GOLD + ".\n");
            }
        }*/

        switch(command.getName().toLowerCase()){
            case "mfp":
                Player player = (Player) sender;
                player.sendMessage("\n" + ChatColor.GOLD + "The server has remembered your " + ChatColor.GREEN + ChatColor.ITALIC + "first " + ChatColor.GOLD + "point.");
                break;
            case "msp":
                Player player1 = (Player) sender;
                player1.sendMessage(ChatColor.GOLD + "The server has remembered your " + ChatColor.GREEN + ChatColor.ITALIC + "second " + ChatColor.GOLD + "point.\n");
                break;
        }


        return false;
    }

}
