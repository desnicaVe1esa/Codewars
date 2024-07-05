package kyu_6.summation_triangle_number_2.java;

public class TriangleSum {
    public static long getSum(int n) {
        long result = 0;
        for (long i = 1; i <= n + 1; i++) {
            result += i * (2 * i - 1) * (i * (2 * i - 1) % 2 == 0 ? -1 : 1);
        }
        return result;
    }
}