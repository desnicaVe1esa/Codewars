package kyu_6.camelcase_method.java;

public class Solution {
    public static String camelCase(String str) {
        String[] words = str.trim().split("\\s+");
        if (words.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            } else {
                result.append(word.toUpperCase());
            }
        }

        return result.toString();
    }
}
