package descending_order;

// Поменять местами цыфры числа так, чтобы вывод был от большего к меньшему

import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        String numToString = String.valueOf(num);
        int[] arr = new int[numToString.length()];
        String s = "";
        for (int i = 0; i < numToString.length(); i++) {
            arr[i] = Integer.parseInt(numToString.charAt(i) + "");
        }
        int max;
        int n;
        for (int i = 0; i < arr.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            if (max != i) {
                n = arr[max];
                arr[max] = arr[i];
                arr[i] = n;
            }
        }
        for (int i = 0; i < numToString.length(); i++) {
            s = s + arr[i];
        }
        return Integer.parseInt(s);
    }
}
