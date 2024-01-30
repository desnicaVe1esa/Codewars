package kyu_8.sort_and_star.java;

import java.util.Arrays;

public class SortAndStar {

    public static String twoSort(String[] s) {
        String word = Arrays.stream(s).sorted().toList().get(0);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append(word.charAt(i)).append("***");
        }
        return result.substring(0, result.length() - 3);
    }
}
