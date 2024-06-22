package Enum;

public class Main {
    public static void main(String[] args) {
        System.out.println("What do you want to do?");
        System.out.println("What day is today?");
        DaysOfWeek today = DaysOfWeek.Saturday;
        System.out.println(today);
        System.out.println("Which month is today?");
        Months currentMonth = Months.JUNE;
        System.out.println(currentMonth);
        System.out.println("Which year is today?");
    }
}
