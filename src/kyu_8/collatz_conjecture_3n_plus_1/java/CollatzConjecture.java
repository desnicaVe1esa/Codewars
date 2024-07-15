package kyu_8.collatz_conjecture_3n_plus_1.java;

public class CollatzConjecture {
    public static int hotpo(int n) {
        if (n == 1) {
            return 0;
        }
        int result = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            result++;
        }
        return result;
    }
}