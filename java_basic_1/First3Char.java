package java_basic_1;

import java.util.Scanner;

public class First3Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        if (s.length() <= 3){
            System.out.println("###");
        }
        else {
            System.out.println(s.substring(0, 3));
        }
    }
}
