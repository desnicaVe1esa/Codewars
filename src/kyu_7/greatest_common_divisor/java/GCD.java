package kyu_7.greatest_common_divisor.java;

public class GCD {
    public static int compute(int x, int y) {
        return y == 0 ? x : compute(y, x % y);
    }
}
