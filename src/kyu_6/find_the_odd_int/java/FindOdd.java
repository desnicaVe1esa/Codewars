package kyu_6.find_the_odd_int.java;

public class FindOdd {
    public static int findIt(int[] a) {
        int result = 0;
        for (int num : a) {
            result ^= num;
        }
        return result;
    }
}
