package kyu_8.exclamation_marks_series_number_6_remove_n_exclamation_marks_in_the_sentence_from_left_to_right.java;

public class Kata {
    public static String remove(String s, int n) {
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '!' && n != 0) {
                chars[i] = '@';
                n--;
            }
            result.append(chars[i]);
        }

        return result.toString().replaceAll("@", "");
    }
}