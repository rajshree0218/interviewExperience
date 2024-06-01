package org.example.interview;

public class QuickSorting {

    public static void main(String[] arg) {

        int[] arr = {89, 45, 67, 87, 23};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("sorted array :- ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // choosing the pivot;
        int pivot = arr[high];
        // index of smaller element and indicates the right position of pivot found so far
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            //if current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; // increment index of smaller element
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


//    private static void quickSort(int[] arr){
//        if(arr == null || arr.length ==0){
//            return ;
//        }
//        sort(arr, 0, arr.length-1);
//    }
//
//    private static void sort(int[] arr, int low, int high){
//        if(low<high){
//
//        int pivotIndex = partition(arr, low, high);
//        sort(arr, low, pivotIndex-1);
//        sort(arr, pivotIndex+1, high);
//        }
//    }
//
//    private static int partition(int[] arr, int low, int high){
//        int pivot = arr[high];
//        int i=low-1;
//        for(int j=low; j<high; j++){
//            if(arr[j]< pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,high);
//        return i+1;
//    }
//
//    private static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
