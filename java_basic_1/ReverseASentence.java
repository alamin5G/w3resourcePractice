package java_basic_1;

import java.util.Arrays;

public class ReverseASentence {
    public static void main(String[] args){
        String st = "The quick brown fox jumps over the lazy dog";

        String[] word = st.split(" ");
        StringBuilder reverseWord = new StringBuilder();
        for (int i = word.length-1; i>=0 ; i--) {
            reverseWord.append(word[i]);
            if (i!=0){
                reverseWord.append(" ");
            }
        }

        System.out.println(reverseWord);

    }
}
