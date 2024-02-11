package kyu_8.count_by_x.java;

public class Kata {
    public static int[] countBy(int x, int n) {
        int[] result = new int[n];
        int put = 0;
        for (int i = 0; i < n; i++) {
            put += x;
            result[i] = put;
        }
        return result;
    }
}
