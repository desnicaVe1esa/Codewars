package kyu_8.beginner_series_number_2_clock.java;

class Clock {
    public static int Past(int h, int m, int s) {
        return (s * 1_000) + (m * 60_000) + (h * 3_600_000 );
    }
}