package find_the_smallest_integer_in_the_array;

import java.util.Arrays;

// ¬озвращает наименьшее число в массиве
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {
        int n = 0;
        for (int i = 0; i < args.length; i++) {
            n = Arrays.stream(args).min().getAsInt();
        }
        return n;
    }
}
