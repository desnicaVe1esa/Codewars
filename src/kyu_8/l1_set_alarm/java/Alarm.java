package kyu_8.l1_set_alarm.java;

public class Alarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}