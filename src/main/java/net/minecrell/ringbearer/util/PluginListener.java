package net.minecrell.ringbearer.util;

import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public abstract class PluginListener<T extends Plugin> extends AbstractPluginClass<T> implements Listener {
    protected PluginListener(T plugin) {
        super(plugin);
    }

    /**
     * Registers the events of this plugin listener.
     */
    public void register() {
        this.getServer().getPluginManager().registerEvents(this, this.getPlugin());
    }

    /**
     * Unregisters the events of this plugin listener.
     */
    public void unregister() {
        HandlerList.unregisterAll(this);
    }
}
