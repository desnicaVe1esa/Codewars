package kyu_8.to_square_root_or_not_to_square_root.java;

public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                result[i] = (int) Math.sqrt(array[i]);
            } else {
                result[i] = (int) Math.pow(array[i], 2);
            }
        }
        return result;
    }
}
