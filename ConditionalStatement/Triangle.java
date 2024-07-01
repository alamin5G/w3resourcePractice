package ConditionalStatement;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        System.out.println("Enter the triangle length");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Triangle 1: ");

        for (int i = 1; i <=a ; i++) {
            //print the front spaces
            for (int j = i; j <a ; j++) {
                System.out.print(" ");
            }
            //print the number
            for (int j = 1; j <=i ; j++) {
                System.out.print("" + i + " ");
            }
            System.out.println();
        }
    }
}
