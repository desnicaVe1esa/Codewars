package kyu_6.statistics_for_an_athletic_association.java;

import java.util.Arrays;

public class Stat {

    public static String stat(String strg) {
        String[] times = strg.split(", |,");
        int[] timesInSeconds = fillTimeInSeconds(times);
        String range = range(timesInSeconds);
        String average = average(timesInSeconds);
        String median = median(timesInSeconds);
        return range + " " + average + " " + median;
    }

    public static int[] fillTimeInSeconds(String[] times) {
        int[] result = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            result[i] = converter(times[i]);
        }
        return result;
    }

    public static int converter(String time) {
        Integer[] digits = Arrays
                .stream(time.split("\\|"))
                .map(Integer::valueOf)
                .toList()
                .toArray(new Integer[0]);
        return digits[0] * 3600 + digits[1] * 60 + digits[2];
    }

    public static String range(int[] timesInSeconds) {
        int range = Arrays.stream(timesInSeconds).max().getAsInt() - Arrays.stream(timesInSeconds).min().getAsInt();
        return "Range: " +
                (range / 3600 < 10 ? "0" + range / 3600 : range / 3600) +
                "|" +
                ((range % 3600) / 60 < 10 ? "0" + (range % 3600) / 60 : (range % 3600) / 60) +
                "|" +
                (range % 60 < 10 ? "0" + range % 60 : range % 60);
    }

    public static String average(int[] timesInSeconds) {
        int average = Arrays.stream(timesInSeconds).sum() / timesInSeconds.length;
        return "Average: " +
                (average / 3600 < 10 ? "0" + average / 3600 : average / 3600) +
                "|" +
                ((average % 3600) / 60 < 10 ? "0" + (average % 3600) / 60 : (average % 3600) / 60) +
                "|" +
                (average % 60 < 10 ? "0" + average % 60 : average % 60);
    }

    public static String median(int[] timesInSeconds) {
        int median = 0;
        Arrays.sort(timesInSeconds);
        if (timesInSeconds.length % 2 != 0) {
            median = timesInSeconds[timesInSeconds.length / 2];
        } else {
            median = (timesInSeconds[timesInSeconds.length / 2] + timesInSeconds[(timesInSeconds.length / 2) - 1]) / 2;
        }
        return "Median: " +
                (median / 3600 < 10 ? "0" + median / 3600 : median / 3600) +
                "|" +
                ((median % 3600) / 60 < 10 ? "0" + (median % 3600) / 60 : (median % 3600) / 60) +
                "|" +
                (median % 60 < 10 ? "0" + median % 60 : median % 60);
    }
}

