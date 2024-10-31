package kyu_7.unlucky_days.java;

import java.util.Calendar;
import java.util.Date;

public class Kata {
    public static int unluckyDays(int year) {
        Calendar calendar = Calendar.getInstance();
        Date date;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            calendar.set(year, month, 13);
            date = calendar.getTime();
            if (date.getDay() == 5) {
                count++;
            }
        }
        return count;
    }
}
