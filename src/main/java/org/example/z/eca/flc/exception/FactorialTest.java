package org.example.z.eca.flc.exception;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int num = Integer.parseInt(sc.nextLine());
        try {
            calculateFactorial(num);
        } catch (MaxRangeExceedException | MinRangeExceedException e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.println("Resource cleaned up");
        }
    }
    private static void calculateFactorial(int num)
    throws MaxRangeExceedException, MinRangeExceedException{
        int fact = 1;
        if(num<1)
            throw new MinRangeExceedException(num);
        if(num>7)
            throw new MaxRangeExceedException(num);

        for(int  i = 1; i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
