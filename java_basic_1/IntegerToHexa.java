package java_basic_1;

import java.util.Scanner;
import java.util.Stack;

public class IntegerToHexa {

    Stack<Character> msb = new Stack<>();

    int hexaBase = 16;
    public Stack<Character> integerToHexa(int num) {

        while (num != 0) {
            int remainder = num % hexaBase;
            switch (remainder){
                case 10:
                    msb.push('A');
                    break;
                    case 11:
                        msb.push('B');
                        break;
                        case 12:
                            msb.push('C');
                            break;
                            case 13:
                                msb.push('D');
                                break;
                                case 14:
                                    msb.push('E');
                                    break;
                                    case 15:
                                        msb.push('F');
                                        break;
                default:
                    char c = Integer.toString(remainder).toCharArray()[0];
                    msb.push(c);
                    break;
            }
            num /= hexaBase;
        }

        return msb;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        String hex = Integer.toHexString(num);
        System.out.println("hexa decimal: "+hex);

        IntegerToHexa intToHexa = new IntegerToHexa();
        Stack<Character> msb = new Stack<>();
        msb = intToHexa.integerToHexa(num);
        int size = msb.size();
        for (int i = 0; i <size; i++) {
            if (msb.peek() != null || !msb.isEmpty()) {
                System.out.print(msb.pop());
            }
        }



    }
}
