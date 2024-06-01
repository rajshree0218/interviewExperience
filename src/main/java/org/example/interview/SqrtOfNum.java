package org.example.interview;

public class SqrtOfNum {
    public static void main(String[] args) {
        // 4, o/p 2
        // 8, o/p : 2
        // 16 ,
        // 17, 4
        int num = 17;
        sqrt(num);
        // using binary search tree.
        System.out.println(sqrtByBST(num));
        System.out.println(squareRoot(num));

    }

    private static double sqrtByBST(int num){
        // using binary search tree.
        int i = 1;
        while(true){
            if(i*i == num)
                return i;

            else if(i*i>num)
                return decimalSqrt(num, i-1,i);
            i++;
        }
    }

    private static double decimalSqrt(int num, double i, double j) {
        double midValue = (i+j)/2;
        double square = midValue * midValue;
        double precision = 0.0000001;
        double diff = square - num;
        if(square==num || Math.abs(square-num)<0.0000001) // if(square == num || (diff>0 && diff < precision)
            return midValue;
        else if(square>num)
            return decimalSqrt(num,i, midValue);
        else
            return decimalSqrt(num,midValue, j);
    }

    private static double decimalSqrtWithoutAnyPredefinedMethod(int num, double i, double j) {
        double precision = 0.0000001;
        Math.abs(4);
        double midValue = (i + j) / 2;
        double square = midValue * midValue;
        double diff = square - num;
        if (diff == 0 || (diff > 0 && diff < precision))
            return midValue;
        else if (square > num)
            return decimalSqrtWithoutAnyPredefinedMethod(num, i, midValue);
        else
            return decimalSqrtWithoutAnyPredefinedMethod(num, midValue, j);
    }

    private static double squareRoot(double number) {

        //iterator variable
        int i = 1;
        while(true) {
            //for perfect square numbers
            if(i*i == number)
                return i;
            //for not perfect square numbers
            else if(i*i > number)
            //returns the value calculated by the method decimalSqrt()
                return decimalSqrt(number,i-1,i);
            //increments the variable i by 1
            i++;
        }
    }

    private static double decimalSqrt(double number, double i, double j) {
        //calculates the middle of i and j
        double midvalue = (i+j)/2;
        //finds the square of the midvalue
        double square = midvalue * midvalue;
        //compares the midvalue with square up to n decimal places
        if(square==number||Math.abs(square-number)<0.0000001)
            return midvalue;
        //if the square root belongs to second half
        else if(square>number)
            return decimalSqrt(number, i, midvalue);
        //if the square root belongs to first half
        else
            return decimalSqrt(number, midvalue, j);
    }

    private static void sqrt(int num) {
        double t;
        double sqrt = (double) num /2;
        do{
            t = sqrt;
            sqrt = (t+(num /t))/2;
        } while ((t-sqrt)!=0);
        int temp = (int) sqrt;
        System.out.println(sqrt); // 4.123105625617661
        System.out.println(temp); // 4
    }
}
