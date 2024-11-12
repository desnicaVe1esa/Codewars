package kyu_6.a_rule_of_divisibility_by_13.java;

class Thirteen {

    public static long thirt(long n) {
        long[] rules = new long[]{1, 10, 9, 12, 3, 4};
        long result = 0;
        long m = n;
        int i = 0;
        while (m > 0) {
            result += (m % 10) * rules[i++ % 6];
            m /= 10;
        }
        return result == n ? result : thirt(result);
    }
}
