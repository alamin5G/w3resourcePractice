package java_basic_1;

import java.util.Scanner;
import java.util.Stack;

public class IntegerToBinary {

    public Stack<Integer> msb = new Stack<>();
    int binaryBase = 2;
    public Stack<Integer> integerToBinary(int num) {
        while (num != 0) {
            int rem = num % binaryBase;
            msb.push(rem);
            num = num/binaryBase;
        }

        return msb;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Binary number: " + Integer.toBinaryString(num));

        IntegerToBinary obj = new IntegerToBinary();
        Stack<Integer> msb = obj.integerToBinary(num);
        int size = msb.size();
        for(int i = 0; i < size; i++) {
            if (msb.peek() != null || !msb.isEmpty()) {
                System.out.print(msb.pop() + "");
            }
        }
    }
}
