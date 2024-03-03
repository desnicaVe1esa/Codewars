package kyu_7.count_the_divisors_of_a_number.java;

public class FindDivisor {
    public long numberOfDivisors(int n) {
        int count = 0;
        int divisor = 1;
        for (int i = 0; i <= n; i++) {
            if (n % divisor == 0) {
                count++;
            }
            divisor++;
        }
        return count;
    }
}