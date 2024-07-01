package Recursion;

import java.util.Scanner;

public class ExponentialOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter base number");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter exponent");
        int power = sc.nextInt();
        System.out.println("The result is : " + exponential(base, power));
    }

    public static int exponential(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        int a = base * exponential(base, exponent - 1);
        return a;
    }
}
