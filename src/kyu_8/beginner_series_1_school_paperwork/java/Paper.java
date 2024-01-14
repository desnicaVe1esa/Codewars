package kyu_8.beginner_series_1_school_paperwork.java;

public class Paper {
    public static int paperWork(int n, int m) {
        return m <= 0 || n <= 0 ? 0 : n * m;
    }
}
