package kyu_6.evil_autocorrect_prank.java;

public class Kata {
    public static String autocorrect(String input) {
        return input.replaceAll(
                "(?<![a-z0-9])you+(?![a-z0-9])" +
                "|(?<![a-z0-9])u(?![a-z0-9])" +
                "|(?<![a-z0-9])You+(?![a-z0-9])",

                "your sister");
    }
}
