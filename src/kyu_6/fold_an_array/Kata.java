package kyu_6.fold_an_array;

// Сложить правые от центра элементы массива с левыми от центра. Пример:
//        * 1 runs
//        * [1,2,3,4,5] -> [6,6,3]
//        *
//        * A little visualization (NOT for the algorithm but for the idea of folding):
//        *
//        * Step 1         Step 2         Step 3       Step 4       Step5
//        *                      5/           5|         5\
//        *                     4/            4|          4\
//        * 1 2 3 4 5      1 2 3/         1 2 3|       1 2 3\       6 6 3
//        * ----*----      ----*          ----*        ----*        ----*
//        *
//        *
//        * 2 runs
//        * [1,2,3,4,5] -> [9,6]

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(foldArray(input, 1)));
    }

    public static int[] foldArray(int[] array, int runs) {
        int[] f = Arrays.copyOfRange(array, 0, (array.length + 1) / 2);
        for (int i = 0; i < array.length / 2; i++) {
            f[i] += array[array.length - 1 - i];
        }
        return f.length == 1 | runs == 1 ? f : foldArray(f, --runs);
    }
}
