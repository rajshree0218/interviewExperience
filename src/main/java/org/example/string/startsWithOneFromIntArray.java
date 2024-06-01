package org.example.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startsWithOneFromIntArray {
    public static void main(String[] args) {
        int[] arr = {1,23,12,45,100};
        List<String> list = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .filter(s-> s.startsWith("1"))
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
