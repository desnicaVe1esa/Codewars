package kyu_8.find_nearest_square_number.java;

public class CodeWarsMath {
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)),2);
    }
}