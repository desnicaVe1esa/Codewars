package kyu_6.positions_average.java;

public class PositionAverage {

    public static double posAverage(String s) {
        long positions = 0;
        long matchCount = 0;

        String[] strings = s.split(", ");

        for (int i = 0; i < strings.length - 1; i++)
            for (int j = i + 1; j < strings.length; j++) {
                for (int k = 0; k < strings[j].length(); k++) {
                    positions++;
                    if (strings[i].charAt(k) == strings[j].charAt(k)) {
                        matchCount++;
                    }
                }
            }

        return (double) matchCount / (double) positions * 100.0;
    }
}