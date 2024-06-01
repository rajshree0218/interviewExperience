package org.example.z.eca.flc.oops.actors;

import org.example.z.eca.flc.oops.Repairable;

public class Mechanic {
    public void doRepair(Repairable vehicle){
        System.out.println("Mechanic is ready to repair");
        vehicle.doRepair();

    }
}
