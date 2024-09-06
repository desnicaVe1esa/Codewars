package kyu_7.sum_of_triangular_numbers.java;

public class Kata {
    public static int sumTriangularNumbers(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i * (i + 1) / 2;
        }
        return result;
    }
}
