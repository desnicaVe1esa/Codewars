package kyu_5.integers_recreation_one.java;


import java.util.stream.LongStream;

public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {

        String result = "[";
        for (long i = m; i <= n; i++) {
            if (Math.round(Math.sqrt(sumOfSquareDivisors(i))) == Math.sqrt(sumOfSquareDivisors(i))) {
                result += "[" + i + ", " + sumOfSquareDivisors(i) + "], ";
            }
        }
        return result.length() > 1 ? result.substring(0, result.length() - 2) + "]" : "[]";
    }

    public static long sumOfSquareDivisors(long n) {
        return LongStream.range(1, n + 1).filter(i -> n % i == 0).map(i -> i * i).sum();
    }
}

