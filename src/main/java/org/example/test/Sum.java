package org.example.test;

public class Sum {
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
    }

    private static int sum(int n){
        return (n==0) ? 0:n+sum(n-1);
    }
}
