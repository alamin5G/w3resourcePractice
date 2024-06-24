package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 43, 5, 56, 7,65, 43, 32, 4,3,5,63, 223, 43, 1, 4, 56, 6, 2);
        System.out.println("Original List: " + list);

        List<Integer> duplicateFree = list.stream().distinct().toList();

        //list.stream().distinct().forEach(duplicateFree::add);

        System.out.println("Duplicate Free List: " + duplicateFree);

    }
}
