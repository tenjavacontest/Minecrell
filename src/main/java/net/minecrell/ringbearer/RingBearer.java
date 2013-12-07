package net.minecrell.ringbearer;

import com.google.common.base.Preconditions;
import org.bukkit.plugin.java.JavaPlugin;

public final class RingBearer extends JavaPlugin {
    private static RingBearer instance;

    public static RingBearer getInstance() {
        return instance;
    }

    public RingBearer() {
        Preconditions.checkState(instance == null, "Plugin already initialized");
        instance = this;
    }

    @Override
    public void onEnable() {
        this.getLogger().info(this.getName() + " enabled.");
    }

    @Override
    public void onDisable() {
        this.getLogger().info(this.getName() + " disabled.");
    }
}