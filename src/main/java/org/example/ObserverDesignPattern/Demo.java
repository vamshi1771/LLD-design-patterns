package org.example.ObserverDesignPattern;

public class Demo {

    public static void main(String[] args) {
        Channel vamshiVlogs = new Channel();
        vamshiVlogs.setName("vamshiVlogs");
        vamshiVlogs.setOwner("vamshi");
        Subscriber s1 = new observer1("Thanuja");
        Subscriber s2 = new Observer2("Naveen");
        vamshiVlogs.addSubscriber(s1);
        vamshiVlogs.addSubscriber(s2);
         vamshiVlogs.uploadVideo(" LLD course");
    }
}
