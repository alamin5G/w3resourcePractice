package java_basic_1;

import java.util.Scanner;

public class Add2BinaryNumbers {

    public String addBinary(String b1, String b2){

        StringBuilder binary1 = new StringBuilder(b1).reverse();
        StringBuilder binary2 = new StringBuilder(b2).reverse();

        int maxLength = (Math.max(binary1.length(), binary2.length()));

        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < maxLength; i++) {

            int bit1 = i < binary1.length() ? binary1.charAt(i) - '0' : 0;
            int bit2 = i < binary2.length() ? binary2.charAt(i) - '0' : 0;

            int sum = bit1 + bit2 + carry;

            int resultBit = sum % 2;

            carry = sum / 2;
            result.append(resultBit);
        }

        if (carry != 0){
            result.append(carry);
        }

        return result.reverse().toString();
    }


    //main method
    public static void main(String[] args) {

        System.out.print("Enter First Binary Number: ");
        Scanner sc = new Scanner(System.in);
        String b1 = sc.nextLine();
        System.out.print("Enter Second Binary Number: ");
        String b2 = sc.nextLine();
        Add2BinaryNumbers obj = new Add2BinaryNumbers();
        System.out.println(obj.addBinary(b1, b2));
        
    }
}
