package org.example.z.eca.flc.oops;

// car is vehicle which can be speedup, speeddown, both.
public class Car extends Vehicle implements Acceleratable, Breakable{

    @Override
    public void start(){
        System.out.println("Car engine stopped with button press");
    }


    @Override
    public void speedup() {
        this.speed = this.speed +20;
        System.out.printf("Car is speeding up and running at the speed of %s miles per hour ", this.speed);
        System.out.println();
    }

    @Override
    public void speeddown() {
        this.speed = this.speed -20;
        System.out.printf("Car is speeding down and running at the speed of %s miles per hour ", this.speed);
    }
}
