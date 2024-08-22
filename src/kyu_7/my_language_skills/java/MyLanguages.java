package kyu_7.my_language_skills.java;

import java.util.*;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        List<String> result = new ArrayList<>();
        results.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(f -> {
                    if (Integer.parseInt(String.valueOf(f).split("=")[1]) >= 60) {
                        result.add(String.valueOf(f).split("=")[0]);
                    }
                });
        Collections.reverse(result);
        return result;
    }
}
