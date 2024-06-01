package org.example.interview;

import java.util.Arrays;

public class findSecondSmallestLargest {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {3, 7, 1, 9, 4, 2, 6};
        System.out.println("Array: " + Arrays.toString(arr1));
        System.out.println("Largest Element: " + findLargestElement(arr1));    // 9
        System.out.println("Smallest Element: " + findSmallestElement(arr1));  // 1

        int[] arr2 = {-5, 0, 10, -2, 8};
        System.out.println("Array: " + Arrays.toString(arr2));
        System.out.println("Largest Element: " + findLargestElement(arr2));    // 10
        System.out.println("Smallest Element: " + findSmallestElement(arr2));  // -5

        // Edge cases
        int[] emptyArray = {};
        try {
            System.out.println("Largest Element: " + findLargestElement(emptyArray));   // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int[] nullArray = null;
        try {
            System.out.println("Smallest Element: " + findSmallestElement(nullArray));  // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int[] arr4 = {-3,1,2,9,-2,4};
        int[] arr5 = {12,13,12,10,34,10,25};
        int[] arr6 = {-3,-1,-2,-9,-2,-4};
        System.out.println(secondSmallest(arr4) +" : "+secondLargest(arr4));
        System.out.println(secondSmallest(arr5)+" : "+secondLargest(arr5));
        System.out.println(secondSmallest(arr6)+" : "+secondLargest(arr6));
    }

    public static int secondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for(int num: arr){
            if(num<min){
                sMin = min;
                min = num;
//            } else if(num < sMin && num != min){
            } else if( sMin > min && sMin>num){
                sMin = num;
            }
        }
        return sMin;
    }

    public static int getMin(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1], getMin(arr, n-1));
    }

    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE; //  {-3,1,2,9,-2,4};
        int sMax = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max){
                sMax = max;
                max = num;
            } else if(num > sMax && num != max){
                sMax = num;
            }
        }
        return sMax;
    }

    public static int findLargestElement(int[] arr){
        if(arr==null || arr.length==0)
            throw new IllegalArgumentException("Array is either empty or null");

        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static int findSmallestElement(int[] arr){
        if(arr==null || arr.length==0)
            throw new IllegalArgumentException("Array is either empty or null");
        int min = arr[0];
        for(int num : arr){
            if(num<min){
                min = num;
            }
        }
        return min;
    }

}
