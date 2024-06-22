package java_basic_1;

import java.util.Scanner;

public class CountTheSumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.nextLine();
        System.out.print("Enter an integer: ");

        int number2 = input.nextInt();
        int sum = number2 + number;

        int digit = (int) Math.floor(Math.log10(sum)+1);
        System.out.println(digit);

    }
}
