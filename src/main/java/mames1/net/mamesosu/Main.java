package mames1.net.mamesosu;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, IrcException {

        Configuration configuration = new Configuration.Builder()
                .setName("twitch user")
                .setServerPassword("oauth:access_token")
                .setServer("irc.chat.twitch.tv")
                .setServerPort(6667)
                .addListener(new TestEvent())
                .addAutoJoinChannel("#k4sen")
                .buildConfiguration();

        PircBotX bot = new PircBotX(configuration);
        bot.startBot();
    }
}