package kyu_7.the_highest_profit_wins;

// Выводит минимальный и максимальный элемент массива

import java.util.Arrays;

class MinMax {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1,2,3,4,5})));
    }

    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}
