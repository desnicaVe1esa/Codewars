package kyu_7.power_of_two.java;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}