package java_basic_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetterAndOthers {

    public Map<String, Integer> countLetterNumberSpaceOthers(String st){

        Map<String, Integer> result = new HashMap<String, Integer>();
        char[] chars = st.toCharArray();

        for (int i = 0; i < 1; i++) {
            result.put("Space", 0);
            result.put("Letter", 0);
            result.put("Digit", 0);
            result.put("Other", 0);
        }

        for (Character c : chars) {
            if (Character.isSpaceChar(c)) {
                result.put("Space", result.get("Space") + 1);
            }else if (Character.isLetter(c)){
                result.put("Letter", result.get("Letter") + 1);
            }else if (Character.isDigit(c)){
                result.put("Digit", result.get("Digit") + 1);
            }else {
                result.put("Other", result.get("Other") + 1);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a string: ");
       // String s = sc.nextLine();
        String other = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        CountLetterAndOthers c = new CountLetterAndOthers();

        Map<String, Integer> result = c.countLetterNumberSpaceOthers(other);
        for(Map.Entry<String, Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
