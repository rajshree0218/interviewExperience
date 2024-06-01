package org.example.interview;

public class MaxSumOfSubArray {

    // Function to find the sub array with the maximum sum
    public static int[] maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0]; // This variable keeps track of the maximum sum found so far while iterating through the array. It is initialized with the first element of the array.
        int maxEndingHere = arr[0]; // This variable represents the maximum sum of the subarray ending at the current position (arr[i]). It is updated at each iteration either by adding the current element to the existing sum or by starting a new subarray from the current element itself (if the sum so far is negative).
        int start = 0; // start and end, These variables are used to keep track of the starting and ending indices of the subarray with the maximum sum found so far.
        int end = 0;
        int s = 0; //  This variable is used to keep track of the starting index of the subarray with the maximum sum ending at the current position (arr[i]). It is updated whenever maxEndingHere is equal to the current element, indicating the start of a new potential subarray.

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            if (maxEndingHere == arr[i]) {
                s = i;
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
        }

        // Extract the subarray with the maximum sum
        int[] result = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            result[i - start] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 3, 4, -1, -2, 1, 5, 3};
//        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int[] arr = { -1, -4, -2, -10, -2, -3, -1, 0, -20 };
        int[] maxSubarray = maxSubarraySum(arr);
        int max = maxSubArray(arr);
        System.out.println(max);


//        // Printing the subarray with maximum sum
//        System.out.println("Subarray with maximum sum:");
//        for (int num : maxSubarray) {
//            System.out.print(num + " ");
//        }
//
//        // Printing the sum of the subarray with maximum sum
//        int sum = 0;
//        for (int num : maxSubarray) {
//            sum += num;
//        }
//        System.out.println("\nSum of the subarray with maximum sum: " + sum);

    }


    public static int maxSubArray(int[] arr){
        //-2 -3 4 -1 -2 1 5 -3
        //7 (4 -1 -2 1 5)
        int start =0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        int currSum = arr[0];

        while(end < arr.length-1) {
            if (currSum < 0) {
                max = Math.max(max, currSum);
                currSum = 0;
                start++;
                end++;
                currSum+= arr[start];
            } else {
                end++;
                currSum += arr[end];
                max = Math.max(max, currSum);
            }
        }
        return max;
    }
}
