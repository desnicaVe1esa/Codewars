package kyu_5.gap_in_primes.java;

import java.util.ArrayList;
import java.util.List;

class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        long[] result = new long[2];
        List<Long> primes = new ArrayList<>();
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        for (int i = 0; i < primes.size(); i++) {
            try {
                if (primes.get(i + 1) - primes.get(i) == g) {
                    result[0] = primes.get(i);
                    result[1] = primes.get(i + 1);
                    break;
                }
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
        return result;
    }

    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}