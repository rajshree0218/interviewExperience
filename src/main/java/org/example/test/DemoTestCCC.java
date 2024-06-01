package org.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class DemoTestCCC {

    public static void main(String[] args) {
        String str = "this is Hr round, and hr round is amazing";
        Arrays.stream(str.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .forEach((k)-> System.out.println(k));

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");

        Iterator<String> iter = arr.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");
//            arr.add("Five");
        }


//        map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .forEach(System.out::println);

        Complex d1 = new Complex();
        Complex d2 = new Sample();
        d1.f1();
        d2.f1();

    }
}


class Complex {
    public static void f1()
    {
        System.out.println(
                "f1 method of the Complex class is executed.");
    }
}
class Sample extends Complex {
    public static void f1()
    {
        System.out.println(
                "f1 of the Sample class is executed.");
    }
}












