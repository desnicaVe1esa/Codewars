package kyu_7.indexed_capitalization.java;

public class Solution{
    public static String capitalize(String s, int[] ind){
        String[] sArr = s.split("");
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] < s.length()) {
                sArr[ind[i]] = sArr[ind[i]].toUpperCase();
            }
        }
        return String.join("", sArr);
    }
}
