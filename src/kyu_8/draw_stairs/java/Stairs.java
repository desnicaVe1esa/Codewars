package kyu_8.draw_stairs.java;

public class Stairs {
    public static String draw(int n) {
        StringBuilder result = new StringBuilder();
        String space = " ";
        for (int i = 0; i < n; i++) {
            result.append(space.repeat(i)).append("I\n");
        }
        return result.toString().trim();
    }
}
