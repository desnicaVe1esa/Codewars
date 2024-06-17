package kyu_5.square_matrix_multiplication.java;

public class Kata {

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] += mult(a, b, row, col);
            }
        }
        return result;
    }

    public static int mult(int[][] a, int[][] b, int row, int col) {
        int position = 0;
        for (int i = 0; i < b.length; i++) {
            position += a[row][i] * b[i][col];
        }
        return position;
    }
}