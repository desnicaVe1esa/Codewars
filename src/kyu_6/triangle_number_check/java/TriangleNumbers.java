package kyu_6.triangle_number_check.java;

public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        long calc = 8 * number + 1;
        long t = (long) Math.sqrt(calc);
        return t * t == calc;
    }
}
