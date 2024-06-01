package org.example.interview;

public class MissingElementInArray {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int n = arr.length;
        int totalSum = (n*(n+1))/2;
        int arrSum = 0;
        for(int num: arr){
            arrSum += num;
        }
        int missingNumber = totalSum - arrSum;
        System.out.println(missingNumber);
    }
}
