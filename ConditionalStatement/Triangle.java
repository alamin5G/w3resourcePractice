package ConditionalStatement;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        System.out.println("Enter the triangle length");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        triangle1(a);
        triangle2(a);
        triangle3(a);
        triangle4(a);
        triangle5(a);


    }

    public static void triangle4(int n){
        //triangle 4
        System.out.println();
        System.out.println("Triangle 4: ");
        for (int i = n; i >=1 ; i--) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle3(int n){
        //triangle 3
        System.out.println();
        System.out.println("Triangle 3: ");
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print( i%j + " ");
            }
            System.out.println();
        }
    }

    public static void triangle2(int a){
        //triangle 2
        System.out.println();
        System.out.println("Triangle 2: ");
        for (int i = 1; i <=a ; i++) {
            for (int j = i; j <a ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print( "*" + " ");
            }
            System.out.println();
        }
        for (int i = a-1; i >=1; i--) {

            for (int j = i; j < a ; j++) {
                System.out.print( " ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void triangle1(int a){
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

    public static void triangle5(int a){
        System.out.println();
        System.out.println("Triangle 5: ");
        for (int i = 1; i <=a ; i++) {
            for (int j = i; j <a ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
