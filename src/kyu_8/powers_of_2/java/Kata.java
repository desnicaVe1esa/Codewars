package kyu_8.powers_of_2.java;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static long[] powersOfTwo(int n) {
        List<Long> preparedResult = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            preparedResult.add((long) Math.pow(2, i));
        }
        long[] result = new long[preparedResult.size()];
        for (int i = 0; i < preparedResult.size(); i++) {
            result[i] = preparedResult.get(i);
        }
        return result;
    }
}