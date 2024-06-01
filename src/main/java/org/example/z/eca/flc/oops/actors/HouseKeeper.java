package org.example.z.eca.flc.oops.actors;

import org.example.z.eca.flc.oops.Washable;

public class HouseKeeper {
    public void doClean(Washable vehicle){
        System.out.println("HouseKeeper is ready to clean");
        vehicle.doClean();

    }
}
