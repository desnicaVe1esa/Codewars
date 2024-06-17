package kyu_7.a_rule_of_divisibility_by_7.java;

class DivSeven {
    public static long[] seven(long m) {
        long steps = 0;
        while (m > 99) {
            steps++;
            m = m / 10 - 2 * (m % 10);
        }
        return new long[]{m, steps};
    }
}