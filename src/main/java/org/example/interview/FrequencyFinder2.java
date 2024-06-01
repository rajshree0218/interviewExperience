package org.example.interview;

import java.util.HashMap;
import java.util.Map;

public class FrequencyFinder2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 4, 3};
        findNumbersWithFrequencyOne(nums);
    }
    private static void findNumbersWithFrequencyOne(int[] nums) {
        for(int num : nums){
            if(countOccurance(nums, num) ==1){
                System.out.println(num + " appears exactly once.");
            }
        }
    }
    private static int countOccurance(int[] nums, int target) {
        int count = 0;
        for(int num : nums){
            if(num == target){
                count++;
            }
        }
        return count;
    }
}

class SingleOccurrenceFinder {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 4, 3};
        findNumbersWithFrequencyOne(nums);
    }

    public static void findNumbersWithFrequencyOne(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        boolean found = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Number " + entry.getKey() + " appears exactly once.");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No number appears exactly once.");
        }
    }
}

