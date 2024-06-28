package kyu_8.string_templates_bug_fixing_number_5.java;

public class Kata {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}