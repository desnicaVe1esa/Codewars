package kyu_7.remove_consecutive_duplicate_words.java;

public class Kata {
    public static String removeConsecutiveDuplicates(String s){
        StringBuilder result = new StringBuilder();
        String[] strings = s.split(" ");
        result.append(strings[0]).append(" ");
        for (int i = 0; i < strings.length; i++) {
            if (i > 0 && !strings[i].equals(strings[i - 1])) {
                result.append(strings[i]).append(" ");
            }
        }
        return result.toString().trim();
    }
}
