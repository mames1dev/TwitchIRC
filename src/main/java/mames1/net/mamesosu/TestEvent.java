package mames1.net.mamesosu;

import org.pircbotx.hooks.ListenerAdapter;

public class TestEvent extends ListenerAdapter {

    @Override
    public void onMessage(org.pircbotx.hooks.events.MessageEvent event) {
        System.out.println(event.getUser().getNick() + ": " + event.getMessage());
    }
}
