package anti.vanish;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiVanish extends JavaPlugin implements Listener{
	
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void PlayerInteractEvent(PlayerInteractEvent e){
		if(e.getItem().getDurability()==8238) e.setCancelled(true);
		e.getPlayer().sendMessage("測試");
	}

}
