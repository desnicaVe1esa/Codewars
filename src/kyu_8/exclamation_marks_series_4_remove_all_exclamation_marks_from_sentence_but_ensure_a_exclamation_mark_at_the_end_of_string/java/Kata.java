package kyu_8.exclamation_marks_series_4_remove_all_exclamation_marks_from_sentence_but_ensure_a_exclamation_mark_at_the_end_of_string.java;

class Kata {
    static String remove(String s) {
        return s.replaceAll("!+", "") + "!";
    }
}
