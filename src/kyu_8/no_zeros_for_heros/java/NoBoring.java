package kyu_8.no_zeros_for_heros.java;

public class NoBoring {
    public static int noBoringZeros(int n) {
        while (n != 0 && n % 10 == 0) {
            n /= 10;
        }
        return n;
    }
}