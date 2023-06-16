package com.jeffe;

import com.jeffe.commands.*;
import com.jeffe.events.KuolemaEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Taksi extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic

        this.getCommand("taksi").setExecutor(new Taksitus());
        this.getCommand("gn").setExecutor(new GN());
        this.getCommand("sadevittuun").setExecutor(new Sadevittuun());
        this.getCommand("lagaanko").setExecutor(new Lagaanko(this));
        this.getCommand("hima").setExecutor(new Hima());
        this.getCommand("kylä").setExecutor(new Kylä());
        //this.getCommand("vanhahima").setExecutor(new vanhahima());
        this.getServer().getPluginManager().registerEvents(new KuolemaEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
