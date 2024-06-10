package kyu_8.sum_of_multiples.java;

public class Kata {
    public static long sumMul(int n, int m) {
        if (n < 1 || m < 1) {
            throw new IllegalArgumentException();
        } else if (n > m) {
            return 0;
        }
        long result = 0;
        int incr = n;
        do {
            result += n;
            n += incr;
        } while (n < m);
        return result;
    }
}
