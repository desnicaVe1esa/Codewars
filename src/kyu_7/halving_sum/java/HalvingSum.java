package kyu_7.halving_sum.java;

public class HalvingSum {
    int halvingSum(int n) {
        int result = n;
        int divisor = 2;
        for (; divisor <= n; divisor *= 2) {
            result += n / divisor;
        }
        return result;
    }
}
