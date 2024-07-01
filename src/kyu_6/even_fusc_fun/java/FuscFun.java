package kyu_6.even_fusc_fun.java;

public class FuscFun {
    public static int closestEvenFusc(int n) {
        if (fusc(n) % 2 == 0) {
            return n;
        } else {
            return closestEvenFusc(n + 1);
        }
    }

    public static int fusc(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return fusc(n / 2);
        } else {
            return fusc(n / 2) + fusc(n / 2 + 1);
        }
    }
}