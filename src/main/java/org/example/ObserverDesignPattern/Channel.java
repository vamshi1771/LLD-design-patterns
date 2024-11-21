package org.example.ObserverDesignPattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Channel {
    private String Name;
    private int videosUploaded;
    private String owner;
    private List<Subscriber> subscriberList = new ArrayList<>();



    void addSubscriber(Subscriber sub){
        this.subscriberList.add(sub);
    }

    void removeSubscriber(Subscriber sub){
        this.subscriberList.remove(sub);
    }

    void uploadVideo(String title){
        notifySubscriber(title);
    }

    void notifySubscriber(String title){
        for(Subscriber sub : subscriberList){
            sub.update(title,this.Name);
        }
    }

}
