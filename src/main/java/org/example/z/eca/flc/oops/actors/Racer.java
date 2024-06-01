package org.example.z.eca.flc.oops.actors;

import org.example.z.eca.flc.oops.Acceleratable;

public class Racer {

    public void doRace(Acceleratable vehicle){
        System.out.println("Racer is ready to race");
        vehicle.speedup();
        vehicle.speedup();
        vehicle.speedup();
        vehicle.speedup();
        vehicle.speedup();
    }
}
