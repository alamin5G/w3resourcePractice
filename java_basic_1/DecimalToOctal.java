package java_basic_1;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToOctal {

    private Stack<Integer> stack = new Stack<Integer>();
    
    public Stack<Integer> decimalToOctal(int num) {

        //octal base
        int octalBase = 8;
        while (num != 0) {
            int rem = num % octalBase;
            stack.push(rem);
            num = num / octalBase;
        }
        return stack;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Octal : " +Integer.toOctalString(num));
        DecimalToOctal decimalToOctal = new DecimalToOctal();
        Stack<Integer> msb = decimalToOctal.decimalToOctal(num);
        int size = msb.size();
        for (int i = 0; i < size; i++) {
            if (msb.peek() != null || !msb.isEmpty()) {
                System.out.print(msb.pop() + "");
            }
        }

    }
}
