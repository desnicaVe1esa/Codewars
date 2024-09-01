package kyu_8.color_ghost.java;

import java.util.Random;

public class Ghost {
    private final String color;

    public Ghost() {
        Random random = new Random();
        String[] colors = {"white", "yellow", "purple", "red"};
        int result = random.nextInt(colors.length);
        color = colors[result];
    }
    public String getColor() {
        return this.color;
    }
}