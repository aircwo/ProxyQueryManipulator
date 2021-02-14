package dev.newcrest.network;

import dev.newcrest.network.EventListener;
import dev.waterdog.plugin.Plugin;

public class Loader extends Plugin {

    @Override
    public void onEnable() {
        EventListener.init(this);
    }
	
}
