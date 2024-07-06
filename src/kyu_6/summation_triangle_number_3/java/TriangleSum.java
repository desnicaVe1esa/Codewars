package kyu_6.summation_triangle_number_3.java;

public class TriangleSum {
    public static long getSum(int n) {
        long p = n >> 1;
        long q = n % 2;
        return -(p + 2 * q - 1) * (p + q + 1) * (p + q + 1);
    }
}