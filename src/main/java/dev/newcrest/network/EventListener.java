package dev.newcrest.network;

import dev.newcrest.network.Loader;
import dev.waterdog.event.Event;
import dev.waterdog.event.defaults.ProxyPingEvent;
import dev.waterdog.event.defaults.ProxyQueryEvent;

public class EventListener {

    public static void init(Loader loader) {
        loader.getProxy().getEventManager().subscribe(ProxyPingEvent.class, EventHandler::onProxyPing);
        loader.getProxy().getEventManager().subscribe(ProxyQueryEvent.class, EventHandler::onProxyQuery);
    }

    public static void onProxyPing(ProxyPingEvent event) {
        event.setMaximumPlayerCount(event.getPlayerCount() + 1);
    }

    public static void onProxyQuery(ProxyQueryEvent event) {
        event.setMaximumPlayerCount(event.getPlayerCount() + 1);
    }

}
