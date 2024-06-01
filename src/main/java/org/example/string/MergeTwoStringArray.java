package org.example.string;

import java.util.Arrays;

public class MergeTwoStringArray {
    public static void main(String[] args) {
        String[] arr1 = {"Java", "Programming"};
        String[] arr2 = {"Rajshree", "Soni"};
        String[] mergeArray = mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(mergeArray));
    }

    private static String[] mergeArray(String[] arr1, String[] arr2){
        int length1 = arr1.length;
        int length2 = arr2.length;
        int mergeLength = arr1.length + arr2.length;
        String[] mergeArray = new String[mergeLength];
        System.arraycopy(arr1,0,mergeArray, 0, length1);
        System.arraycopy(arr2,0,mergeArray, length1, length2);
        return mergeArray;
    }
}
