package maentity.maentity;

import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.loot.Lootable;
import org.bukkit.permissions.Permission;

import java.util.List;

public class MoveEvent implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {

        Player player = e.getPlayer(); //новый объект игрок (любой)
        Permission permName = new Permission("Admin"); //название привелегии
        if (player.hasPermission(permName.getName())) { //условие, если есть админка, то...
            //player.getWorld().spawnEntity(player.getLocation(), EntityType.BEE);*/
            player.getWorld().spawnParticle(Particle.PORTAL, player.getLocation(), 1); //игроку из мира дают партиклы -вид партикла-его локация, то есть около него-число партиклов
            player.setGlowing(true); //подсвечен на карте
            player.setCanPickupItems(false); //не может подбирать вещи
        }
        else {
            player.setGlowing(false);
            player.setCanPickupItems(true);
        }
    }

       /*Entity entity = Bukkit.getWorld("world").spawnEntity(new Location(Bukkit.getWorld("world"), 100, 150, -370 ), EntityType.BAT);
       entity.setGlowing(true);
       entity.setCustomName("DIE");
       entity.setCustomNameVisible(true);*/


    }
