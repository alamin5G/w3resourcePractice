package ConditionalStatement;

public class RightTriangle {
    public static void main(String[] args) {

        //right tri-angle

        System.out.println("Right triangle 1: ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("Right triangle 2: ");
        //right triangle
        for (int i = 1; i < 5; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


        System.out.println("Right triangle 3: ");
        //right triangle
        int c = 1;
        for (int i = 1; i < 5; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

    }
}
