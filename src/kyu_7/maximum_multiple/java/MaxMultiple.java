package kyu_7.maximum_multiple.java;

public class MaxMultiple {
    public static int maxMultiple(int divisor, int bound) {
        while (bound % divisor != 0) {
            bound--;

        }
        return bound;
    }
}
