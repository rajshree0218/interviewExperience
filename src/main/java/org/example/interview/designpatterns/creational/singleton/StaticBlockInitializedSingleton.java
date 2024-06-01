package org.example.interview.designpatterns.creational.singleton;

// static block initialization is similar to eager initialization,
// except that the instance of the class is created inside the static block that
// provides the option of exception handling.
public class StaticBlockInitializedSingleton {

    private static final StaticBlockInitializedSingleton instance;

    private StaticBlockInitializedSingleton(){

    }

    static {
        try{
            instance = new StaticBlockInitializedSingleton();
        } catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public static StaticBlockInitializedSingleton getInstance(){
        return instance;
    }
}
