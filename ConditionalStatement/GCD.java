package ConditionalStatement;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("LCD of " + a + " and " + b + " is " + lcm(a, b, gcd));

    }

    public static int gcd(int a, int b) {
        while (b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static int lcm(int a, int b, int gcd) {
        return (a*b/gcd);
    }
}
