package net.minecrell.ringbearer.util;

import org.bukkit.plugin.Plugin;

/**
 * This interface represents a basic class with an reference to the main plugin class.
 * @param <T> The main plugin class
 */
public interface PluginClass<T extends Plugin> {

    /**
     * Gets the plugin instance of this class.
     * @return Plugin instance this class belongs to.
     */
    T getPlugin();
}
