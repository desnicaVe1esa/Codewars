package kyu_7.incrementer.java;

public class Kata {

    public static int[] incrementer(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] + i + 1 > 9 ? (numbers[i] + i + 1) % 10 : numbers[i] + i + 1;
        }
        return result;
    }
}