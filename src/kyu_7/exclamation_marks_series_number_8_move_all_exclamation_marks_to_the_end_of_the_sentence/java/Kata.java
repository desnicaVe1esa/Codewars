package kyu_7.exclamation_marks_series_number_8_move_all_exclamation_marks_to_the_end_of_the_sentence.java;

public class Kata {
    public static String remove(String s) {
        String[] strings = s.split(" ");
        String count = s.replaceAll("[^!]", "");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            stringBuilder.append(string.replaceAll("!", "")).append(" ");
        }
        return stringBuilder.toString().trim() + "!".repeat(count.length());
    }
}
