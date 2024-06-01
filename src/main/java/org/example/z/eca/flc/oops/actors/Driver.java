package org.example.z.eca.flc.oops.actors;

import org.example.z.eca.flc.oops.Vehicle;

public class Driver {
    public void doDrive(Vehicle vehicle){
        System.out.println("Driver is ready to drive");
        vehicle.start();
        vehicle.stop();
    }
}
