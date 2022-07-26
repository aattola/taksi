package com.jeffe;

import org.bukkit.plugin.java.JavaPlugin;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public final class taksi extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        this.getCommand("taksi").setExecutor(new CommandKit());
        this.getCommand("gn").setExecutor(new GN());
        this.getCommand("sadevittuun").setExecutor(new sadevittuun());
        this.getCommand("lagaanko").setExecutor(new lagaanko());
        //this.getCommand("hima").setExecutor(new hima());
        //this.getCommand("vanhahima").setExecutor(new vanhahima());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
