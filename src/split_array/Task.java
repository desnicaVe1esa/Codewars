package split_array;

import java.util.Arrays;

// Соединение двух массивов и их сортировка в порядке возрастания

public class Task {
    public static void main(String[] args) {
        int[] array1 = {4, 2, 7, 9, 3, 12};
        int[] array2 = {5, 1, 6, 11, 10, 8};
        System.out.println(Arrays.toString(splitArray(array1, array2)));
    }

    public static int[] splitArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }

        for (int i = 0; i < b.length; i++) {
            c[count++] = b[i];
        }
        Arrays.sort(c);
        return c;
    }
}
