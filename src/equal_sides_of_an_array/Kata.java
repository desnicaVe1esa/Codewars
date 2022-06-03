package equal_sides_of_an_array;

// Выводит индекс массива от которого сумма чисел справа и сумма чисел слева равны

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(findEvenIndex(array));
    }

    public static int findEvenIndex(int[] arr) {
        return IntStream.range(0, arr.length)
                .mapToObj(i -> new int[]{Arrays.stream(arr)
                        .limit(i)
                        .reduce(Integer::sum)
                        .orElse(0), Arrays.stream(arr)
                        .skip(i + 1).reduce(Integer::sum)
                        .orElse(0)})
                .map(p -> p[0] == p[1]).toList().indexOf(true);
    }
}

