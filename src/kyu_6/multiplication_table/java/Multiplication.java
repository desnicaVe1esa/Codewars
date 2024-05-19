package kyu_6.multiplication_table.java;

public class Multiplication {
    public static int[][] multiplicationTable(int n) {
        int[][] result = new int[n][n];
        int up = 1;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (j + 1) * up;
            }
            up++;
        }
        return result;
    }
}