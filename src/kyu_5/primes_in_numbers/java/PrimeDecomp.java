package kyu_5.primes_in_numbers.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrimeDecomp {

    public static String factors(int n) {
        List<Integer> primes = getPrimes(n);
        return getResult(primes);
    }

    public static String getResult(List<Integer> primes) {
        StringBuilder result = new StringBuilder();
        List<Map.Entry<Integer, Long>> preparedForResult = primes
                .stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).toList();
        for (Map.Entry<Integer, Long> integerLongEntry : preparedForResult) {
            if (integerLongEntry.getValue() > 1) {
                result.append("(").append(integerLongEntry.getKey())
                        .append("**").append(integerLongEntry.getValue()).append(")");

            } else {
                result.append("(").append(integerLongEntry.getKey()).append(")");

            }
        }
        return result.toString();
    }

    public static List<Integer> getPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int digit = 0;
        while (n > 1) {
            digit++;
            while (n % digit == 0 && isPrime(digit)) {
                n /= digit;
                primes.add(digit);
            }
        }
        return primes;
    }

    public static boolean isPrime(int digit) {
        if (digit <= 1) {
            return false;
        }
        for (int i = 2; i * i <= digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }
}