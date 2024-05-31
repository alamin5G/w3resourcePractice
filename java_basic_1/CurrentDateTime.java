package java_basic_1;

import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

        Date d = new Date();
        d.setTime(System.currentTimeMillis());
        System.out.format("Current Date time: %tc%n", d.getTime());
    }
}
