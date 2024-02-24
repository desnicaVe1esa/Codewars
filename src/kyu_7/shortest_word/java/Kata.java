package kyu_7.shortest_word.java;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int result = words[0].length();
        for (String word : words) {
            if (result > word.length()) {
                result = word.length();
            }
        }
        return result;
    }
}