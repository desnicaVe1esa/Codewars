package kyu_6.sequences_and_series.java;

public class Sequence {

    public static long getScore(long n) {
        long result = 0;

        for (int i = 0; i < n; i++) {
            result += 50L * (i + 1);
        }
        return result;
    }
}
