package org.example.z.eca.flc.interfaces;

public class Preacher implements Speaker{
    @Override
    public void speak() {
        System.out.println("Preacher who preaches ....s");
        System.out.println("Duration:: "+Speaker.DURATION+" mins.");
    }

    @Override
    public void topic() {
        System.out.println("Importance of prayers for peace of mind");
    }
}
