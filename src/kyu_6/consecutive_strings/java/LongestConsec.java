package kyu_6.consecutive_strings.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 ||
                k <= 0 ||
                k > strarr.length) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        List<String> total = new ArrayList<>();
        for (int i = 0; i < strarr.length; ) {
            stringBuilder.append(strarr[i]);
            i++;
            if (i == k) {
                total.add(stringBuilder.toString());
                strarr = Arrays.copyOfRange(strarr, 1, strarr.length);
                i = 0;
                stringBuilder = new StringBuilder();
            }
        }
        String compare = total.get(0);
        for (String str : total) {
            if (str.length() > compare.length()) {
                compare = str;
            }
        }
        return compare;
    }
}