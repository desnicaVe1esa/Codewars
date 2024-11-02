package kyu_5.rot13.java;

class Solution {

    public static String rot13(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (97 <= letter && letter <= 122) {
                letter = letter + 13 > 122 ? (char) (96 + (letter + 13 - 122)) : (char) (letter + 13);
            } else if (65 <= letter && letter <= 90) {
                letter = letter + 13 > 90 ? (char) (64 + (letter + 13 - 90)) : (char) (letter + 13);
            }
            result.append(letter);
        }
        return result.toString();
    }
}
