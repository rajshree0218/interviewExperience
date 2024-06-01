package org.example.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {10,24,89,3,20};
        for(int num : arr){
            System.out.print(num+" ");
        }

        int startIndex = 0;
        int endIndex = arr.length-1;
        while(startIndex<endIndex){
            int temp = arr[startIndex];
            arr[startIndex]= arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

        System.out.println();
        for(int num : arr){
            System.out.print(num+" ");
        }

        int[] originalArray = {1, 2, 3, 4, 5};
        int length = originalArray.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = originalArray[length - 1 - i];
        }

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }


        int[] originalAr = {1, 2, 3, 4, 5};

        int[] reversedArr = Arrays.stream(originalAr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }

        test(null);
    }
    private int data=0;

//    public static void test(String str){}
    public static void test(Object str){
        class Name{
            private void test() {
                System.out.println();
            }
        }
    }
    public static void test(Integer str){}

    interface tes432{}
}

interface Test{
    interface Test1{
         void method();
    }
    class AA{
        public static int data;
        public void methodA( int d){
            data +=d;
            System.out.println("workiing A"+data);
        }
    }
}
class ConcreteTest extends Test.AA implements Test.Test1 {
    @Override
    public void method(){
        System.out.println("workiing");
    }
}

class MainTest2{

    public static void main(String[] args) {
        Test.Test1 obj = new ConcreteTest();
        Test.AA ob = new ConcreteTest();
        Test.AA.data=10;
        obj.method();
        ob.methodA(5);

        Map<String, String> map = new HashMap<>();
        int a;
//        if(a=20){System.out.println("hello");}


    }
}