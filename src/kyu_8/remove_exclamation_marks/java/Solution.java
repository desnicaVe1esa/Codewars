package kyu_8.remove_exclamation_marks.java;

class Solution {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}