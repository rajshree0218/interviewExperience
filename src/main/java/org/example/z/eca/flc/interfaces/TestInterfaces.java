package org.example.z.eca.flc.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Preacher preacher = new Preacher();
        Politician politician = new Politician();
        displayInfo(trainer);
        displayInfo(preacher);
        displayInfo(politician);
    }

    static void displayInfo(Speaker speaker){
        speaker.speak();
        speaker.topic();
        speaker.show();
    }
}
