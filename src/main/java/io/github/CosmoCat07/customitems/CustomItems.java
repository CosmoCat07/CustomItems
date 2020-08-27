package io.github.CosmoCat07.customitems;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomItems extends JavaPlugin {
	@Override
    public void onEnable() {
        getLogger().info("onEnable has been evoked");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("onDisable has been evoked");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("echo")) { 
    		return true;
    	} 
    	return false; 
    }
}
