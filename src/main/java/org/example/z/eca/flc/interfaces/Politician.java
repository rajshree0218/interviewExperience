package org.example.z.eca.flc.interfaces;

public class Politician implements Speaker{

    @Override
    public void speak() {
        System.out.println("Politician speaks in political pros and cons");
        System.out.println("Duration:: "+Speaker.DURATION+" mins.");
    }

    @Override
    public void topic() {
        System.out.println("COVID-19 Pandemic and the effects on India");
    }
}
