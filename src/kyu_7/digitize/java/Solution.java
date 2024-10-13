package kyu_7.digitize.java;

public class Solution{
    public static int[] digitize(int n){
        int[] result = new int[String.valueOf(n).length()];
        String[] ints = String.valueOf(n).split("");
        for (int i = 0; i < ints.length; i++) {
            result[i] = Integer.parseInt(ints[i]);
        }
        return result;
    }
}
