package dev.newcrest.network;

import dev.waterdog.event.defaults.ProxyPingEvent;
import dev.waterdog.event.defaults.ProxyQueryEvent;

public class EventListener {

    public static void init(Loader loader) {
        loader.getProxy().getEventManager().subscribe(ProxyPingEvent.class, EventListener::onProxyPing);
        loader.getProxy().getEventManager().subscribe(ProxyQueryEvent.class, EventListener::onProxyQuery);
    }

    public static void onProxyPing(ProxyPingEvent event) {
        int max = Loader.cfg.getInt("max_players_allowed");
        int value = event.getPlayerCount() >= max ? max : event.getPlayerCount() + 1;
        event.setMaximumPlayerCount(value);
    }

    public static void onProxyQuery(ProxyQueryEvent event) {
        event.setMaximumPlayerCount(event.getPlayerCount() + 1);
    }

}
