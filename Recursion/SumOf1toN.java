package Recursion;

import java.util.Scanner;

public class SumOf1toN {
    public static void main(String[] args) {
        System.out.println("Enter N digit that you up to sum up:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOf1toN(n);
        System.out.println(sum);

    }
    public static int sumOf1toN(int n) {
        if (n<1){
            return 0;
        }

        return n + sumOf1toN(n-1);
    }
}
