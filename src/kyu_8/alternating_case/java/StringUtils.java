package kyu_8.alternating_case.java;

public class StringUtils {

    public static String toAlternativeString(String string) {
        String[] strings = string.split("");
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals(strings[i].toUpperCase())) {
                strings[i] = strings[i].toLowerCase();
            } else {
                strings[i] = strings[i].toUpperCase();
            }
        }
        return String.join("", strings);
    }
}
