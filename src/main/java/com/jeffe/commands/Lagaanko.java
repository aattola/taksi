package com.jeffe.commands;

import com.jeffe.Taksi;
import net.kyori.adventure.Adventure;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
//import org.jetbrains.annotations.NotNull;

public class Lagaanko implements CommandExecutor {
    private final Taksi plugin;
    public Lagaanko (Taksi ad) {
        this.plugin = ad;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Integer intti = player.getPing();
            // @NotNull double[] tps = player.getServer().getTPS();

            TextComponent teksti = Component.text("Teksti josta voi näpäyttää").color(NamedTextColor.GREEN)
                    .clickEvent(ClickEvent.clickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/me orava"))
                    .hoverEvent(HoverEvent.hoverEvent(HoverEvent.Action.SHOW_TEXT, Component.text("Teksti joka näkyy kun hiiri on tekstin päällä").color(NamedTextColor.RED)));

            // serialize teksti and send it to player

            this.plugin.adventure().player(player).sendMessage(teksti);

            player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[lagaanko?] " + ChatColor.WHITE + "meni rikki tämä tps hommeli niin en jaksanut korjaa. Pitää odottaa papermc versio 1.20. sit toimii taas.");

            return true;

            //player.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "[lagaanko?] " + ChatColor.WHITE + "TPS (alempi kuin 19 on huono) " + tps[0] + " pingi " + intti);
        }

        return true;
    }
}
