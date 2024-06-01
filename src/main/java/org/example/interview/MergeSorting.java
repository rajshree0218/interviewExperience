package org.example.interview;

public class MergeSorting {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergeSort(arr, 0, arr.length-1);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end){

        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int i,j,k;
        int n1 = mid - start+1;
        int n2 = end - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(i = 0; i<n1; i++){
            leftArr[i] = arr[start+i];
        }

        for(j=0; j<n2; j++){
            rightArr[j] = arr[mid+1+j];
        }

        i=0; j=0; k=start;
        while(i<n1 && j<n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = leftArr[i];
            i++; k++;
        }
        while(j<n2){
            arr[k] = rightArr[j];
            j++; k++;
        }
    }
}
