package kyu_8.remove_first_and_last_character.java;

public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
