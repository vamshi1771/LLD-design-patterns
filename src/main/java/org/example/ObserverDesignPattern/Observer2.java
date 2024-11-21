package org.example.ObserverDesignPattern;

import lombok.Data;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;

@Data
public class Observer2 implements Subscriber{
    private  String Name;
    private List<Channel> channelList = new ArrayList<>();

    Observer2(String name){
        this.Name = name;
    }
    @Override
    public void update(String title, String channel) {
        System.out.println(Name + "=>" + channel + " Uploaded" + title + "video");
    }

    @Override
    public void subScribeChannel(Channel channel) {
        this.channelList.add(channel);
    }
}