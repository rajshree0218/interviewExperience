package org.example.interview;

import java.math.BigInteger;
import java.util.Scanner;

public class FindFactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        BigInteger factorial = BigInteger.ONE;
        if(num!=0 && num!=1){
            for(int i=2;i<=num;i++){
                factorial=factorial.multiply(BigInteger.valueOf(i));
            }
        }

        System.out.printf("%d! is %d", num, factorial);
        sc.close();
    }
}
