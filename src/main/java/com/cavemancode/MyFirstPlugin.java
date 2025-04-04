package com.cavemancode;

import org.bukkit.plugin.java.JavaPlugin;

public class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MyFirstPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MyFirstPlugin has been disabled!");
    }
}
