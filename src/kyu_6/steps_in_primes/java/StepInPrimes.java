package kyu_6.steps_in_primes.java;

class StepInPrimes {

    public static long[] step(int g, long m, long n) {
        for (long i = m; i <= n; i++) {
            if (isPrime(i) && isPrime(i + g)) {
                return new long[]{i, i + g};
            }
        }
        return null;
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}