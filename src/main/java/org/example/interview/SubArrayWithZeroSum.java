package org.example.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr={-3,2,3,1,6};
        int length = arr.length;
        // with java8
        boolean flag = Arrays.stream(arr)
                .flatMap(i -> Arrays.stream(arr)
                        .skip(Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(i))
                        .map(j -> i == j ? j : i + j))
                .anyMatch(sum -> sum == 0);
        System.out.println(flag? "Exists":"Not Exists");

        // without JAva 8
        flag = false;
        flag=test(arr, length);
        System.out.println(flag? "Exists":"Not Exists");
    }

    public static boolean test(int[] arr, int length){
        for(int i =0; i<length;i++){
            int sum = 0;
            for(int j=i; j<length;j++){
                sum = sum+arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    }
}

class B{

    public static void main(String[] args) {
        int[] arr = { -3, 2, 3, 1, 6 };

        boolean flag=false;
        for(int i =0; i<arr.length;i++){
            int sum = arr[i];
            if(sum==0){
                flag = true;
                break;
            }
            for(int j=i+1; j<arr.length;j++){
                sum = sum+arr[j];
                if(sum==0){
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag ? "Exists" : "Not Exists");
    }
}
