package kyu_7.is_it_negative_zero.java;

public class NegativeZeroValidator {
    public static boolean isNegativeZero(float n) {
        return Float.floatToIntBits(n) == 0x80000000;
    }
}
