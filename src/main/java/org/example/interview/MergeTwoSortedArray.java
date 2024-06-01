package org.example.interview;

import java.util.*;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,7};
        int[] arr2 = {2,4,6,8};
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] arr3 = new int[length1 + length2];


        mergeArrayWithMap(arr1, arr2, length1, length2);
        System.out.println("linkedhashmap");
        mergeArrayWithLinkedHashSet(arr1, arr2, length1, length2);

//        mergeArray(arr1, arr2, length1, length2, arr3);
//        mergeArrays(arr1, arr2);

    }

    public static void mergeArrayWithMap(int[] arr1, int[] arr2, int length1, int length2){

        Map<Integer, Boolean> map = new TreeMap<>(); // use treemap to insert in sort order
        for(int i=0;i<length1;i++){
            map.put(arr1[i], true);
        }
        for(int j = 0; j<length2; j++){
            map.put(arr2[j], true);
        }

        map.forEach((key, value) -> System.out.print(key+" "));
        //Time Complexity: O( nlog(n) + mlog(m) )
        //Auxiliary Space: O(N)

    }
    public static void mergeArrayWithLinkedHashSet(int[] arr1, int[] arr2, int length1, int length2){

        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<length1;i++){
                set.add(arr1[i]);
        }
        for(int j = 0; j<length2; j++){
                set.add(arr2[j]);
        }

        int[] mergeArray = set.stream().mapToInt(Integer::intValue).sorted().toArray();
        Arrays.stream(mergeArray).forEach(e-> System.out.print(e+" "));
    }

    public static void mergeArray(int[] arr1, int[] arr2, int length1, int length2, int[] arr3){
        int i=0; int j=0; int k=0;
        while(i< arr1.length && j< arr2.length){
            if(arr1[i]< arr2[j]){
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        // Copy remaining elements from arr1, if any
        while (i < length1) {
            arr3[k++] = arr1[i++];
        }
        // Copy remaining elements from arr2, if any
        while (j < length2) {
            arr3[k++] = arr2[j++];
        }
        // Print the sorted merged array
        for (int arr : arr3) {
            System.out.print(arr + " ");
        }

        // Arrays.sort() : o(n)
        //Time Complexity : O(n1 + n2)
        //Auxiliary Space : O(n1 + n2)
    }

    // brute force : take all the elements of arr1 and arr2 in arr3. then perform sorting.
    public static void mergeArrays(int[] arr1, int[] arr2, int length1, int length2, int[] arr3){
        int i=0;
        int j=0;
        int k=0;

        while (i<length1){
            arr3[k++] = arr1[i++];
        }

        while (j<length2){
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);

        for(int arr: arr3){
            System.out.print(arr+" ");
        }
        //Time Complexity : O((m+n) log(m+n)) , the whole size of arr3 is m+n
        //Auxiliary Space: O(m+n), where m is the size of arr1 and n is the size of arr2.
    }
}

