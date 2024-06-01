package org.example.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDupElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,2,5,8,2,3,8};
        List<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i->i))
                .entrySet()
                .stream()
                .filter(e-> e.getValue().size()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);
    }
}
