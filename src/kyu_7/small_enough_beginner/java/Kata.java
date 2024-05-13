package kyu_7.small_enough_beginner.java;

public class Kata {
    public static boolean smallEnough(int[] a, int limit) {
        for (int j : a) {
            if (j > limit) {
                return false;
            }
        }
        return true;
    }
}