package kyu_7.esp_cards.java;

public class Dinglemouse {

    public static String nameTheShape(final char[][] card) {
        return card[2][10] != ' ' ? "diamond"
                : card[3][5]  != ' ' ? "square"
                : "circle";
    }
}