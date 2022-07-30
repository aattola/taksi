package com.jeffe.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GN implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.isSleeping()) {
                player.getWorld().setTime(1000);
                player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "[GN] " + ChatColor.WHITE + "Hyvää yötä kloppi.");
            } else {
                sender.sendMessage(ChatColor.RED + "Mikä kehitysvamma sinulla on?");
            }
            return true;
        }

        return true;
    }
}
