package java_basic_1;

import java.util.Scanner;

public class Concat2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String first = sc.nextLine();
        System.out.print("Enter Second String: ");
        String second = sc.nextLine();
        String concat = first.substring(1) + second.substring(1);
        System.out.println(concat);
    }
}
