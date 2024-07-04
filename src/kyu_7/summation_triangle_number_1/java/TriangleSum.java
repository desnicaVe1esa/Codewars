package kyu_7.summation_triangle_number_1.java;

public class TriangleSum {
    public static long getSum(int n) {
//        long result = 0;
//        for (long i = 1; i <= n + 1; i++) {
//            result += i * (2 * i - 1);
//        }
//        return result;
        return (n + 1L) * (n + 2L) * (4L * n + 3L) / 6L;
    }
}