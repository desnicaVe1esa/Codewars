package kyu_6.matrix_addition.java;

public class Kata {
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int sum = a[i][j] + b[i][j];
                result[i][j] = sum;
            }
        }
        return result;
    }
}
