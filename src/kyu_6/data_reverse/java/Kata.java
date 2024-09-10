package kyu_6.data_reverse.java;

public class Kata {
    public static int[] DataReverse(int[] data) {
        int[] bytes = new int[data.length];
        for (int i = data.length - 8, j = 0; i >= 0; i -= 8, j += 8) {
            System.arraycopy(data, i, bytes, j, 8);
        }
        return bytes;
    }
}
