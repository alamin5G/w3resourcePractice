package java_basic_1;

import java.util.Scanner;

public class BinaryToDecimal {

    public int binaryToDecimal(String binary) {
        char[] chars = binary.toCharArray();
        int length = chars.length;
        int[] b2Decimal = new int[length];
        int result = 1;
        int sum = 0;
        //b2Decimal[length-1] = chars[length-1] == '0' ? 0 : 1;
        for (int i = length-1; i >= 0; i--) {
            b2Decimal[i] = (chars[i] - '0')*result;
            result = result * 2;

            sum = sum + b2Decimal[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        String binary = sc.nextLine();
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        int result = binaryToDecimal.binaryToDecimal(binary);
        System.out.println("Decimal number is " + result );
    }
}
