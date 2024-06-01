package org.example.z.eca.flc.innerclasses;

public class TestInnerClass {

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.printOuterClassValue();

        OuterClass.InnerClass obj1 = new OuterClass().new InnerClass();
        obj1.printValues();

        OuterClass.InnerClassStatic obj2 = new OuterClass.InnerClassStatic();
        obj1.printValues();
    }
}
