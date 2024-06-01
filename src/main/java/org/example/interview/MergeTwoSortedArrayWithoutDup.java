package org.example.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArrayWithoutDup {
    public static void main(String[] args) {
        int[] arr1= {1,3,4,7};
        int[] arr2= {2,4,6,6,8};
        int[] arr3 = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2))
                .distinct()
                .sorted()
                .toArray();
        Arrays.stream(arr3).forEach(e->System.out.print(e+" "));
    }


}
