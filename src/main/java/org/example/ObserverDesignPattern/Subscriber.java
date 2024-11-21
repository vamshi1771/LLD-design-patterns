package org.example.ObserverDesignPattern;

import java.nio.channels.Channel;

public interface Subscriber {

    void update(String title,String channel);
    void subScribeChannel(Channel channel);

}
