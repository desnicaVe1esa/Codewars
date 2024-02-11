package kyu_6.mexican_wave.java;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result.add(charUpperCase(str, i));
            }
        }
        return result.toArray(new String[0]);
    }

    public static String charUpperCase(String str, int i) {
        return str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1);
    }
}
