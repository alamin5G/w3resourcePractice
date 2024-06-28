package StringIO;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();
        System.out.println("The longest substring is: ");
        longestSubString(string);
    }

    private static void longestSubString(String string) {
        String backup = string;
        String longestSubstring = "";
        int longestSubstringLength = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            char c = chars[i];
            if (!map.containsKey(c)) {
                map.put(c, i);
            }else{

                if (map.size()>longestSubstringLength) {
                    longestSubstring = backup.substring(longestSubstringLength, i);
                    longestSubstringLength = map.size();

                }
                map.clear();
            }
        }
        if (map.size()>longestSubstringLength) {
            longestSubstring = backup.substring(longestSubstringLength);

        }

        System.out.println(longestSubstring);
    }
}
