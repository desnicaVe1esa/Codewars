package kyu_6.split_strings.java;

public class StringSplit {
    public static String[] solution(String s) {
        String[] strings = s.length() % 2 == 0 ? new String[s.length() / 2]
                                               : new String[s.length() / 2 + 1];
        for (int i = 0, from = 0, to = 2; i < s.length(); i++, from+= 2, to += 2) {
            if (to > s.length() && s.length() % 2 != 0) {
                strings[i] =  s.substring(from, to - 1) + "_";
                break;
            } else {
                if (to > s.length()) {
                    break;
                }
                strings[i] = s.substring(from, to);
            }
        }
        return strings;
    }
}