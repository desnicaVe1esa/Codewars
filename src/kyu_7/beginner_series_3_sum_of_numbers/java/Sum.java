package kyu_7.beginner_series_3_sum_of_numbers.java;

public class Sum {
    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }
        int result = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                result += i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                result += i;
            }
        }
        return result;
    }
}
