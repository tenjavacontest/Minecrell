package net.minecrell.ringbearer;

import com.google.common.base.Preconditions;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class RingBearerPlugin extends JavaPlugin {
    private static RingBearerPlugin instance;

    public static RingBearerPlugin getInstance() {
        return instance;
    }

    public RingBearerPlugin() {
        Preconditions.checkState(instance == null, "Plugin already initialized");
        instance = this;
    }

    @Override
    public void onEnable() {
        new RingListener(this).register();

        this.getLogger().info(this.getName() + " enabled.");
    }

    @Override
    public void onDisable() {
        this.getLogger().info(this.getName() + " disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // TODO: Command handling
        return true;
    }
}