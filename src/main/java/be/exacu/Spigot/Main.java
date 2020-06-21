package be.exacu.Spigot;

import be.exacu.Spigot.Listeners.TestCommand;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {

    public void onEnable(){
        getLogger().info("(!) ExaCube Bungee Information Plugin Loaded");
        getProxy().getPluginManager().registerCommand(this, new TestCommand());
    }

    public void onDisable(){
        getLogger().info("(!) ExaCube Bungee Information Plugin Unloaded");
    }

}
