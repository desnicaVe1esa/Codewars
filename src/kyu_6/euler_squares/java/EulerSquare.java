package kyu_6.euler_squares.java;

public class EulerSquare {
    public static int[][][] createEulerSquare(int n) {
        int[][] n0 = new int[n][n];
        int[][] n1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            n0[i][0] = i + 1;
            n1[i][0] = i + 1;
            int[] temp = new int[n - 1];
            for (int j = 1; j < n; j++) {
                n0[i][j] = (n0[i][j - 1] + 1) % n + 1;
                temp[j - 1] = n0[i][j];
            }

            for (int j = 1; j < n; j++) {
                n1[i][j] = temp[temp.length - j];
            }
        }
        return new int[][][]{n0, n1};
    }
}
