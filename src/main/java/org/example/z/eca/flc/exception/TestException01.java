package org.example.z.eca.flc.exception;

import java.util.Arrays;

public class TestException01 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        int a=10,b=5,c=0;
        try{
            arr[0] = 5;
            arr[1] = 5;
            arr[2] = 5;
//            arr[3] = 5;
            c = a/b;
            System.out.println("arr :: "+ Arrays.toString(arr));
            for (int i:arr){
                System.out.println(i+" ");
            }
            System.out.println("\nc :: "+c);
            throw new RuntimeException();
        } catch (ArithmeticException e){
            System.out.println("Divide by zero not allowed !!");
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Check the array index !!");
        }catch (Exception e){
            System.out.println(e.getMessage()+" Occurred !!");
        } finally {
            System.out.println("finally block executed !!");

        }
    }
}
