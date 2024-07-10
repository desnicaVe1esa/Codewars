package kyu_7.all_unique.java;

import java.util.HashSet;
import java.util.Set;

public class Kata {
    public static boolean hasUniqueChars(String str) {
        Set<Character> prepared = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            prepared.add(str.charAt(i));
        }
        return prepared.size() == str.length();
    }
}
