package kyu_5.number_of_trailing_zeros_of_n.java;

public class Solution {
    public static int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return n <= 0 ? 0 : count;
    }
}

