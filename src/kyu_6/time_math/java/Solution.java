package kyu_6.time_math.java;


import java.util.Arrays;

public class Solution {
    public static String timeMath(final String time1, final String op, final String time2) {
        int[] time1Parser = timeParser(time1);
        int[] time2Parser = timeParser(time2);
        int seconds1 = Arrays.stream(time1Parser).reduce(Integer::sum).orElse(0);
        int seconds2 = Arrays.stream(time2Parser).reduce(Integer::sum).orElse(0);
        int operation = calculate(seconds1, seconds2, op);
        return result(operation);
    }

    public static int[] timeParser(String time) {
        String[] prepared = time.split(":");
        return new int[]{
                Integer.parseInt(prepared[0]) * 3600,
                Integer.parseInt(prepared[1]) * 60,
                Integer.parseInt(prepared[2])
        };
    }

    public static int calculate(int time1, int time2, String op) {
        return op.equals("+") ? time1 + time2 : time1 - time2;
    }

    public static String result(int operation) {
        int total = operation < 0 ? (23 * 3600 + 59 * 60 + 60) - Math.abs(operation) : operation;
        return formatTime(total / 3600 == 24 ? 0
                : total / 3600 > 24 ? (total / 3600) - 24
                : total / 3600) +
                ":" +
                formatTime((total % 3600) / 60) +
                ":" +
                formatTime(total % 60);
    }

    public static String formatTime(int time) {
        String timeToString = time + "";
        return timeToString.length() < 2 ? "0" + time : timeToString;
    }
}