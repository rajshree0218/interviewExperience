package org.example.interview.designpatterns.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){}


    private static final class InstanceHolder {
        static final BillPughSingleton instance = new BillPughSingleton();
    }

    // below is to add double check locking by adding synchronized method inside if
    public static BillPughSingleton getInstanceUsingDoubleLocking() {
        return InstanceHolder.instance;
    }
}
