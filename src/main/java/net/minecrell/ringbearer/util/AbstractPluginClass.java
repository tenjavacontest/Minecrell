package net.minecrell.ringbearer.util;

import org.bukkit.Server;
import org.bukkit.plugin.Plugin;

import java.util.logging.Logger;

public abstract class AbstractPluginClass<T extends Plugin> implements PluginClass<T> {
    private final T plugin;

    protected AbstractPluginClass(T plugin) {
        this.plugin = plugin;
    }

    @Override
    public final T getPlugin() {
        return plugin;
    }

    /**
     * Returns the plugin logger of the plugin used for logging errors and other messages.
     * @return The logger of the plugin
     */
    protected Logger getLogger() {
        return plugin.getLogger();
    }

    /**
     * Returns the server instance running the plugin.
     * @return Server running the plugin
     */
    protected Server getServer() {
        return plugin.getServer();
    }
}
