package org.example.interview;

import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            boolean isPrime = true;
            System.out.println("Enter Any Number : ");

            int num = sc.nextInt();
            for(int i=2;i<=num;i++){
                int temp = num %i;
                if(temp == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                System.out.println(num + " is a Prime");
            else
                System.out.println(num + " is not a Prime");
        }
    }
}
