package java_basic_1;

public class InsertWordIntoMiddle {

    public static void main(String[] args) {
        String string = "Hello World";
        String insertWord = "Jeba's ";

        String result = string.substring(0, 6) + insertWord + string.substring(6);
        System.out.println(result);
    }
}
