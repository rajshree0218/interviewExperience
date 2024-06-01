package org.example.interview;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    private static int fibonacci(int num) {
        if(num<=1) return num;
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
