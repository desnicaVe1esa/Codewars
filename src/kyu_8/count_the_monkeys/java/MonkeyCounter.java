package kyu_8.count_the_monkeys.java;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
