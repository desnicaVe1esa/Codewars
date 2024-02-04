package kyu_7.mumbling.java;

public class Accumul {

    public static String accum(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int c = 0; c < chars.length; c++) {
            for (int i = 0; i <= c; i++) {
                stringBuilder.append(chars[c]);
            }
            stringBuilder.append("-");
        }
        return result(stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString());
    }

    public static String result (String s) {
        String[] parts = s.split("-");
        StringBuilder output = new StringBuilder();
        for (String part : parts) {
            part = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
            output.append(part).append("-");
        }
        output.deleteCharAt(output.length() - 1);
        return output.toString();
    }
}
