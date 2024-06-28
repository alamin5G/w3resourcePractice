package StringIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MostFrequenciesLetter {
    public static void main(String[] args) {

        String s = "input";
        s = s.toLowerCase();

        int[] frequency = new int[256];

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
             boolean b = Character.isLetter(s.charAt(i));
             if (b){
                 frequency[c]++;
             }
        }

        List<String> ch = new ArrayList<>();
        List<Integer> feq = new ArrayList<>();
        for (int i = 97; i < frequency.length; i++) {
            if (frequency[i] != 0){
                ch.add(Character.toString(i));
                feq.add(frequency[i]);
            }
        }

        ArrayList<Integer> feqClone = (ArrayList<Integer>) new ArrayList<>(feq).clone();
        Collections.sort(feqClone);
        int data = feqClone.get(feqClone.size()-1);

        for (int i = 0; i < feq.size(); i++) {
            if (feq.get(i) >= data){
                System.out.print(ch.get(i));
            }
        }


    }
}
