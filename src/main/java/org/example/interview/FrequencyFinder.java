package org.example.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyFinder {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 4, 3};
        findNumbersWithFrequencyGreaterThanTwo(nums);
    }

    public static void findNumbersWithFrequencyGreaterThanTwo(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        for (int num : duplicates) {
            System.out.print(num +" ");
        }
    }
}

class DuplicateFinder {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 4, 3};
        findNumbersWithFrequencyGreaterThanTwo(nums);
        findNumbersWithFrequencyGreaterThanTwoWithSet(nums);
    }

    public static void findNumbersWithFrequencyGreaterThanTwo(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 2) {
                System.out.print(entry.getKey()+" ");
            }
        }
    }

    public static void findNumbersWithFrequencyGreaterThanTwoWithSet(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        for (int num : duplicates) {
            System.out.print(num+" ");
        }
    }
}
