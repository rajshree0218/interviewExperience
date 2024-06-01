package org.example.interview.designpatterns.creational.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}

    // add synchronized at method level
//    public static synchronized BillPughSingleton getInstance(){
//        if(instance == null)
//        {
//            instance = new BillPughSingleton();
//        }
//        return instance;
//    }

    // below is to add double check locking by adding synchronized method inside if
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
