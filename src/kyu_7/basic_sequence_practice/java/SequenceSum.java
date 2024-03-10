package kyu_7.basic_sequence_practice.java;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        int[] result = new int[Math.abs(n) + 1];
        int num = 0;
        int stepDown;
        for (int i = 0; i <= Math.abs(n); i++) {
            stepDown = i;
            while (stepDown != 0) {
                num += stepDown;
                stepDown--;
            }
            if (n < 0) {
                result[i] = num * -1;
            } else {
                result[i] = num;
            }
            num = 0;
        }
        return result;
    }
}