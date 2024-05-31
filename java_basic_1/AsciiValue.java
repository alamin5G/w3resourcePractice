package java_basic_1;

import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character or a number or a symbol: ");
        String s = sc.nextLine();
        int ascii = s.charAt(0);
        System.out.println("The ASCII value of " + s.charAt(0) + " is :" + ascii);
    }
}
