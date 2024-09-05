package kyu_8.find_the_integral;

public class Kata {

    public static String integrate(int coefficient, int exponent) {
        return (coefficient / (exponent + 1)) + "x^" + (exponent + 1);
    }
}
