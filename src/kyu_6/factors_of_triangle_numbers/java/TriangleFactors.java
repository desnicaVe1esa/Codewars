package kyu_6.factors_of_triangle_numbers.java;

public class TriangleFactors {
    public int calculate(int n) {
        int result = 1;
        for (int i = 2; sum(result) <= n; i++) {
            result += i;
        }
        return result;
    }

    public int sum(int n) {
        int result = 0, i = 1;
        while (i * i < n) {
            if (n % i++ == 0) {
                result += 2;
            }
        }
        return result + (i * i == n ? 1 : 0);
    }
}


