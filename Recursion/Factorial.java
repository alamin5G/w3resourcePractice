package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter your factorial number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The factorial of " + n + " is " + factorial(n));

    }
    public static long factorial(int n) {
        if (n<=1) return 1;

        return n * factorial(n-1);
    }
}
