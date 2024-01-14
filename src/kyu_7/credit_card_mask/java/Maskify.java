package kyu_7.credit_card_mask.java;

public class Maskify {
    public static String maskify(String str) {
        char[] chars = str.toCharArray();
        int j = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (j > 4) {
                chars[i] = '#';
            }
            j++;
        }
        str = new String(chars);
        return  str;
    }
}
