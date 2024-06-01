package org.example.interview;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3, 4, 5, -2, -3};
        int target = 5;
        int count = 0;

        int[] result = new int[0];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i] +arr[j] == target){ // arr[j] = target - arr[i];// arr[2] = 5-2 = 3
                    System.out.println(arr[i]+" : "+arr[j]);
                    count++;
//                    result[] = result[i]+result[j];
                }
            }
        }

        System.out.println("Total pairs : "+count);
    }
}
