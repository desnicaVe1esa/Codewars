package kyu_7.fibonacci.java;

public class Fibonacci {
    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }
        int[] fibonacci = new int[n * 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci[n];
    }
}
