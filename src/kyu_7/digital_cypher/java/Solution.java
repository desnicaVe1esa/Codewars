package kyu_7.digital_cypher.java;

public class Solution{
    public static int[] encode(String message, int key) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String keyString = String.valueOf(key);
        int[] result = new int[message.length()];
        for (int i = 0, k = 0; i < message.length(); i++, k++) {
            if (k == keyString.length()) {
                k = 0;
            }
            result[i] = (alphabet.indexOf(message.charAt(i)) + 1) + Integer.parseInt(String.valueOf(keyString.charAt(k)));
        }
        return result;
    }
}
