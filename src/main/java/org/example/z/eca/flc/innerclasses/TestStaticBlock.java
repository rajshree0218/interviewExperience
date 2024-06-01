package org.example.z.eca.flc.innerclasses;

public class TestStaticBlock {

    // static blocks, executes before constructor as soon class loaded in JVM
    static {
        System.out.println("static block 1 printing");

    }
    // static blocks, executes before constructor as soon class loaded in JVM
    static {
        System.out.println("static block 2 printing");
//        System.exit(0);// it will exit, and main method will not run.

    }

    public static void main(String[] args) {
        System.out.println("main methods printing");
    }
}
