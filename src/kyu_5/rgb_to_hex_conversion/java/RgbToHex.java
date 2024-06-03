package kyu_5.rgb_to_hex_conversion.java;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        String red = r < 1 ? "00" : r > 255 ? "FF" : Integer.toHexString(r).toUpperCase();
        String green = g < 1 ? "00" : g > 255 ? "FF" :Integer.toHexString(g).toUpperCase();
        String blue = b < 1 ? "00" : b > 255 ? "FF" :Integer.toHexString(b).toUpperCase();
        return (red.length() == 1 ? "0" + red : red) + (green.length() == 1 ? "0" + green : green) + (blue.length() == 1 ? "0" + blue : blue);
    }
}
