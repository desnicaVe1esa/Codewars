package isograms;

import java.util.Arrays;

public class Solution {
    public static boolean isIsogram(String str) {
        char[] a = str.toLowerCase().toCharArray();
        Arrays.sort(a);
        for (int i = 0; i < str.length() - 1; i++) {
            if (a[i] == a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
