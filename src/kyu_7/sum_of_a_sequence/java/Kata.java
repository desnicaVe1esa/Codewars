package kyu_7.sum_of_a_sequence.java;

public class Kata {
    public static int sequenceSum(int start, int end, int step) {
        int count = 0;
        for (int i = start; i <= end; i += step) {
            count += i;
        }
        return count;
    }
}