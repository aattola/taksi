package com.jeffe.commands;

import com.jeffe.Taksi;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AsetaKoti implements CommandExecutor {
    private final Taksi plugin;

    public AsetaKoti(Taksi ad) {
        this.plugin = ad;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Location location = player.getLocation();
            this.plugin.getConfig().set("koti." + player.getUniqueId(), location);
            this.plugin.saveConfig();

            player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "[Taksi] " + ChatColor.WHITE + "Asetit kotisi!");

            return true;
        }
        return true;
    }
}
