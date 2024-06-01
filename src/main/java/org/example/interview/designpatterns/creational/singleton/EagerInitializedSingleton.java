package org.example.interview.designpatterns.creational.singleton;

// in the Eager initialization, the instance of singleton class is created at the time of class loading.
// drawback is method is created even though client application is not using it.

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
