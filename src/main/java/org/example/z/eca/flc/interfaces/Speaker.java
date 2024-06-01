package org.example.z.eca.flc.interfaces;

public interface Speaker {
    int DURATION=45; // public static int duration=45
    void speak(); //public abstract void speak();
    void topic(); // public abstract void topic();
    default void show(){
        System.out.println("Default implementation of show");
    }
}
