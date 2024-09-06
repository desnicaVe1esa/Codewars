package kyu_7.remove_duplicate_words.java;

import java.util.*;

class Solution{
    public static String removeDuplicateWords(String s){
        Set<String> result = new LinkedHashSet<>(List.of(s.split(" ")));
        return String.join(" ", result);
    }
}
