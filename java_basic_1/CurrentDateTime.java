package java_basic_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDateTime {
    public static void main(String[] args) {
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

        Date d = new Date();
        d.setTime(System.currentTimeMillis());
        System.out.format("Current Date time: %tc%n", d.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT+5")));
        System.out.println("Current Date time: " + sdf.format(d));
    }
}
