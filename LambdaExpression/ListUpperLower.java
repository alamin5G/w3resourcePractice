package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class ListUpperLower {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alamin", "Rakib", "Nuha", "ARAFAT");
        System.out.println("Original list: " + list);

        List<String> lower = list.stream().map(String::toLowerCase).toList();
        System.out.println("lowercase list: " + lower);
        List<String> upper = list.stream().map(String::toUpperCase).toList();
        System.out.println("uppercase list: " + upper);
    }
}
