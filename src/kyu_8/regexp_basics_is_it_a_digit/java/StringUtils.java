package kyu_8.regexp_basics_is_it_a_digit.java;

public class StringUtils {

    public static boolean isDigit(String s) {
        return s.matches("\\d");
    }
}