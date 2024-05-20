package kyu_7.partial_word_searching.java;

import java.util.ArrayList;
import java.util.List;

class WordSearch {
    static String[] findWord(String x, String[] y) {
        List<String> strings = new ArrayList<>();
        for (String s : y) {
            if (s.toLowerCase().contains(x)) {
                strings.add(s);
            }
        }
        return strings.toArray(new String[0]).length != 0 ? strings.toArray(new String[0]) : new String[]{"Empty"};
    }
}