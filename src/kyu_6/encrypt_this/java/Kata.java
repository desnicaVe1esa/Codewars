package kyu_6.encrypt_this.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
    public static String encryptThis(String text) {
        if (text.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() > 4) {
                final String helper = word.charAt(word.length() - 1) +
                        word.substring(2, word.length() - 1) +
                        word.charAt(1);
                result.append((int) word.charAt(0)).append(helper).append(" ");
            } else {
                result.append((int) word.charAt(0))
                        .append(Stream.of(word)
                                .map(string -> new StringBuilder(string.substring(1)).reverse())
                                .collect(Collectors.joining()))
                        .append(" ");
            }

        }
        return result.toString().trim();
    }
}

