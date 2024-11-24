package kyu_6.html_complementary_color.java;

public class HTMLComplementaryColor {

    public static String getReversedColor(String hexColor) {
        if (hexColor == null || hexColor.length() > 6 || hexColor.toLowerCase().replaceAll("[g-z]", "Z").contains("Z")) {
            throw new IllegalArgumentException();
        }
        String prepared = "000000".substring(hexColor.length()) + hexColor;
        int r = 255 - Integer.valueOf( prepared.substring( 0, 2 ), 16 );
        int g = 255 - Integer.valueOf( prepared.substring( 2, 4 ), 16 );
        int b = 255 - Integer.valueOf( prepared.substring( 4, 6 ), 16 );

        return String.format("#%02X%02X%02X", r, g, b);
    }
}
