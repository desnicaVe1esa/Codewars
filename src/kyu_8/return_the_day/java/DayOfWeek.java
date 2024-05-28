package kyu_8.return_the_day.java;

public class DayOfWeek {

    public static String getDay(int n) {
        return n == 1 ? "Sunday" :
               n == 2 ? "Monday" :
               n == 3 ? "Tuesday" :
               n == 4 ? "Wednesday" :
               n == 5 ? "Thursday" :
               n == 6 ? "Friday" :
               n == 7 ? "Saturday" : "Wrong, please enter a number between 1 and 7";
    }

}