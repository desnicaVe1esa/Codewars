package kyu_7.remove_the_minimum.java;

public class Remover {

    public static int[] removeSmallest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }
        int[] result = new int[numbers.length - 1];
        int copyIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != minIndex) {
                result[copyIndex++] = numbers[i];
            }
        }

        return result;
    }
}