package kyu_7.powers_of_i.java;

public class Kata {
    public static String pofi(int n) {
        if (n % 4 == 0) {
            return "1";
        }else if (n % 4 == 1) {
            return "i";
        }else if (n % 4 == 2) {
            return "-1";
        } else {
            return "-i";
        }
    }
}