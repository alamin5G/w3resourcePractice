package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class AvgOfDouble {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(15.00, 16.52, 18.00, 17.55, 66.31, 1.67);
        System.out.println("Double List: " + list);
        double avg = list.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.printf("Avg: %.2f", avg);



    }
}
