package kyu_7.youre_a_square.java;

public class Square {
    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        }
        double sqrtN = Math.sqrt(n);
        return sqrtN == (long) sqrtN;
    }
}