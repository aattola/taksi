package com.jeffe;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.print.Paper;

public class CommandKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Mikä kehitysvamma sinulla on?");
                return true;
            }

            if (args[0] == null) {
                sender.sendMessage(ChatColor.RED + "Mikä kehitysvamma sinulla on?");
                return true;
            }

            Player target = player.getServer().getPlayer(args[0]);

            if (target == null) {
                sender.sendMessage(ChatColor.RED + "Mikä kehitysvamma sinulla on?");
                return true;
            }

            Location targetPlayerLocation = target.getLocation();
            player.teleport(targetPlayerLocation);
            player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "[Taksi] " + ChatColor.WHITE + "Sinut on yllättäen taksitettu.");
            target.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "[Taksi] " + ChatColor.WHITE + "Sinuun matkusti taksilla kloppi: " + player.getName());

            return true;
        }
        return true;
    }
}
