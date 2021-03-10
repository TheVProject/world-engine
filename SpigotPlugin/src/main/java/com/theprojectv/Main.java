package com.theprojectv;

import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {
    @Override
    public void onDisable() {
       System.out.println("Plugin disabled");
    }

    @Override
    public void onEnable() {
        System.out.println("Plugin enabled");
    }
}
