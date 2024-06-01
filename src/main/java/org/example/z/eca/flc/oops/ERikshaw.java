package org.example.z.eca.flc.oops;

public class ERikshaw extends Vehicle implements Breakable, Repairable, Washable{

    @Override
    public void start(){
        System.out.println("Erikshaw engine stopped with button press");
    }

    @Override
    public void speeddown() {
        this.speed = this.speed -20;
        System.out.printf("E-Rikshaw is speeding down and running at the speed of %s miles per hour "+ this.speed);
    }

    @Override
    public void doRepair(){
        System.out.println("E-Rikshaw is repaired well");
    }

    @Override
    public void doClean(){
        System.out.println("E-Rikshaw is cleaned well");
    }
}
