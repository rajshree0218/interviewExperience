package org.example.interview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArmStrongNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int temp;
            int total = 0;
            System.out.println("Ënter 3 Digit Number : ");

            int num = sc.nextInt();

            //with java 8
            int sumOfPowers = IntStream.of(String.valueOf(num).chars().map(Character::getNumericValue).toArray())
                    .map(digit -> (int) Math.pow(digit, String.valueOf(num).length()))
                    .sum();
            if(sumOfPowers == num)
                System.out.println(num + " is an armstrong");
            else System.out.println(num + "is not an armstrong");

            // without java8
            int number = num;
            for(; number!=0; number/=10){
                temp = number%10;
                System.out.println(number + " : "+Math.pow(total, num));
                total = total + temp * temp * temp;

            }
            if(total== num)
                System.out.println(num + " is an armstrong");
            else System.out.println(num + "is not an armstrong");

        }
    }
}
