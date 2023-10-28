package break_camelcase.java;

public class Solution {
    public static String camelCase(String input) {
        if (input.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char[] arr = input.toCharArray();
        for (char c : arr) {
            if (Character.isUpperCase(c)) {
                result.append(' ');
            }
            result.append(c);
        }
        return result.toString();
    }
}
