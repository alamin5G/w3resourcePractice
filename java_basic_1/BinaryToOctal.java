package java_basic_1;

import java.util.Scanner;

public class BinaryToOctal {
    // Method to convert binary to octal
    public static String binaryToOctal(String binary) {
        int length = binary.length();
        int padding = (3 - (length % 3)) % 3;
        for (int i = 0; i < padding; i++) {
            binary = "0" + binary;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i += 3) {
            String group = binary.substring(i, i + 3);
            int octal = Integer.parseInt(group, 2);
            sb.append(octal);
        }


        return sb.toString();
    }



    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = scanner.nextLine();
        String octal = binaryToOctal(binary);
        System.out.println("Octal equivalent: " + octal);
        scanner.close();
    }
}

