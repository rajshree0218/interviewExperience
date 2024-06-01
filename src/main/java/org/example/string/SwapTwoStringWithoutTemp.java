package org.example.string;

public class SwapTwoStringWithoutTemp {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "guides";
        System.out.println("Before");
        System.out.println(s1 + " : " + s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("After");
        System.out.println(s1 + " : " + s2);
    }
}
