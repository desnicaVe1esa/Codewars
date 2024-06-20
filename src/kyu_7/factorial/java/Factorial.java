package kyu_7.factorial.java;

public class Factorial {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        return n * factorial(n - 1);
    }
}