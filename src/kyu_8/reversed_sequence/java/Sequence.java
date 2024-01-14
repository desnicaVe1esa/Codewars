package kyu_8.reversed_sequence.java;

public class Sequence {
    public static int[] reverse(int n){
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] += n;
            n--;
        }
        return result;
    }
}
