package org.example.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementFromTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        List<Integer> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        commonElements.forEach(System.out::println);
        System.out.println();
        List<Integer> commonElement = list1.stream()
                .filter(e->list2.contains(e))//.filter(list2::contains)
                .distinct()
                .collect(Collectors.toList());
        commonElement.forEach(System.out::println);
//        Arrays.sort();
    }
}
