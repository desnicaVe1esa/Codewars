package kyu_7.factorial_1.java;

public class Factorial {
    public static long factorial(int n) {
        long result = 1;
        int multiply = n;
        for (int i = 1; i <= n; i++) {
            result *= multiply;
            multiply--;
        }
        return result;
    }
}