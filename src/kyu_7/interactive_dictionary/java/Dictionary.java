package kyu_7.interactive_dictionary.java;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> entries;
    public Dictionary() {
        entries = new HashMap<>();
    }

    public void newEntry(String word, String definition) {
        entries.put(word, definition);
    }

    public String look(String word) {
        return entries.getOrDefault(word, "Cant find entry for " + word);
    }
}
