package kyu_4.snail.java;


public class Snail {
    public static int[] snail(int[][] array) {
        if (array[0].length == 0) {
            return new int[0];
        }

        int n = array.length;
        int[] result = new int[n * n];
        int x = 0, y = 0;
        int xStep = 1, yStep = 0;

        for (int i = 0; i < result.length; ++i) {
            result[i] = array[y][x];
            array[y][x] = -1;

            x += xStep;
            y += yStep;

            if (xStep != 0 && (x < 0 || x >= n || array[y][x] == -1)) {
                x += -xStep;
                y += xStep;
                yStep = xStep;
                xStep = 0;
            } else if (yStep != 0 && (y < 0 || y >= n || array[y][x] == -1)) {
                x += -yStep;
                y += -yStep;
                xStep = -yStep;
                yStep = 0;
            }
        }

        return result;
    }
}