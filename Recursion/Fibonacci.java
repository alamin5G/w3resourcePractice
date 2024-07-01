package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the Nth fibonacci number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Nth fibonacci is " + fibonacci(n));

    }
    public static int fibonacci(int n) {
        if( n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
