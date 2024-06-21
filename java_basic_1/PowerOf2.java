package java_basic_1;

import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(powerOf2(n));
        System.out.println("Another formula : ");
        System.out.println(anotherPowerOf2(n));

    }
    public static String powerOf2(int n) {
        int c = 0;

        while (n != 0) {
            c++;
            n = n &(n-1);
        }

        if (c==1){
            return "power of 2";
        }else {
            return "not power of 2";
        }
    }

    public static String anotherPowerOf2(int n) {
        int c = 0;
        String binary = Integer.toBinaryString(n);
        int left = 0;
        int right = binary.length()-1;
        while (left < right) {
            if (binary.charAt(left) == '1' || binary.charAt(right) == '1') {
                c++;
            }
            left++;
            right--;

            if (c>1){
                return "not power of 2";
            }
        }
        return "power of 2";
    }
}
