package decode_the_morse_code;

import java.util.Arrays;
import java.util.List;

// Расшифровка азбуки Морзе

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        StringBuilder sb = new StringBuilder();
        String[] morseCodeArr = morseCode.split(" ");
        if (morseCode.length() == 0) return "";
        for (String s : morseCodeArr) {
            switch (s) {
                case "" -> sb.append(" ");
                case "...---..." -> sb.append("SOS");
                case ".-.-.-" -> sb.append(".");
                case "-.-.--" -> sb.append("!");
                case ".-" -> sb.append("A");
                case "-..." -> sb.append("B");
                case "-.-." -> sb.append("C");
                case "-.." -> sb.append("D");
                case "." -> sb.append("E");
                case "..-." -> sb.append("F");
                case "--." -> sb.append("G");
                case "...." -> sb.append("H");
                case ".." -> sb.append("I");
                case ".---" -> sb.append("J");
                case "-.-" -> sb.append("K");
                case ".-.." -> sb.append("L");
                case "--" -> sb.append("M");
                case "-." -> sb.append("N");
                case "---" -> sb.append("O");
                case ".--." -> sb.append("P");
                case "--.-" -> sb.append("Q");
                case ".-." -> sb.append("R");
                case "..." -> sb.append("S");
                case "-" -> sb.append("T");
                case "..-" -> sb.append("U");
                case "...-" -> sb.append("V");
                case ".--" -> sb.append("W");
                case "-..-" -> sb.append("X");
                case "-.--" -> sb.append("Y");
                case "--.." -> sb.append("Z");
            }
        }
        List<String> morseCodeArrResult = Arrays.stream(sb.toString().split(" ")).filter(f -> !f.equals("")).toList();
        StringBuilder result = new StringBuilder();
        for (String s : morseCodeArrResult) {
            result.append(s).append(" ");
        }
        return result.toString().trim();
    }
}
