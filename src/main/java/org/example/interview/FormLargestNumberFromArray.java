package org.example.interview;

public class FormLargestNumberFromArray {
    public static void main(String[] args) {
        //You will be given an array of positive integers as input,
        // and using the elements of the input array you have to form the largest number.
        //Input : {2,1,35}     //Output : 3521
//        Input : {1,2,3,4,5} //Output : 54321
//        Input : {2,1,35}   // Output : 3521
//        I/p : {1,12, 15, 5}
        int[] arr= {1,12,15,5};
        String[] arr2 = new String[arr.length];

        for(int i = 0; i<arr.length; i++){
            arr2[i] = String.valueOf(arr[i]);
        }

        for(int i=0; i<arr2.length; i++){ // 3 //11
            for(int j=i+1; j<arr2.length; j++ ){ // j =1 -> 11
                if((arr2[j] +arr2[i]).compareTo(arr2[i]+arr2[j])>0){ // arr[1] +arr[0]  // 11+3 // 3+11
                    String temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s: arr2){
            sb.append(s);
        }
//        while(sb.charAt(0) == '0' && sb.length() >1){
//            sb.deleteCharAt(0);
//        }

        System.out.println(sb.toString());
    }
}
