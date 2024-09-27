package kyu_5.string_incrementer.java;

public class Kata {
    public static String incrementString(String str) {
        char[] chars = str.toCharArray();
        int i = chars.length - 1;
        for (; i >= 0; i--) {
            if (!Character.isDigit(chars[i])) {
                break;
            }
            if (chars[i] == '9'){
                chars[i] = '0';
            } else {
                chars[i]++;
                return new String(chars);
            }
        }
        str = new String(chars);
        return str.substring(0, ++i) + "1" + str.substring(i);
    }
}