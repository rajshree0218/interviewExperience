package org.example.interview;

public class IncreaseTripplest {
    public static void main(String[] args) {
        int[] arr1 = {2,1,5,0,4,6};
        int[] arr2 = {1,0};
        int[] arr3 = {5,4,3,2,1};
        boolean flag = false;
        int firstMin = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int num : arr1) {
            if(num <= firstMin){
                firstMin = num;
            } else if(num <= secMin){
                secMin = num;
            } else {
                flag = true;
            }
        }
//        System.out.println(flag);
        System.out.println(increasingTriplet(arr1));
        System.out.println(increasingTriplet(arr2));
        System.out.println(increasingTriplet(arr3));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < minOne) {
                minOne = num;
            }

            if (num > minOne) {
                minTwo = Math.min(num, minTwo);
            }

            if (num > minTwo) {
                return true;
            }
        }
        return false;
    }
}
