package org.example.z.eca.flc.innerclasses;

public class OuterClass {
    int out_i = 10;
    public void printOuterClassValue(){
        System.out.println("O Outer Class out_i :: "+ out_i);
        System.out.println("O InnerClass in_i :: "+new InnerClass().in_i);
        System.out.println("O InnerClassStatic in_i :: "+new InnerClassStatic().in_i);
    }

    public class InnerClass{
        int in_i=20;
        public void printValues(){
            System.out.println("I InnerClass in_i :: "+in_i);
            System.out.println("I OuterClass out_i :: "+out_i);
        }
    }

    public static class InnerClassStatic{
        int in_i=20;
        public void printValues(){
            System.out.println("S static InnerClass in_i :: "+in_i);
            System.out.println("S OuterClass out_i :: "+new OuterClass().out_i);
        }
    }
}
