public class Swap2Variable {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Before swaping a = " + a  +" and b = " + b);

        b = a + b;  // b  = 5 + 7 = (12)
        a = b - a;  // a = 12 - 5 = (7)
        b = b - a;  // b = 12 - 7 = (5)

        System.out.println("Before swaping a = " + a  +" and b = " + b);

    }
}
