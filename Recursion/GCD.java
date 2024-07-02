package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int gcd = GCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is " + ((a*b)/gcd));
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        int rem = a % b;

        return GCD(b, rem);
    }
}
