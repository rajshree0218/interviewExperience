package org.example.z.eca.flc.oops;

public abstract class Vehicle implements AutoMobile{

    int speed = 100;

    @Override
    public void stop(){
        System.out.println("Vehicle engine stopped");
    }
}
