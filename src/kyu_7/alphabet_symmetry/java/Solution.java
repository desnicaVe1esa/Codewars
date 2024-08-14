package kyu_7.alphabet_symmetry.java;

public class Solution{
    public static int[] solve(String[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = getCorrectPosition(arr[i].toLowerCase());
        }
        return result;
    }

    public static int getCorrectPosition(String letters) {
        int result = 0;
        for (int i = 0; i < letters.length(); i++) {
            if (i == letters.charAt(i) - 'a') {
                result++;
            }
        }
        return result;
    }
}