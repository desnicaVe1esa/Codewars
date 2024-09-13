package kyu_7.consecutive_letters.java;

import java.util.Arrays;

class Solution{
    public static boolean solve(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1) {
                if (chars[i + 1] - chars[i] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
