import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = input.nextInt();

        int orgNum = a;
        int sum = 0;
        int rem = 0;
        while (a!=0) {
            rem = a%10;
            sum = sum + rem;
            a = a / 10;
        }

        System.out.println("The sum of the digit " + orgNum + " is " + sum);

    }
}
