package kyu_7.love_vs_friendship.java;

public class LoveVsFriendship {
    public static int wordsToMarks (String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            sum += alphabet.indexOf(text.charAt(i)) + 1;
        }
        return sum;
    }
}
