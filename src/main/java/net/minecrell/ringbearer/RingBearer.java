package net.minecrell.ringbearer;

import org.bukkit.plugin.java.JavaPlugin;

public final class RingBearer extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info(this.getName() + " enabled.");
    }

    @Override
    public void onDisable() {
        this.getLogger().info(this.getName() + " disabled.");
    }
}