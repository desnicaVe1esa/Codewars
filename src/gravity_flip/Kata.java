package gravity_flip;

import java.util.Arrays;

// Сортировка массива в зависимости от указанного параметра.
// 'R' - слева направо;
// 'L' - справа налево;

public class Kata {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 2};
        System.out.println(Arrays.toString(flip('R', array)));
    }

    public static int[] flip(char dir, int[] arr) {
        int tmp = 0;

        if (dir == 'R') {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] < arr[j-1]) {
                        tmp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        } else if (dir == 'L') {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] > arr[j-1]) {
                        tmp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
        return arr;
    }
}