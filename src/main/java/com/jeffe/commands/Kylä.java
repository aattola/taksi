package com.jeffe.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kylä implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.teleport(new Location(player.getServer().getWorld("world"), 1506, 82, -1830));
            player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "[Taksi] " + ChatColor.WHITE + "Matkustit kylään taksi.ru palvelulla. Pjotr kiittää! Matka maksoi 5 ruplaa + Z lisä eli 2 rublaa");

            return true;
        }
        return true;
    }
}
