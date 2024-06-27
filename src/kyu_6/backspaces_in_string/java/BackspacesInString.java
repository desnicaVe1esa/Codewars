package kyu_6.backspaces_in_string.java;

public class BackspacesInString {
    public String cleanString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '#') {
                result.setLength(Math.max(result.length() - 1, 0));
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}