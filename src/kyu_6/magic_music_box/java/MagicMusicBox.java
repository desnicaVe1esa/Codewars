package kyu_6.magic_music_box.java;

import java.util.ArrayList;
import java.util.List;

public class MagicMusicBox {

    public static String[] magicMusicBox(String[] words) {
        String[] notes = new String[]{"DO", "RE", "MI", "FA", "SOL", "LA", "SI"};
        List<String> result = new ArrayList<>();
        int notesPoint = 0;
        int wordsPoint = 0;
        int exit = 0;
        while (exit < words.length) {
            if (wordsPoint > words.length - 1) {
                wordsPoint = 0;
            }
            if (notesPoint > notes.length - 1) {
                notesPoint = 0;
            }
            if (words[wordsPoint].contains(notes[notesPoint]) && !result.contains(words[wordsPoint])) {
                result.add(words[wordsPoint]);
                notesPoint++;
                wordsPoint++;
                exit = 0;
            } else {
                wordsPoint++;
                exit++;
            }
        }
        return result.toArray(new String[0]);
    }
}
