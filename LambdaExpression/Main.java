package LambdaExpression;


public class Main {
    public static void main(String[] args) {
        SumCalc sumCalc = Integer::sum;

        //oe
        SumCalc sum = (x, y) -> x + y;
        System.out.println("sum - > 5 + 6 = " + sumCalc.sum(5, 6));
        int total = sumCalc.sum(5, 6);
        System.out.println("sum = 5 + 6 = " + total);

        System.out.println("Checking string length");

        CheckString string = String::isEmpty;
        String st = "My name is Alamin";
        boolean b  = string.checkString(st);
        System.out.println("is it empty string? " + b);


        System.out.println();



    }
}
