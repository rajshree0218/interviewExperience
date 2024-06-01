package org.example.z.eca.flc.oops.actors;

import org.example.z.eca.flc.oops.Bike;
import org.example.z.eca.flc.oops.Bus;
import org.example.z.eca.flc.oops.Car;
import org.example.z.eca.flc.oops.ERikshaw;

public class TestMain {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        ERikshaw eRikshaw = new ERikshaw();
        Bus bus = new Bus();

        Driver driver = new Driver();
        Racer racer = new Racer();
        Mechanic mechanic = new Mechanic();
        HouseKeeper houseKeeper = new HouseKeeper();


        driver.doDrive(car);
        driver.doDrive(bike);
        driver.doDrive(eRikshaw);
        driver.doDrive(bus);

        racer.doRace(car);
        racer.doRace(bike);

        mechanic.doRepair(bike);
        mechanic.doRepair(eRikshaw);
        mechanic.doRepair(bus);

        houseKeeper.doClean(eRikshaw);

    }
}
