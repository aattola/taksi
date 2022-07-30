package com.jeffe.commands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sadevittuun implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            World world = player.getWorld();

            world.setTime(1);
            world.setClearWeatherDuration(10000);
            String viesti = ChatColor.BLUE + "" + ChatColor.BOLD + "[sadepois äkkiä] " + ChatColor.WHITE + "ukko " + player.getName() + " laitto sateen pois ja päivän";
            world.getPlayers().forEach(pl -> pl.sendMessage(viesti));

            return true;
        }

        return true;
    }
}
