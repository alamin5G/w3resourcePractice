package java_basic_1;

import java.util.Scanner;

public class OctalToBinary {

    /**
     * by 2 step we can convert octal to binary
     * step-1: convert octal number to decimal number
     * step-2: convert decimal number to binary number
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();
        int octalInt = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(octalInt);
        System.out.println(binary);

    }
}
