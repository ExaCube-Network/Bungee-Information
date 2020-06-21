package be.exacu.Spigot.Listeners;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;


public class TestCommand extends Command{

    public TestCommand(){
        super("test");
    }

    @Override
    public void execute(CommandSender sender, String[] args){
        if(sender instanceof ProxiedPlayer){
            ProxiedPlayer p = (ProxiedPlayer) sender;
            p.sendMessage(new TextComponent(ChatColor.translateAlternateColorCodes('&', "&7You're gay!")) );
        }
    }

}