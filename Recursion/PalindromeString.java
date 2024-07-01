package Recursion;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter String to check palindrome");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Is Inputted String palindrome? " + isPalindrome(s, 0, s.length() - 1));

    }

    public static boolean isPalindrome(String st, int start, int end ) {
        if (st.isEmpty() || st.charAt(start) != st.charAt(end)){
            return false;
        }

       if (start < end) {
           isPalindrome(st, start + 1, end - 1);
       }
       return true;
    }
}
