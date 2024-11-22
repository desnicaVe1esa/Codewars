package kyu_6.reducing_by_steps.java;

import java.util.function.BiFunction;

public class Operarray {

    public static long gcd(long x, long y) {
        if (x == 0) {
            return y;
        }
        return gcd(y % x, x);
    }
    public static long gcdi(long x, long y) {
        x = Math.abs(x);
        y = Math.abs(y);
        return gcd(x, y);
    }
    public static long lcmu(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return a * b / gcd(a , b);
    }
    public static long som(long a, long b) {
        return a + b;
    }
    public static long maxi(long a, long b) {
        return Math.max(a, b);
    }
    public static long mini(long a, long b) {
        return Math.min(a, b);
    }
    public static long[] operArray(BiFunction<Long, Long, Long> operator, long[] arr, long init) {
        long i = init;
        long[] result = new long[arr.length];
        for (int k = 0; k < arr.length; k++) {
            i = operator.apply(i, arr [k]);
            result[k] = i;
        }
        return result;
    }
}