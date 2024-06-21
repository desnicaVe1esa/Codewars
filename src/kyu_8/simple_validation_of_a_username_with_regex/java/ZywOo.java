package kyu_8.simple_validation_of_a_username_with_regex.java;

public class ZywOo {
    public static boolean validateUsr(String s) {
        return s.matches("^([a-z0-9_]{4,16})$");
    }
}