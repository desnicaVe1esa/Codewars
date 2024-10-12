package kyu_7.to_leet_speak.java;

import java.util.HashMap;
import java.util.Map;

class Kata {

    static String toLeetSpeak(final String speak) {
        Map<String, String> rules = new HashMap<>();
        rules.put("A", "@");
        rules.put("B", "8");
        rules.put("C", "(");
        rules.put("D", "D");
        rules.put("E", "3");
        rules.put("F", "F");
        rules.put("G", "6");
        rules.put("H", "#");
        rules.put("I", "!");
        rules.put("J", "J");
        rules.put("K", "K");
        rules.put("L", "1");
        rules.put("M", "M");
        rules.put("N", "N");
        rules.put("O", "0");
        rules.put("P", "P");
        rules.put("Q", "Q");
        rules.put("R", "R");
        rules.put("S", "$");
        rules.put("T", "7");
        rules.put("U", "U");
        rules.put("V", "V");
        rules.put("W", "W");
        rules.put("X", "X");
        rules.put("Y", "Y");
        rules.put("Z", "2");
        rules.put(" ", " ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < speak.length(); i++) {
            result.append(rules.getOrDefault(speak.charAt(i) + "", speak.charAt(i) + ""));
        }
        return result + "";
    }
}
