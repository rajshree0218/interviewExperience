package org.example.z_interview;

//Important Notes from Microsoft:
//• As professionals, we expect you will not 'copy and paste' from other sources or plagiarize your answers from the internet. Codility validates all candidate solutions for similar solutions and will flag those answers directly to Microsoft.
//• Attention to detail is key! Make sure to read the questions thoroughly and address ALL of the components.

//There are 2 tasks in the test. You can solve them in any order.
//There's no option to pause. Make sure you will not be interrupted for 60 minutes.
//Your solution(s) should consider all possible corner cases and handle large input efficiently. Passing the example test does not indicate that your solution is correct. The example test is not part of your final score.
//If you accidentally close your browser, use the invitation link to get back to your test.
//Hint: you can use your own IDE and use copy-paste, but make sure your solution compiles in Codility's environment.
//You can write your solution(s) in C, C#, C++, C++20, Dart, Go, Java 11, Java 8, JavaScript, Kotlin, Lua, Objective-C, PHP, Pascal, Perl, Python, Ruby, Scala, Swift, TypeScript or Visual Basic.
public class MicrosoftL1 {

    //You are given a record of the historical prices of an investment asset from the last N days. Analyze the record in order to calculate what could have been your maximum income. Assume you started with one asset of this type and could hold at most one at a time. You could choose to sell the asset whenever you held one. If you did not hold an asset at some moment, you could always afford to buy an asset (assume you had infinite money available).
    //
    //What is the maximum income you could make?
    //
    //Write a function:
    //
    //class Solution { public int solution(int[] A); }
    //
    //that, given an array A of length N representing a record of prices over the last N days, returns the maximum income you could make. As the result may be large, return its last nine digits without leading zeros (return the result modulo 1,000,000,000).
    //
    //Examples:
    //
    //1. Given A = [4, 1, 2, 3], the function should return 6. You could sell the product on the first day (for 4), buy it on the second (for 1) and sell it again on the last day (for 3). The income would be equal 4-1+3=6.
    //
    //2. Given A = [1, 2, 3, 3, 2, 1, 5], the function should return 7. You could sell the product when its value was 3, buy it when it changed to 1, and sell it again when it was worth 5.
    //
    //3. Given A = [1000000000, 1, 2, 2, 1000000000, 1, 1000000000], the function should return 999999998. The maximum possible income is 2999999998, whose last 9 digits are 999999998.
    //
    //Write an efficient algorithm for the following assumptions:
    //
    //* N is an integer within the range [1..200,000];
    //
    //⚫ each element of array A is an integer within the range [0..1,000,000,000)

    public static void main(String[] args) {
        MicrosoftL1 obj = new MicrosoftL1();
        int[] a1 = {4,1,2,3};
        System.out.println(obj.solution(a1));

        int[] a2 = {1,2,3,3,2,1,5};
        System.out.println(obj.solution(a2));

        int[] a3 = {1000000000, 1, 2, 2, 1000000000, 1, 1000000000};
        System.out.println(obj.solution(a3));
    }

    public int solution(int[] a){
        int max = a[0];
//        int buy = Integer.MAX_VALUE;
        int buy = Integer.MAX_VALUE;
        for(int price: a){
            buy = Math.min(buy, price);
            max = Math.max(max, price-buy);
        }
        return max % 1_000_000_000;
    }
}
