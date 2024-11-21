package org.example.SingletonPattern;

public class LoggerSingleton {

    //Eager Loading
    //private static LoggerSingleton instance = new LoggerSingleton();


    // volatile : any change made to that variable by one thread is visible to all other threads
    // Lazy Loading
    private static volatile LoggerSingleton instance = null;


    private LoggerSingleton(){
        // to keep safe from Reflection (Java.lang.reflect)
        // Reflection : it is a Feature in Java , Allows a Program to inspect or modify Run time Behaviour of classes methds and fields
        // which can allow developers to access private methods or classes
        if(instance != null) {
            System.out.println("Use getInstance Method to get Instance");
        }
    }

    // Not ThreadSaftey
//    public static LoggerSingleton getInstance(){
//        if(instance == null) instance = new LoggerSingleton();
//        return instance;
//    }


    // ThreadSaftey => Double Checking
    // By using synchronized(acquire's the lock ) we ensure that only one Instance is created/ one thread is accessing the block
    // but acquiring lock for each call to getInstance is costly
    // for that case we double check for instance.

    public static LoggerSingleton getInstance(){
        if(instance == null){
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }
}
