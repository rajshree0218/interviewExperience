package org.example.interview;

import java.util.Arrays;

public class MergeTwoUnsortedArray {
    public static void main(String[] args) {
        int[] arr1={1,5,3,7};
        int[] arr2={2,8};
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] arr3 = new int[length1+length2];
        mergeUnsortedArray(arr1, arr2, length1, length2, arr3);
    }
    public static void mergeUnsortedArray(int[] arr1, int[] arr2, int l1, int l2, int[] arr3){

        //bubble sort: compare adjacent element, if wrong in order, swap them.
        for(int i1=0; i1<l1;i1++ ){
            for(int j1=0; j1<l2;j1++){
                if(arr1[i1]<arr1[j1]){
                    int temp = arr1[i1];
                    arr1[i1] = arr1[j1];
                    arr1[j1] = temp;
                }
            }
        }

        int i=0;int j=0; int k=0;
        while(i<l1 && j<l2){
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        while(i<l1){
            arr3[k++] = arr1[i++];
        }

        while(j<l2){
            arr3[k++] = arr2[j++];
        }
        Arrays.stream(arr3).forEach(e-> System.out.print(e+" "));
    }
}
