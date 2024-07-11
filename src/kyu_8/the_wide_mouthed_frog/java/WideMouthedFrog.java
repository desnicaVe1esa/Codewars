package kyu_8.the_wide_mouthed_frog.java;

public class WideMouthedFrog {
    public static String mouthSize(String animal) {
        return animal.toLowerCase().equals("alligator") ? "small" : "wide";
    }
}