package kyu_8.find_multiples_of_a_number.java;

public class Multiples {
    public static int[] find(int base, int limit) {
        int[] result = new int[limit / base];
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += base;
            result[i] = sum;
        }
        return result;
    }
}