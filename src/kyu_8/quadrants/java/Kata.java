package kyu_8.quadrants.java;

public class Kata {
    public static int quadrant(int x, int y) {
        return x > 0 && y > 0 ? 1 :
                x < 0 && y > 0 ? 2 :
                x < 0 && y < 0 ? 3 : 4;
    }
}