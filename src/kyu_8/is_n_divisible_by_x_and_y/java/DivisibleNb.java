package kyu_8.is_n_divisible_by_x_and_y.java;

public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
       return n % x == 0 && n % y == 0;
    }
}
