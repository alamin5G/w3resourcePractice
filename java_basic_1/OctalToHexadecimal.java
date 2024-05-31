package java_basic_1;

import java.util.Scanner;

public class OctalToHexadecimal {

    /**
     * by 2 step we can convert octal to hexadecimal
     * step-1: convert octal number to decimal number
     * step-2: convert decimal number to hexadecimal number
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an octal number: ");
        String octal = sc.nextLine();
        int octalInt = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(octalInt);
        System.out.println(hex);
    }
}
