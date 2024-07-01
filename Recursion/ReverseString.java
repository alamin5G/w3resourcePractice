package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter an string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The reversed string is: " + reverseString(s, "", 0, s.length()-1));
    }

    public static String reverseString(String s, String rev, int start, int end) {
        if (s.isEmpty()) {
            return "";
        }

        if (start <= end) {
            rev = rev + reverseString(s, String.valueOf(s.charAt(end)), start, end-1);

        }
        return rev;
    }
}
