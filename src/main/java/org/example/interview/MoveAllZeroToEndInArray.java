package org.example.interview;

public class MoveAllZeroToEndInArray {

    public static void main(String[] args) {
        // Move all zeros to the end of the array. Input :{5,6,0,8,0,3,7} Output : {5,6,8,3,7,0,0}
        int[] arr = {5,6,0,8,0,3,7};
        int start = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] !=0){
                arr[start++] = arr[i];
            }
        }

        while(start<arr.length){
            arr[start++] = 0;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(i+" ");
        }
    }
}
