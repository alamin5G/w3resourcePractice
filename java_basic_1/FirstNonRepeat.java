package java_basic_1;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeat {

    public static void main(String[] args) {
        String st = "google";
        System.out.println("The string is: " + st);
        System.out.println("first non repeating character is : " + firstNonRepeatingChar(st));
    }

    public static int firstNonRepeatingChar(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
