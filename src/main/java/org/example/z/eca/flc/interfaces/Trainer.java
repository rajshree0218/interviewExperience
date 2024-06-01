package org.example.z.eca.flc.interfaces;

public class Trainer implements Speaker{
    @Override
    public void speak() {
        System.out.println("YURI the trainer who trains (pink panther style)");
        System.out.println("Duration:: "+Speaker.DURATION+" mins.");
    }

    @Override
    public void topic() {
        System.out.println("How to hit a perfect banana kick.");
    }
}
