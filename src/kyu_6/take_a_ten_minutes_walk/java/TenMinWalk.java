package kyu_6.take_a_ten_minutes_walk.java;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int x = 0;
        int y = 0;
        for (char c : walk) {
            if (c == 'n') {
                y += 1;
            } else if (c == 's'){
                y -= 1;
            } else if (c == 'e') {
                x += 1;
            } else if (c == 'w') {
                x -= 1;
            }
        }
        return x == 0 && y == 0;
    }
}