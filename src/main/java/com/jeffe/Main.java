package com.jeffe;

import com.jeffe.commands.GN;
import com.jeffe.commands.Taksitus;
import com.jeffe.commands.Lagaanko;
import com.jeffe.commands.Sadevittuun;
import com.jeffe.events.KuolemaEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.getCommand("taksi").setExecutor(new Taksitus());
        this.getCommand("gn").setExecutor(new GN());
        this.getCommand("sadevittuun").setExecutor(new Sadevittuun());
        this.getCommand("lagaanko").setExecutor(new Lagaanko());
        //this.getCommand("hima").setExecutor(new hima());
        //this.getCommand("vanhahima").setExecutor(new vanhahima());
        this.getServer().getPluginManager().registerEvents(new KuolemaEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
