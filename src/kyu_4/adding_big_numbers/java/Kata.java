package kyu_4.adding_big_numbers.java;

public class Kata {
    public static String add(String a, String b) {
        StringBuilder preparedResult = new StringBuilder();
        int x = 0;
        int i = 0;
        int n = Math.max(a.length(), b.length());
        while (i < n || x > 0) {
            if (i < a.length()) {
                x += a.charAt(a.length() - 1 - i) - '0';
            }
            if (i < b.length()) {
                x += b.charAt(b.length() - 1 - i) - '0';
            }
            preparedResult.append(x % 10);
            x = x / 10;
            i++;
        }
        String result = preparedResult.reverse().toString();
        return result.charAt(0) == '0' && result.length() > 1 ? result.substring(1) : result;
    }
}