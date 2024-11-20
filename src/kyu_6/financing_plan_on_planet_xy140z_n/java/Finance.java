package kyu_6.financing_plan_on_planet_xy140z_n.java;

import java.math.BigInteger;

public class Finance {

    public static BigInteger finance(int n) {
        BigInteger sum = BigInteger.ZERO;
        int iteration = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = iteration; j <= iteration + n - i; j++) {
                sum = sum.add(new BigInteger(j + ""));
            }
            iteration += 2;
        }
        return sum;
    }
}
