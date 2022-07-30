package com.jeffe.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Lagaanko implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Integer intti = player.getPing();
            @NotNull double[] tps = player.getServer().getTPS();

            player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "[lagaanko?] " + ChatColor.WHITE + "TPS (alempi kuin 19 on huono) " + tps[0] + " pingi " + intti);


            return true;
        }

        return true;
    }
}
