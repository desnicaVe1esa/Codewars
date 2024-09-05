package kyu_8.csv_representation_of_array.java;

import java.util.Arrays;

public class Kata {
    public static String toCsvText(int[][] array){
        StringBuilder result = new StringBuilder();
        for (int[] ints : array) {
            result.append(Arrays.toString(ints)
                            .replace("[", "")
                            .replace("]", "")
                            .replace(" ", ""))
                    .append("\n");
        }
        return result.substring(0, result.length() - 1);
    }
}
