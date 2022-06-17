package com.jeffe;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hima implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.teleport(new Location(player.getServer().getWorld("world"), -2124, 63, 4568));
            player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "[Taksi] " + ChatColor.WHITE + "Matkustit kotiin taksi.ru palvelulla. Matka maksoi 5 ruplaa");

            return true;
        }
        return true;
    }
}
