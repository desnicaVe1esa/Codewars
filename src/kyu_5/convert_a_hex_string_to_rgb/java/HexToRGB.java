package kyu_5.convert_a_hex_string_to_rgb.java;

import java.util.HashMap;

public class HexToRGB {
    public static HashMap<String, Integer> hexStringToRGB(String hex) {
        String replaceString = hex.replaceAll("#", "");
        String[] hexColors = new String[3];
        int start = 0;
        int end = 2;
        for (int i = 0; i < 3; i++) {
            hexColors[i] = replaceString.substring(start, end);
            start += 2;
            end += 2;
        }
        return getColors(hexColors);
    }

    public static HashMap<String, Integer> getColors(String[] hexColors) {
        HashMap<String, Integer> result = new HashMap<>();
        String digits = "0123456789ABCDEF";
        String[] rgb = new String[]{"r", "g", "b"};
        int val = 0;
        for (int i = 0; i < hexColors.length; i++) {
            for (int j = 0; j < hexColors[i].length(); j++) {
                char c = hexColors[i].toUpperCase().charAt(j);
                int d = digits.indexOf(c);
                val = 16 * val + d;
            }
            result.put(rgb[i], val);
            val = 0;
        }
        return result;
    }
}