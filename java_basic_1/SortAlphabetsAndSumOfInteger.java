package java_basic_1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortAlphabetsAndSumOfInteger {
    public static void main(String[] args) {
        String st = "AND456HSE8";
        System.out.println(sortAlphabetsAndSumOfInteger(st.toCharArray()));

    }
    public static String sortAlphabetsAndSumOfInteger(char[] chars) {
        StringBuilder st = new StringBuilder();
        int sum = 0;
        for (char aChar : chars) {
            boolean c = Character.isLetter(aChar);

            sum += Character.isDigit(aChar) ? aChar - '0' : 0;

            if (c) {
                st.append(aChar);
            }

        }
        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {
                if (st.charAt(i) > st.charAt(j)) {
                    char temp = st.charAt(i);
                    st.setCharAt(i, st.charAt(j));
                    st.setCharAt(j, temp);
                }
            }
        }
        return st.append(sum).toString();

    }
}
