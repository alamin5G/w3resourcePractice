package java_basic_1;

import java.util.Scanner;

public class OctalToDecimal {

    public int octalToDecimal(String octal) {
        int sum = 0;
        StringBuilder reverse = new StringBuilder(octal);
        reverse.reverse();
        for (int i = 0; i < reverse.length(); i++) {
            int value = reverse.charAt(i) - '0';
            int count = value * (int) Math.pow(8, i);
            sum += count;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal number: ");
        String octal = sc.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("The decimal number is " + decimal);

        OctalToDecimal ob = new OctalToDecimal();
        int decimal1 = ob.octalToDecimal(octal);
        System.out.println("The number is " + decimal1);
    }
}
