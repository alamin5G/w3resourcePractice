package java_basic_1;

import java.util.Scanner;

public class NextToLastWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.print("The Next to the Last Word is : ");
        System.out.println(words[words.length - 2]);
    }
}
