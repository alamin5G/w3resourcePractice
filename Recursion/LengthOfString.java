package Recursion;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The length of the string is: " + stringLength(s));
    }
    public static int stringLength(String s) {
        if (s.isEmpty()){
            return 0;
        }
        return 1 + stringLength(s.substring(1));
    }
}
