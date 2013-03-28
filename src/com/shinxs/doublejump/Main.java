package com.shinxs.doublejump;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.shinxs.doublejump.listeners.DoubleJump;

public class Main extends JavaPlugin {

	public Main plugin;
	public Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		logMessage("Enabled");
		getConfig().options().copyDefaults(true);
		saveConfig();
		
		new DoubleJump(this);
	}
	
	public void onDisable() {
		logMessage("Disabled");
	}
	
	public void logMessage(String msg) {
		PluginDescriptionFile pdf = this.getDescription();
		this.log.info("[" + pdf.getName() + " V" + pdf.getVersion() + "] " + msg);
	}
}