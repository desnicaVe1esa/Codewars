package kyu_6.pow_a_plus_b_n.java;

import java.math.BigInteger;

public class Kata {
    public static String formula(int m) {
        StringBuilder result = new StringBuilder();
        if (m == 0) {
            return "1";
        } else if (m == 1) {
            return "a+b";
        } else if (m == 2) {
            return "a^2+2ab+b^2";
        }
        BigInteger coefficient = BigInteger.ONE;
        result.append("a^").append(Math.abs(m));
        for (int i = 1; i < m; i++) {
            coefficient = coefficient.multiply(BigInteger.valueOf(m - i + 1));
            coefficient = coefficient.divide(BigInteger.valueOf(i));
            result
                    .append("+")
                    .append(coefficient)
                    .append("a")
                    .append(m - i > 1 ? "^" + (m - i) : "")
                    .append("b")
                    .append(i > 1 ? "^" + i : "");
        }
        result.append("+b^").append(Math.abs(m));
        return m < 0 ? "1/(" + formula(-m) + ")" : result.toString();
    }
}