package org.example.z.eca.flc.oops;

public class Bus extends Vehicle implements Breakable, Repairable{

    @Override
    public void start(){
        System.out.println("Bus engine stopped with Key");
    }

    @Override
    public void speeddown() {
        this.speed = this.speed -20;
        System.out.printf("Bus is speeding down and running at the speed of %s miles per hour "+ this.speed);
    }

    @Override
    public void doRepair(){
        System.out.println("Bus is repaired well");
    }
}
