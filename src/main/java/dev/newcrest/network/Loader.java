package dev.newcrest.network;

import dev.waterdog.plugin.Plugin;
import dev.waterdog.utils.Configuration;

public class Loader extends Plugin {

    public static Configuration cfg;

    @Override
    public void onEnable() {
        EventListener.init(this);
        saveResource("config.yml");
        cfg = getConfig();
    }
	
}
