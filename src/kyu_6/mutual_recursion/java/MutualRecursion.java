package kyu_6.mutual_recursion.java;

public class MutualRecursion {
    public static int f(int n) {
        return n == 0 ? 1 : n - m(f(n - 1));
    }

    public static int m(int n) {
        return n == 0 ? 0 : n - f(m(n - 1));
    }
}
