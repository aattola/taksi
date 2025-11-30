package com.jeffe.commands;

import com.jeffe.Taksi;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Koti implements CommandExecutor {
    private final Plugin plugin;

    public Koti(Taksi plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Location location = (Location) this.plugin.getConfig().get("koti." + player.getUniqueId());
            if (location == null) {
                player.sendMessage(ChatColor.RED + "Sinulla ei ole asetettua kotia! Käytä /asetakoti asettaaksesi kotisi.");
                return true;
            }
            player.teleport(location);
            player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "[Taksi] " + ChatColor.WHITE + "Teleportattu kotiin! :)");

            return true;
        }
        return true;
    }
}
