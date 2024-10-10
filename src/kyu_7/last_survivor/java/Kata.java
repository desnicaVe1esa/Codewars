package kyu_7.last_survivor.java;

public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder result = new StringBuilder(letters);
        for (int i : coords) {
            result.deleteCharAt(i);
        }
        return result.toString();
    }
}
