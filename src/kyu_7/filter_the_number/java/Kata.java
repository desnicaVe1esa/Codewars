package kyu_7.filter_the_number.java;

public class Kata {
    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[a-zA-Z]*", ""));
    }
}