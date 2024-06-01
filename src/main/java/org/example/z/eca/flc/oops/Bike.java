package org.example.z.eca.flc.oops;

public class Bike extends Vehicle implements Acceleratable, Breakable, Repairable{

    @Override
    public void start(){
        System.out.println("Bike engine stopped with key");
    }
    @Override
    public void speedup() {
        this.speed = this.speed +20;
        System.out.printf("Bike is speeding up and running at the speed of %s miles per hour ", this.speed);
        System.out.println();
    }

    @Override
    public void speeddown() {
        this.speed = this.speed -20;
        System.out.printf("Bike is speeding down and running at the speed of %s miles per hour ", this.speed);
    }

    @Override
    public void doRepair(){
        System.out.println("Bike is repaired well");
    }
}
