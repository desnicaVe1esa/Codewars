package kyu_6.which_are_in.java;

import java.util.HashSet;
import java.util.Set;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> strings = new HashSet<>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    strings.add(s1);
                }
            }
        }
        return strings.stream().sorted().toList().toArray(new String[0]);
    }
}
