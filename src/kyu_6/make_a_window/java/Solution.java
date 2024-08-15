package kyu_6.make_a_window.java;

public class Solution {
    public static String makeAWindow(int num) {
        StringBuilder result = new StringBuilder();
        int width = buildWidth(num).length();

        result.append(buildFrame(width)).append("\n");
        result.append(buildWindow(buildWidth(num), num));
        result.append(buildCenter(width)).append("\n");
        result.append(buildWindow(buildWidth(num), num));
        result.append(buildFrame(width));

        return result.toString();
    }

    public static String buildWidth(int size) {
        StringBuilder width = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            width.append("|")
                    .append(makeWidth(size))
                    .append("|")
                    .append(makeWidth(size))
                    .append("|");
        }
        return width.toString();
    }

    public static String makeWidth(int size) {
        return ".".repeat(Math.max(0, size));
    }

    public static String buildFrame(int width) {
        return "-".repeat(Math.max(0, width));
    }

    public static String buildWindow(String size, int height) {
        StringBuilder window = new StringBuilder();
        for (int i = 0; i < height; i++) {
            window.append(size).append("\n");
        }
        return window.toString();
    }

    public static String buildCenter(int width) {
        StringBuilder center = new StringBuilder();
        center.append("|");
        for (int i = 1; i < width - 2; i++) {
            if (width / 2  == i) {
                center.append("+");
            }
            center.append("-");
        }
        center.append("|");
        return center.toString();
    }
}