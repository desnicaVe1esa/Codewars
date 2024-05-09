package kyu_7.form_the_minimum.java;

import java.util.HashSet;
import java.util.Set;

public class Minimum {
    public static int minValue(int[] values) {
        Set<Integer> integerSet = new HashSet<>();
        for (int digit : values) {
            integerSet.add(digit);
        }
        StringBuilder preparedResult = new StringBuilder();
        for (int digit : integerSet) {
            preparedResult.append(digit);
        }
        return Integer.parseInt(preparedResult.toString());
    }
}