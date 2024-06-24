package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class SortListString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Rabaya", "Nuha", "Akter", "Alamin", "Nurul", "Amin", "Begum", "Amena");

        List<String> sortedList =stringList.stream().sorted().toList();
        System.out.println(sortedList);

    }
}
