package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOddFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 1, 6, 34, 64, 2, 17, 45, 47, 41, 22);
        System.out.println("Original List: " + numbers);
        List<Integer> even = numbers.stream().filter(x -> x%2==0).toList();
        System.out.println("Filtered List:(even): " + even);
        List<Integer> odd = numbers.stream().filter(x -> x%2!=0).toList();
        System.out.println("Filtered List:(odd): " + odd);



    }
}
