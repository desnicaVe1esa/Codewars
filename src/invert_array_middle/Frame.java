package invert_array_middle;

// Создает двумерный массив размером n * n, затем инвертировать его средний элемент из строки в столбец.
public class Frame {
    public int[][] invertArrayMiddle(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                result[i][j] = (i + 1) + n * j;
            }
        for (int i = 1; i < n - 1; i++)
            for (int j = i + 1; j < n - 1; j++) {
                int temp = result[i][j];
                result[i][j] = result[j][i];
                result[j][i] = temp;
            }
        return result;
    }
}
