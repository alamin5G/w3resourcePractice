package java_basic_1;

import java.util.Scanner;

public class ExtractHalfOfEvenString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        if (s.length() % 2 == 0) {
            String st = s.substring(0, s.length() / 2);
            System.out.println(st);
        }else {
            System.out.println("String is not even");
        }
    }
}
