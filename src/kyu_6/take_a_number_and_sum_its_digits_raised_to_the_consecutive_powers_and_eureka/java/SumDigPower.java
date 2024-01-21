package kyu_6.take_a_number_and_sum_its_digits_raised_to_the_consecutive_powers_and_eureka.java;

import java.util.ArrayList;
import java.util.List;

class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long num = a; num <= b; num++) {
            if (isEureka(num)) {
                result.add(num);
            }
        }

        return result;
    }

    private static boolean isEureka(long num) {
        String numStr = Long.toString(num);
        long sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            sum += Math.pow(Character.getNumericValue(numStr.charAt(i)), i + 1);
        }

        return sum == num;
    }
}
