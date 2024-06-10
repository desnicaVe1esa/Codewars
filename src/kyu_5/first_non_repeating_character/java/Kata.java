package kyu_5.first_non_repeating_character.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Kata {
    public static String firstNonRepeatingLetter(String s) {
        List<Map.Entry<String, Integer>> preparedResult = Arrays.stream(s.toLowerCase().split(""))
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() == 1)
                .toList();
        String[] symbols = s.split("");
        for (String symbol : symbols) {
            for (Map.Entry<String, Integer> stringIntegerEntry : preparedResult) {
                if (symbol.equalsIgnoreCase(stringIntegerEntry.getKey())) {
                    return symbol;
                }
            }
        }
        return "";
    }
}