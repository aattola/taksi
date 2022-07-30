package com.jeffe.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KuolemaEvent implements Listener {
   @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
       e.setDroppedExp(0);
       e.setKeepLevel(true);
       e.setShouldDropExperience(false);
   }
}
