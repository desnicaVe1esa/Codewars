package sort_array;

// Сортировка нечетных чисел в массиве в порядке возрастания, игнорирование четных чисел

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        int[] kata = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sortArray(kata);
    }

    public static int[] sortArray(int[] array) {

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array.length; n++) {
                if (array[n] % 2 != 0) {
                    for (int m = n + 1; m < array.length; m++) {
                        if (array[m] % 2 != 0) {
                            if (array[n] > array[m]) {
                                temp = array[n];
                                array[n] = array[m];
                                array[m] = temp;
                            }
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
