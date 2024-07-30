package kyu_7.switcheroo.java;

public class Switch {
    public static String switcheroo(String x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            result.append(x.charAt(i) == 'a' ? "b"
                    : x.charAt(i) == 'b' ? "a"
                    : x.charAt(i));
        }
        return result.toString();
    }
}