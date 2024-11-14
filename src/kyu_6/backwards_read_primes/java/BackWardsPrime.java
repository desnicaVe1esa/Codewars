package kyu_6.backwards_read_primes.java;

public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {
        StringBuilder result = new StringBuilder();
        for (; start <= end; start++) {
            if (isPrime(start)) {
                if (isPrime(Long.parseLong(new StringBuilder(String.valueOf(start)).reverse().toString()))
                        && !String.valueOf(start).equals(new StringBuilder(String.valueOf(start)).reverse().toString())) {
                    result.append(start).append(" ");
                }
            }
        }
        return result.toString().trim();
    }

    public static boolean isPrime(long n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5, w = 2;
        while ((long) i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i += w;
            w = 6 - w;
        }
        return true;
    }
}

