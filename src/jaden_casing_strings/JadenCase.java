package jaden_casing_strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// ѕриводит первую букву слова к верхнему регистру

public class JadenCase {

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        }

        return Stream.of(phrase.trim().split("\\s+"))
                .map(JadenCase::toJadenCaseWord)
                .collect(Collectors.joining(" "));
    }

    public static String toJadenCaseWord(String word) {
        if (word == null || word.length() == 0) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
