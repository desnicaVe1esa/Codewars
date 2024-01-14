package kyu_6.equal_sides_of_an_array;

// Выводит индекс массива от которого сумма чисел справа и сумма чисел слева равны

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static void main(String[] args) {
        int[] array = {1,100,50,-51,1,1};
        System.out.println(findEvenIndex(array));
    }

    // Через стримы
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

    // Через циклы
//    public static int findEvenIndex(int[] arr) {
//        int sumOfLeftSide = 0;
//        int sumOfRightSide = 0;
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sumOfLeftSide += arr[i];
//            for (int j = arr.length - 1; j >= 0; j--) {
//                sumOfRightSide += arr[j];
//                if (sumOfLeftSide == sumOfRightSide && i + 2 == j) {
//                    result = i + 1;
//                } else if (j == 0) {
//                    sumOfRightSide = 0;
//                }
//            }
//        }
//        return result == 0 ? -1 : result;
//    }
//}
