package com.jeffe;

import com.jeffe.commands.GN;
import com.jeffe.commands.Taksitus;
import com.jeffe.commands.Lagaanko;
import com.jeffe.commands.Sadevittuun;
import com.jeffe.events.KuolemaEvent;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class Taksi extends JavaPlugin {
    private BukkitAudiences adventure;

    public @NonNull BukkitAudiences adventure() {
        if(this.adventure == null) {
            throw new IllegalStateException("Tried to access Adventure when the plugin was disabled!");
        }
        return this.adventure;
    }
    @Override
    public void onEnable() {
        // Plugin startup logic
        this.adventure = BukkitAudiences.create(this);

        this.getCommand("taksi").setExecutor(new Taksitus());
        this.getCommand("gn").setExecutor(new GN());
        this.getCommand("sadevittuun").setExecutor(new Sadevittuun());
        this.getCommand("lagaanko").setExecutor(new Lagaanko(this));
        //this.getCommand("hima").setExecutor(new hima());
        //this.getCommand("vanhahima").setExecutor(new vanhahima());
        this.getServer().getPluginManager().registerEvents(new KuolemaEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        if(this.adventure != null) {
            this.adventure.close();
            this.adventure = null;
        }
    }
}
