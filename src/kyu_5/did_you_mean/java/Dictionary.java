package kyu_5.did_you_mean.java;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        return Arrays.stream(words)
                .min((a, b) -> getSimilarPoint(a, to) - getSimilarPoint(b, to))
                .get();
    }

    private int getSimilarPoint(String a, String b) {
        return Math.max(a.length(), b.length()) - ((int) sameLettersLength(a, b));
    }

    private long sameLettersLength(String a, String b) {
        if (a.length() > b.length()) {
            return sameLettersLength(b, a);
        }

        return IntStream.rangeClosed(0, b.length() - a.length())
                .mapToLong(i -> IntStream.range(0, a.length()).filter(j -> a.charAt(j) == b.charAt(i + j)).count())
                .max()
                .orElse(0);
    }
}
